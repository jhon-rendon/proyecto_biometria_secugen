/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biometria;

import SecuGen.FDxSDKPro.jni.JSGFPLib;
import SecuGen.FDxSDKPro.jni.SGDeviceInfoParam;
import SecuGen.FDxSDKPro.jni.SGFDxDeviceName;
import SecuGen.FDxSDKPro.jni.SGFDxErrorCode;
import SecuGen.FDxSDKPro.jni.SGFingerInfo;
import SecuGen.FDxSDKPro.jni.SGFingerPosition;
import SecuGen.FDxSDKPro.jni.SGImpressionType;
import SecuGen.FDxSDKPro.jni.SGPPPortAddr;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;


/**
 *
 * @author Jhon Rendon
 */
public class Secugen {
    
     //Private instance variables
    private long deviceName;
    private long devicePort;
    public JSGFPLib fplib = null;
    private long ret;
    private boolean bLEDOn;
    public boolean deviceActivo = false;
    private byte[] regMin1 = new byte[400];
    private byte[] regMin2 = new byte[400];
    private byte[] vrfMin  = new byte[400];
    private SGDeviceInfoParam deviceInfo = new SGDeviceInfoParam();
    private BufferedImage imgRegistration1;
    private BufferedImage imgRegistration2;
    private BufferedImage imgVerification;
    private boolean r1Captured = false;
    private boolean r2Captured = false;
    private boolean v1Captured = false;
    private ImageIcon imgIcon1;
    private String msgError = null;
    
    public ImageIcon getImageIcon1(){
         
         return this.imgIcon1;
    }
    
    public byte[] getRegMin1(){
        
        return this.regMin1;
    }
    
    
     public String getMsgError() {
        return msgError;
    }

    
     
      public boolean openDevice() {

        this.deviceName = SGFDxDeviceName.SG_DEV_AUTO;
        fplib = new JSGFPLib();
        ret = fplib.Init(this.deviceName);

        if ((fplib != null) && (ret == SGFDxErrorCode.SGFDX_ERROR_NONE)) {
            System.out.println("SGFPLib Initialization Success");
            this.devicePort = SGPPPortAddr.AUTO_DETECT;

            ret = fplib.OpenDevice(0);
            if (ret == SGFDxErrorCode.SGFDX_ERROR_NONE) {
                System.out.println("OpenDevice() Success [" + ret + "]");
                ret = fplib.GetDeviceInfo(deviceInfo);
                if (ret == SGFDxErrorCode.SGFDX_ERROR_NONE) {
                    imgRegistration1 = new BufferedImage(deviceInfo.imageWidth, deviceInfo.imageHeight, BufferedImage.TYPE_BYTE_GRAY);
                    this.deviceActivo = true;
                } else {
                    System.out.println("GetDeviceInfo() Error [" + ret + "]");
                    msgError = " Error al obtener la información del Lector " + ret;
                    this.deviceActivo = false;
                }
                

            } else {
                System.out.println("OpenDevice() Error [" + ret + "]");
                msgError = " No se ha detectado el Lector (Codigo error[ " + ret+ " ]";
                this.deviceActivo = false;
            }
        } else {
            //this.jLabelStatus.setText("JSGFPLib Initialization Failed");
            System.out.println("JSGFPLib Initialization Failed");
            msgError = " No se ha detectado el Lector";
            this.deviceActivo = false;
        }
        return this.deviceActivo;
    }
       
