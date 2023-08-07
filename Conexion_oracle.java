
package datos;

import helper.Helper;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    private static final String HOST   = "";
    private static final String PUERTO = "";
    private static String USER         = "";
    private static String PASSWORD     = "";
    private static String SID          = "";
    private static String URL          = "jdbc:oracle:thin:@"+helper.Helper.decoder(HOST)+":"+PUERTO+":"+SID;
    private static Connection conexion = null;
    
    public static Connection getConexion(){
              
            System.out.println("Iniciando La conexion a la base de datos");
        try {
           
            Class.forName("oracle.jdbc.OracleDriver");
              System.out.println( "Conectando Driver "  );
            conexion = DriverManager.getConnection(URL, helper.Helper.decoder(USER), helper.Helper.decoder(PASSWORD));
    
            if (conexion != null) {
                System.out.println("Conexion a base de datos exisotas");
            } else if (conexion == null) {
                System.out.println( "Se produjo error "  );
                throw new SQLException();
            }
        } catch (SQLException e) {
            //JOptionPane.showMessageDialog(null, e.getMessage());
            Helper.alerta(  e.getMessage() );
        } catch (ClassNotFoundException e) {
            //JOptionPane.showMessageDialog(null, "Se produjo el siguiente error: " + e.getMessage());
             System.out.println( "Se produjo el siguiente error: " + e.getMessage() );
            Helper.alerta(  "Se produjo el siguiente error: " + e.getMessage() );
        } catch (NullPointerException e) {
            System.out.println( "Se produjo el siguiente error: " + e.getMessage() );
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
