
package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionMYSQL {
    
    private static final String HOST   = "192.168.41.6";
    private static final String PUERTO = "3306";
    private static final String DB     = "bd_control_asistencia";
    private static String USER         = "biometria";
    private static String PASSWORD     = "12345";
    private static String URL          = "";
    private static Connection conexion = null;
    
    public static Connection getConexion(){
        
        try {
                
            String ruta = "jdbc:mysql://";
            String servidor = HOST + ":" + PUERTO + "/";
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(ruta + servidor + DB, USER, PASSWORD);
            
            
            /*Class.forName("com.mysql.jdbc.Driver");
            URL = "jdbc:mysql://"+HOST+":"+PUERTO+"/"+DB;
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);*/
            
            if (conexion != null) {
                System.out.println("Conexion a base de datos listo...");
            } else if (conexion == null) {
                throw new SQLException();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Se produjo el siguiente error: " + e.getMessage());
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Se produjo el siguiente error: " + e.getMessage());
        } finally {
            return conexion;
        }
        
       // return conexion;
    }
    
    public static void cerrarConexion(){
        try {
            conexion.close();
            conexion = null;
            System.out.println("Desconexion a base de datos listo...");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
