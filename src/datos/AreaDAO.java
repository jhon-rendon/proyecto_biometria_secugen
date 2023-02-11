/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import datos.interfaces.AreaInterface;
import entidades.Area;
import entidades.Persona;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AreaDAO implements AreaInterface {

    PreparedStatement ps;
    ResultSet rs;

    @Override
    public boolean insertar(Area obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Area> listar() {

        List<Area> registros = new ArrayList<>();
        System.out.println("Inicio consulta Area.... ");
        try {
            String consulta = "SELECT IDAREA,NOMBRE FROM APPBIOMETRIA.AREA";
            ps = Conexion.getConexion().prepareStatement(consulta);

            rs = ps.executeQuery();

            System.out.println("Listando Registros Area.... ");
            while (rs.next()) {

                registros.add(new Area(rs.getInt(1), rs.getString(2)));
            }
            rs.close();
            ps.close();
            Conexion.cerrarConexion();
        } catch (SQLException sqex) {

            System.out.println("SQLException " + sqex);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return registros;
    }
    

    @Override
    public Area buscar(String dni) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizar(Area obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(String dni) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
