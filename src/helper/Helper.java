/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.net.InetAddress;
import java.net.NetworkInterface;

/**
 *
 * @author Jhon Rendon
 */
public class Helper {

    public static String conseguirMAC() {
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
}
