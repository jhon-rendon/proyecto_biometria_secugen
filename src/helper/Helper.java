/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.util.Base64;
import javax.swing.JOptionPane;

/**
 *
 * @author Jhon Rendon
 */
public class Helper {

    public static String obtenerMAC() {
        StringBuilder sb = new StringBuilder();
        NetworkInterface a;
        String linea;
        try {
            a = NetworkInterface.getByInetAddress(InetAddress.getLocalHost());
            byte[] mac = a.getHardwareAddress();

            for (int i = 0; i < mac.length; i++) {
                sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
            }
            //FileWriter fwriter = new FileWriter("mac.dat");
            //fwriter.write("MAC: " + sb.toString());
            //fwriter.close();
            
            System.out.print("MAC: "+sb.toString());

            //  lmac.setText("SE ha registrado la MAC exitosamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "" + sb.toString();
    }
    
    /*public static String obtenerIP()  {
       InetAddress address = InetAddress.getLocalHost();
        return address.getHostAddress();
    }*/
    
    public static String decoder( String input ){
        
      
        byte[] base64DecodedBytes = Base64.getDecoder().decode(input);
        String decodedString = new String(base64DecodedBytes);
        System.out.println(decodedString);
        
        return decodedString;
    }
    
     public static void alerta( String msg ){
        
       JOptionPane.showMessageDialog(null, msg);
    }
}
