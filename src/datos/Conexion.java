
package datos;

import helper.Helper;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    private static final String HOST   = "MTcyLjE2LjMwLjk=";
    private static final String PUERTO = "1521";
    private static String USER         = "QVBQQklPTUVUUklB";
    private static String PASSWORD     = "U1MxMjM0NQ==";
    private static String URL          = "jdbc:oracle:thin:@"+helper.Helper.decoder(HOST)+":"+PUERTO+":XE";
    private static Connection conexion = null;
    
    public static Connection getConexion(){
        
        try {
           
            Class.forName("oracle.jdbc.OracleDriver");
            conexion = DriverManager.getConnection(URL, helper.Helper.decoder(USER), helper.Helper.decoder(PASSWORD));
          
            if (conexion != null) {
                System.out.println("Conexion a base de datos exisotas");
            } else if (conexion == null) {
                throw new SQLException();
            }
        } catch (SQLException e) {
            //JOptionPane.showMessageDialog(null, e.getMessage());
            Helper.alerta(  e.getMessage() );
        } catch (ClassNotFoundException e) {
            //JOptionPane.showMessageDialog(null, "Se produjo el siguiente error: " + e.getMessage());
            Helper.alerta(  "Se produjo el siguiente error: " + e.getMessage() );
        } catch (NullPointerException e) {
            //JOptionPane.showMessageDialog(null, "Se produjo el siguiente error: " + e.getMessage());
             Helper.alerta(  "Se produjo el siguiente error: " + e.getMessage() );
        } finally {
            return conexion;
        }
        
       // return conexion;
    }
    
    public static void cerrarConexion(){
        try {
            conexion.close();
            conexion = null;
            System.out.println("Desconexion a base de datos exitosa");
        } catch (Exception e) {
            System.out.println( e.getMessage());
        }
    }
    
}
