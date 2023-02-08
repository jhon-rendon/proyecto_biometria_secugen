package datos;

import datos.interfaces.PersonaInterface;
import entidades.Persona;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class PersonaDAO implements PersonaInterface {

    PreparedStatement ps;
    ResultSet rs;

    public Boolean InsertEspecialBinaryArray(byte[] huella, String nombre) {
        boolean resp = false;

        try {

            String sql = "INSERT INTO prueba (nombre,huella) VALUES (?, ?)";
            ps = Conexion.getConexion().prepareStatement(sql);

            ps.setString(1, nombre);
            ps.setBytes(2, huella);
            //ps.setBytes(3, img); 

            if (ps.executeUpdate() > 0) {
                resp = true;
            }
            ps.close();
            Conexion.cerrarConexion();
            //ps.executeUpdate();
            //ps.close();
            //conexion.close();
            return true;
        } catch (SQLException sqex) {
            System.out.println("Error en insert SQLException " + sqex);
            //System.out.println("Error en Insert -> :"+HandlerOracle.class.getName() + " " + Level.SEVERE + " " + sqex.toString());
            /*mensaje = "Error en Insert: " +
                    HandlerOracle.class.getName() + " " + Level.SEVERE + " " + sqex.toString();
            this.error = sqex.getErrorCode();*/
        } catch (Exception sqex) {
            System.out.println("Error en insert Exception " + sqex);
            /*System.out.println("Error en Insert -> :"+HandlerOracle.class.getName() + " " + Level.SEVERE + " " + sqex.toString());
            mensaje = "Error en Insert: " +
                    HandlerOracle.class.getName() + " " + Level.SEVERE + " " + sqex.toString();
             */
        }
        return false;
    }

    public HashMap SelectBytesEspecial() {

        //Connection conn = cnx.conectar();

        HashMap<String, byte[]> hashmap = new HashMap<>();
        
       
        
        try{
        String consulta = "SELECT huella,nombre FROM prueba ";
         ps = Conexion.getConexion().prepareStatement(consulta);
         rs = ps.executeQuery();

          if (rs.next()) {   
                System.out.println(" Listando Registros de la base de datos");
                
                hashmap.put("huella", rs.getBytes("huella"));
                hashmap.put("nombre", rs.getString("nombre").getBytes());
                
                return hashmap;
          }
          
           else {
            //this.mensaje = "No existe un registro de huella para rut: "+rut;
            System.out.println("No existe un registro de huella");
            
            //return null;
        }

            rs.close();
            ps.close();
            Conexion.cerrarConexion();
         } catch (Exception e) {
            System.out.println(e.getMessage());
        }   
       
        return hashmap;
            
    
    }

    @Override
    public boolean insertar(Persona obj) {

        boolean resp = false;

        try {
            String sql = "insert into persona(dni, nombre, apellido, telefono, edad) values(?, ?, ?, ?, ?)";

            ps = Conexion.getConexion().prepareStatement(sql);
            ps.setString(1, obj.getDni());
            ps.setString(2, obj.getNombre());
            ps.setString(3, obj.getApellido());
            ps.setString(4, obj.getTelefono());
            ps.setInt(5, obj.getEdad());

            if (ps.executeUpdate() > 0) {
                resp = true;
            }
            ps.close();
            Conexion.cerrarConexion();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return resp;
    }

    @Override
    public List<Persona> listar() {

        List<Persona> registros = new ArrayList<>();

        try {
            String consulta = "SELECT huella,nombre FROM prueba";
            ps = Conexion.getConexion().prepareStatement(consulta);

            rs = ps.executeQuery();

            while (rs.next()) {
                //int idPersona = rs.getInt(1);
                //String dni = rs.getString(2);
                byte[] huella = rs.getBytes(1);
                String nombre = rs.getString(2);
                //String apellido = rs.getString(4);
                //String telefono = rs.getString(5);
                //int edad = rs.getInt(6);

                registros.add(new Persona(nombre, huella));
            }

            rs.close();
            ps.close();
            Conexion.cerrarConexion();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return registros;
    }

    @Override
    public Persona buscar(String dniPersona) {

        Persona persona = null;

        try {
            String consulta = "select * from persona where dni = ?";

            ps = Conexion.getConexion().prepareStatement(consulta);
            ps.setString(1, dniPersona);
            rs = ps.executeQuery();

            if (rs.next()) {
                int idPersona = rs.getInt(1);
                String dni = rs.getString(2);
                String nombre = rs.getString(3);
                String apellido = rs.getString(4);
                String telefono = rs.getString(5);
                int edad = rs.getInt(6);

                persona = new Persona(idPersona, dni, nombre, apellido, telefono, edad);
            }

            rs.close();
            ps.close();
            Conexion.cerrarConexion();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return persona;
    }

    @Override
    public boolean actualizar(Persona obj) {

        boolean resp = false;

        try {
            String update = "update persona set dni =?, nombre =?, apellido = ?, telefono = ?, edad = ? where idPersona = ?";

            ps = Conexion.getConexion().prepareStatement(update);
            ps.setString(1, obj.getDni());
            ps.setString(2, obj.getNombre());
            ps.setString(3, obj.getApellido());
            ps.setString(4, obj.getTelefono());
            ps.setInt(5, obj.getEdad());
            ps.setInt(6, obj.getIdPersona());

            if (ps.executeUpdate() > 0) {
                resp = true;
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return resp;
    }

    @Override
    public boolean eliminar(String dni) {
        boolean resp = false;

        try {
            String delete = "delete from persona where dni = ?";
            ps = Conexion.getConexion().prepareStatement(delete);
            ps.setString(1, dni);

            if (ps.executeUpdate() > 0) {
                resp = true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return resp;

    }

}
