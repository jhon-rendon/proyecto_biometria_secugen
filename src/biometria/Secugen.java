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
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import javax.swing.ImageIcon;
import negocio.PersonaControl;

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
    
    public ImageIcon getImageIcon1(){
         
         return this.imgIcon1;
    }
    
    public byte[] getRegMin1(){
        
        return this.regMin1;
    }
    
    
    
       public void openDevice() {
        
        this.deviceName = SGFDxDeviceName.SG_DEV_AUTO;
        fplib = new JSGFPLib();
        
        ret = fplib.Init(this.deviceName);
        if ((fplib != null) && (ret  == SGFDxErrorCode.SGFDX_ERROR_NONE))
        {
            System.out.println("SGFPLib Initialization Success");
            //this.jLabelStatus.setText("JSGFPLib Initialization Success");
            this.devicePort = SGPPPortAddr.AUTO_DETECT;
            
            ret = fplib.OpenDevice(0);
            if (ret == SGFDxErrorCode.SGFDX_ERROR_NONE)
            {
                //this.jLabelStatus.setText("OpenDevice() Success [" + ret + "]");   
                System.out.println("OpenDevice() Success [" + ret + "]");
                ret = fplib.GetDeviceInfo(deviceInfo);
                if (ret == SGFDxErrorCode.SGFDX_ERROR_NONE)
                {
                    /*this.jTextFieldSerialNumber.setText(new String(deviceInfo.deviceSN()));
                    this.jTextFieldBrightness.setText(new String(Integer.toString(deviceInfo.brightness)));
                    this.jTextFieldContrast.setText(new String(Integer.toString((int)deviceInfo.contrast)));
                    this.jTextFieldDeviceID.setText(new String(Integer.toString(deviceInfo.deviceID)));
                    this.jTextFieldFWVersion.setText(new String(Integer.toHexString(deviceInfo.FWVersion)));
                    this.jTextFieldGain.setText(new String(Integer.toString(deviceInfo.gain)));
                    this.jTextFieldImageDPI.setText(new String(Integer.toString(deviceInfo.imageDPI)));
                    this.jTextFieldImageHeight.setText(new String(Integer.toString(deviceInfo.imageHeight)));
                    this.jTextFieldImageWidth.setText(new String(Integer.toString(deviceInfo.imageWidth)));
                    imgRegistration1 = new BufferedImage(deviceInfo.imageWidth, deviceInfo.imageHeight, BufferedImage.TYPE_BYTE_GRAY);
                    imgRegistration2 = new BufferedImage(deviceInfo.imageWidth, deviceInfo.imageHeight, BufferedImage.TYPE_BYTE_GRAY);
                    imgVerification = new BufferedImage(deviceInfo.imageWidth, deviceInfo.imageHeight, BufferedImage.TYPE_BYTE_GRAY);
                    this.enableControls();*/
                    imgRegistration1 = new BufferedImage(deviceInfo.imageWidth, deviceInfo.imageHeight, BufferedImage.TYPE_BYTE_GRAY);
                }
                else
                    //this.jLabelStatus.setText("GetDeviceInfo() Error [" + ret + "]");
                    System.out.println("GetDeviceInfo() Error [" + ret + "]");
            }
            else
                //this.jLabelStatus.setText("OpenDevice() Error [" + ret + "]");    
                System.out.println("OpenDevice() Error [" + ret + "]");
        }
        else
            //this.jLabelStatus.setText("JSGFPLib Initialization Failed");
            System.out.println("JSGFPLib Initialization Failed");
        
        
    }
       
       public void closeDevice(){
           fplib.CloseDevice();
       }
       
       
        public void getDeviceInfo () {//GEN-FIRST:event_jButtonGetDeviceInfoActionPerformed
        long iError;

        iError = fplib.GetDeviceInfo(deviceInfo);
        if (ret == SGFDxErrorCode.SGFDX_ERROR_NONE)
        {   
            System.out.println("GetDeviceInfo() Success");
            System.out.println("Serial: "+new String(deviceInfo.deviceSN()));
            System.out.println("ID: "+new String(Integer.toString(deviceInfo.deviceID)));
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
        }
         else
           // this.jLabelStatus.setText( "GetDeviceInfo() Error : " + iError);
            System.out.println( "GetDeviceInfo() Error : " + iError);
         
    }//GEN-LAST:event_jButtonGetDeviceInfoActionPerformed
        
    public void capturaHuella() {//GEN-FIRST:event_jButtonCaptureR2ActionPerformed
        
        int[] quality = new int[1];
        byte[] imageBuffer1 = ((java.awt.image.DataBufferByte) imgRegistration1.getRaster().getDataBuffer()).getData();
        long iError = SGFDxErrorCode.SGFDX_ERROR_NONE;
         
        iError = fplib.GetImageEx(imageBuffer1,5 * 1000, 0, 50);        
        fplib.GetImageQuality(deviceInfo.imageWidth, deviceInfo.imageHeight, imageBuffer1, quality);
        //this.jProgressBarR2.setValue(quality[0]);
        SGFingerInfo fingerInfo = new SGFingerInfo();
        fingerInfo.FingerNumber = SGFingerPosition.SG_FINGPOS_LI;
        fingerInfo.ImageQuality = quality[0];
        fingerInfo.ImpressionType = SGImpressionType.SG_IMPTYPE_LP;
        fingerInfo.ViewNumber = 1;

        if (iError == SGFDxErrorCode.SGFDX_ERROR_NONE)
        {            
            //this.jLabelRegisterImage2.setIcon(new ImageIcon(imgRegistration2.getScaledInstance(130,150,Image.SCALE_DEFAULT)));
            this.imgIcon1 = new ImageIcon(imgRegistration1.getScaledInstance(130,150,Image.SCALE_DEFAULT));
            
            if (quality[0] == 0)
               // this.jLabelStatus.setText("GetImageEx() Success [" + ret + "] but image quality is [" + quality[0] + "]. Please try again"); 
                 System.out.println("GetImageEx() Success [" + ret + "] but image quality is [" + quality[0] + "]. Please try again");
            else
            {            
                //this.jLabelStatus.setText("GetImageEx() Success [" + ret + "]"); 
                System.out.println("GetImageEx() Success [" + ret + "]");

                iError = fplib.CreateTemplate(fingerInfo, imageBuffer1, regMin1);
                if (iError == SGFDxErrorCode.SGFDX_ERROR_NONE)
                {
                    System.out.println("Second registration image was captured");
                   //this.jLabelStatus.setText("Second registration image was captured");
                   // r2Captured = true;
                  // this.enableRegisterAndVerifyControls();
                }
                else
                    System.out.println("CreateTemplate() Error : " + iError);
                   //this.jLabelStatus.setText("CreateTemplate() Error : " + iError);
            }
         }
         else
            //this.jLabelStatus.setText("GetImageEx() Error : " + iError);
            System.out.println("GetImageEx() Error : " + iError);
        
        
    }
    
    
    public boolean verificarHuella( byte[] verifyHuella , byte[] huellaCapturada) {//GEN-FIRST:event_jButtonCaptureR1ActionPerformed
     
        /******Crear plantilla desde la base de datos ****/
                    
                     long iError = SGFDxErrorCode.SGFDX_ERROR_NONE;
                     //byte[] validHuella = new byte[400];
                     long secuLevel = (long) 5;
                      //jComboBoxRegisterSecurityLevel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "LOWEST", "LOWER", "LOW", "BELOW_NORMAL", "NORMAL", "ABOVE_NORMAL", "HIGH", "HIGHER", "HIGHEST" }));
        

                    try {
                        //byte[] regMin1 = new byte[400];
                        
                        //HashMap registroHuella = personaControl.SelectBytesEspecial();
                        
                        boolean[] matched = new boolean[1];
                        int[] matchScore = new int[1];
                        
                        //validHuella      = (byte[]) registroHuella.get("huella");
                       // String nombre    = registroHuella.get("nombre").toString();
                        
                        //String nombre = new String((byte[]) registroHuella.get("nombre"), StandardCharsets.UTF_8);
         
                        
                        System.out.println("Comparando Huellas");
                        iError = fplib.MatchTemplate(huellaCapturada,verifyHuella, secuLevel, matched); 
                        
                        
                        if (iError == SGFDxErrorCode.SGFDX_ERROR_NONE)
                        {
                                matchScore[0] = 0;
                                iError = fplib.GetMatchingScore(huellaCapturada, verifyHuella, matchScore);

                                if (iError == SGFDxErrorCode.SGFDX_ERROR_NONE)
                                {
                                    if (matched[0]){
                                        //this.jLabelStatus.setText( "Registration Success, Matching Score: " + matchScore[0]);
                                        System.out.println("Las huellas coinciden");
                                        return true;
                                    }
                                    
                                    else{
                                        //this.jLabelStatus.setText( "Registration Fail, Matching Score: " + matchScore[0]);
                                        System.out.println("Las huellas No coinciden Matching Score " + matchScore[0]);
                                        return false;
                                    }

                                }
                            
                             
                           
                        }else{
                             System.out.println("Las huellas No coinciden");
                             return false;
                        }
         
                        
                        //System.out.println(registroHuella.get("huella"));
                        //System.out.println(registroHuella.get("template_imagen"));
                        
                    } catch (Exception ex) {
                        //Logger.getLogger(JSGD.class.getName()).log(Level.SEVERE, null, ex);
                        System.out.println(" Error "+ex);
                    }
                    
                    return false;
    }
}
