package datos;

import datos.interfaces.PersonaInterface;
import entidades.Area;
import entidades.Cargo;
import entidades.Persona;
import java.sql.Date;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class PersonaDAO implements PersonaInterface {

    PreparedStatement ps;
    ResultSet rs;



    @Override
    public boolean insertar(Persona obj) {

        boolean resp = false;
        
        try {
            String sql = "insert into APPBIOMETRIA.PERSONA(documento, nombre, apellidos, activo,huella1,foto,idarea,idcargo,fecha_creacion,hora_creacion) values(?, ?, ?, ?, ?, ?, ?, ? , SYSDATE,to_char(SYSDATE, 'HH24:MI:SS'))";
            //String sql = "insert into APPBIOMETRIA.PERSONA(documento, nombre, apellidos, activo,huella1,foto,idarea,idcargo,fecha_creacion,hora_creacion) values(?, ?, ?, ?, ?, ?, ?, ? , NOW(),NOW())";

            ps = Conexion.getConexion().prepareStatement(sql);
            ps.setInt(1, obj.getCedula());
            ps.setString(2, obj.getNombre());
            ps.setString(3, obj.getApellido());
            ps.setString(4, obj.getEstado());
            ps.setBytes(5,  obj.getHuella());
            ps.setString(6, obj.getFoto());
            ps.setInt(7,obj.getArea());
            ps.setInt(8,obj.getCargo());
            
            if (ps.executeUpdate() > 0) {
                resp = true;
            }
            
            ps.close();
            Conexion.cerrarConexion();

        } catch (SQLException sqex) {
        
         System.out.println("SQLException " +sqex);
         }catch (Exception e) {
            System.out.println("Exception "+e.getMessage());
    
        }

        return resp;
    }

    @Override
    public List<Persona> listar() {

        List<Persona> registros = new ArrayList<>();

        try {
            //String consulta = "SELECT documento,nombre,apellidos,idcargo,activo,huella1,foto,idarea FROM APPBIOMETRIA.PERSONA";
            String consulta = " select documento,p.nombre,apellidos,p.idcargo,activo,huella1,foto,p.idarea,c.nombre nombre_cargo," +
                              " a.nombre nombre_area" +
                              " FROM APPBIOMETRIA.PERSONA p, APPBIOMETRIA.area a, APPBIOMETRIA.cargo c " +
                              " where p.IDCARGO = c.IDCARGO and  p.IDAREA= a.IDAREA";
            ps = Conexion.getConexion().prepareStatement(consulta);

            rs = ps.executeQuery();
            
             while (rs.next()) {
                
                int documento       = rs.getInt(1);
                String nombre       = rs.getString(2);
                String apellido     = rs.getString(3);
                int idcargo         = rs.getInt(4);
                String estado       = rs.getString(5);
                byte[] huella       = rs.getBytes(6);
                String foto         = rs.getString(7);
                int idarea          = rs.getInt(8);
                String nombre_cargo = rs.getString(9);
                String nombre_area  = rs.getString(10);
                
                Persona persona = new Persona(documento,nombre,apellido,idcargo,estado,huella,foto,idarea);
                Area areaObj    = new Area(idarea,nombre_area);
                Cargo cargoObj  = new Cargo(idcargo,nombre_cargo);
                
                persona.setAreaObj(areaObj);
                persona.setCargoObj(cargoObj);
                registros.add(persona);
               
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

        /*try {
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

                //persona = new Persona(idPersona, dni, nombre, apellido, telefono, edad);
            }

            rs.close();
            ps.close();
            Conexion.cerrarConexion();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }*/

        return persona;
    }

    @Override
    public boolean actualizar(Persona obj) {

        boolean resp = false;

        /*try {
            String update = "update persona set dni =?, nombre =?, apellido = ?, telefono = ?, edad = ? where idPersona = ?";

            ps = Conexion.getConexion().prepareStatement(update);
            ps.setDouble(1, obj.getCedula());
            ps.setString(2, obj.getNombre());
            ps.setString(3, obj.getApellido());
            //ps.setString(4, obj.getTelefono());
            //ps.setInt(5, obj.getEdad());
           // ps.setInt(6, obj.getIdPersona());

            if (ps.executeUpdate() > 0) {
                resp = true;
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }*/

        return resp;
    }

    @Override
    public boolean eliminar(String dni) {
        boolean resp = false;

        /*try {
            String delete = "delete from persona where dni = ?";
            ps = Conexion.getConexion().prepareStatement(delete);
            ps.setString(1, dni);

            if (ps.executeUpdate() > 0) {
                resp = true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }*/

        return resp;

    }

}