       public void closeDevice(){
           fplib.CloseDevice();
       }
       
       
        public boolean getDeviceInfo() {
        long iError;

        iError = fplib.GetDeviceInfo(deviceInfo);
        if (ret == SGFDxErrorCode.SGFDX_ERROR_NONE) {
            System.out.println("GetDeviceInfo() Success");
            System.out.println("Serial: " + new String(deviceInfo.deviceSN()));
            System.out.println("ID: " + new String(Integer.toString(deviceInfo.deviceID)));
            /*this.jLabelStatus.setText( "GetDeviceInfo() Success");
            this.jTextFieldSerialNumber.setText(new String(deviceInfo.deviceSN()));
            this.jTextFieldBrightness.setText(new String(Integer.toString(deviceInfo.brightness)));
            this.jTextFieldContrast.setText(new String(Integer.toString((int)deviceInfo.contrast)));
            this.jTextFieldDeviceID.setText(new String(Integer.toString(deviceInfo.deviceID)));
            this.jTextFieldFWVersion.setText(new String(Integer.toHexString(deviceInfo.FWVersion)));
            this.jTextFieldGain.setText(new String(Integer.toString(deviceInfo.gain)));
            this.jTextFieldImageDPI.setText(new String(Integer.toString(deviceInfo.imageDPI)));
            this.jTextFieldImageHeight.setText(new String(Integer.toString(deviceInfo.imageHeight)));
            this.jTextFieldImageWidth.setText(new String(Integer.toString(deviceInfo.imageWidth)));*/
            return true;
        } else {
            System.out.println("GetDeviceInfo() Error : " + iError);
        }
        msgError = "Error al obtener la información del dispositivo" + iError;

        return false;

    }
        
        
     public Boolean capturaHuella() {

        int[] quality = new int[1];
        byte[] imageBuffer1 = ((java.awt.image.DataBufferByte) imgRegistration1.getRaster().getDataBuffer()).getData();
        long iError = SGFDxErrorCode.SGFDX_ERROR_NONE;
        boolean valid = false;

        iError = fplib.GetImageEx(imageBuffer1, 5 * 1000, 0, 50);
        fplib.GetImageQuality(deviceInfo.imageWidth, deviceInfo.imageHeight, imageBuffer1, quality);
        SGFingerInfo fingerInfo = new SGFingerInfo();
        fingerInfo.FingerNumber = SGFingerPosition.SG_FINGPOS_LI;
        fingerInfo.ImageQuality = quality[0];
        fingerInfo.ImpressionType = SGImpressionType.SG_IMPTYPE_LP;
        fingerInfo.ViewNumber = 1;

        if (iError == SGFDxErrorCode.SGFDX_ERROR_NONE) {
            this.imgIcon1 = new ImageIcon(imgRegistration1.getScaledInstance(130, 150, Image.SCALE_DEFAULT));

            if (quality[0] == 0) {

                System.out.println("GetImageEx() Success [" + ret + "] but image quality is [" + quality[0] + "]. Please try again");
                this.msgError = "GetImageEx() Success [" + ret + "] but image quality is [" + quality[0] + "]. Please try again";
            } else {
                System.out.println("GetImageEx() Success [" + ret + "]");
                this.msgError = "GetImageEx() Success [" + ret + "]";

                iError = fplib.CreateTemplate(fingerInfo, imageBuffer1, regMin1);
                if (iError == SGFDxErrorCode.SGFDX_ERROR_NONE) {
                    System.out.println("Huella Capturada exitosamente");
                    this.msgError = "Huella Capturada exitosamente";
                    valid = true;
                } else {
                    System.out.println("CreateTemplate() Error : " + iError);
                }
                msgError = "Error al crear la plantilla " + iError;
            }
        } else {
            valid = false;
            System.out.println("GetImageEx() Error : " + iError);
            msgError = "Error al capturar la Huella.  GetImageEx() Error : " + iError;
        }

        return valid;
    }
    
    
     
      public boolean verificarHuella(byte[] verifyHuella, byte[] huellaCapturada) {

        /**
         * ****Crear plantilla desde la base de datos ***
         */
        long iError = SGFDxErrorCode.SGFDX_ERROR_NONE;
        long secuLevel = (long) 5;
        //boolean valid = false;

        try {
            boolean[] matched = new boolean[1];
            int[] matchScore = new int[1];

            System.out.println("Comparando Huellas");
            iError = fplib.MatchTemplate(huellaCapturada, verifyHuella, secuLevel, matched);

            if (iError == SGFDxErrorCode.SGFDX_ERROR_NONE) {
                matchScore[0] = 0;
                iError = fplib.GetMatchingScore(huellaCapturada, verifyHuella, matchScore);

                if (iError == SGFDxErrorCode.SGFDX_ERROR_NONE) {
                    if (matched[0]) {
                        System.out.println("Las huellas coinciden");
                        msgError = "Las huellas comparadas coinciden";
                        return true;
                    } else {
                        System.out.println("Las huellas No coinciden Matching Score " + matchScore[0]);
                        msgError = "Las huella no coincide Matching Score " + matchScore[0];
                        return false;
                    }
                }

            } else {
                System.out.println("Las huellas No coinciden");
                msgError = "Error al validar la huella ";
                return false;
            }

        } catch (Exception ex) {
            System.out.println(" Error " + ex);
            msgError = " Se presenta error al comparar las huellas "+ex ;
        }

        return false;
    }
}
