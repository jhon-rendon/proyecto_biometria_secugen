/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
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

            System.out.print("MAC: " + sb.toString());

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
    public static String decoder(String input) {

        byte[] base64DecodedBytes = Base64.getDecoder().decode(input);
        String decodedString = new String(base64DecodedBytes);
        System.out.println(decodedString);

        return decodedString;
    }

    public static void alerta(String msg) {

        JOptionPane.showMessageDialog(null, msg);
    }
    
      public static void alertaError(String msg) {

        JOptionPane.showMessageDialog(null, msg, "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    public static void alertaSuccess(String msg) {

        
    }

    public static boolean isNumeric(String s) {
        try {
            //Integer.parseInt(s);
            Double.parseDouble(s);
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }
    
    public static void copyFile(String origen, String destino) {
        try {
            Path FROM = Paths.get(origen);
            Path TO = Paths.get(destino);
            CopyOption[] options = new CopyOption[]{
                StandardCopyOption.REPLACE_EXISTING,
                StandardCopyOption.COPY_ATTRIBUTES
            };

            Files.copy(FROM, TO, options);
            //JOptionPane.showMessageDialog(null, "Imagen Guardada");
            System.out.println("Imagen Guardada");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al Guardar Imagen");
            System.err.println(e.toString());
        }
    }
    
    public static String obtenerFechaCompleta(){
        
        String timestamp = ZonedDateTime.now(ZoneId.of("America/Panama")).format(DateTimeFormatter.ofPattern("dd-MM-yyy hh-mm-ss"));
        return timestamp;
    }
    
    public static String getOperatingSystem()
    {
        // detectando el sistema operativo usando la propiedad del sistema `os.name`
        String os = System.getProperty("os.name").toLowerCase();
 
        if (os.contains("win")) {
            return "windows";
        }
 
        else if (os.contains("nix") || os.contains("nux") || os.contains("aix")) {
            return "linux";
        }
 
        else if (os.contains("mac")) {
            return "mac";
        }
 
        else if (os.contains("sunos")) {
            return "solaris";
        }
 
        return null;
    }
}
