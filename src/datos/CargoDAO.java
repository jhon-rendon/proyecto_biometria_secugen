/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import datos.interfaces.CargoInterface;
import entidades.Cargo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jhon Rendon
 */
public class CargoDAO implements CargoInterface{

    PreparedStatement ps;
    ResultSet rs;
    
    @Override
    public boolean insertar(Cargo obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cargo> listar() {
       
        List<Cargo> registros = new ArrayList<>();
        System.out.println("Inicio consulta Cargos.... ");
        try {
            String consulta = "SELECT IDCARGO,NOMBRE FROM APPBIOMETRIA.CARGO";
            ps = Conexion.getConexion().prepareStatement(consulta);

            rs = ps.executeQuery();

            System.out.println("Listando Registros Cargos.... ");
            while (rs.next()) {
                registros.add(new Cargo(rs.getInt(1), rs.getString(2)));
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
    
    public List<Cargo> listarCargosByArea( int idarea ) {
       
        List<Cargo> registros = new ArrayList<>();
        System.out.println("Inicio consulta Cargos.... ");
        try {
            String consulta = "SELECT IDCARGO,NOMBRE FROM APPBIOMETRIA.CARGO WHERE IDAREA = "+idarea+"";
            ps = Conexion.getConexion().prepareStatement(consulta);

            rs = ps.executeQuery();

            System.out.println("Listando Registros Cargos.... ");
            while (rs.next()) {
                registros.add(new Cargo(rs.getInt(1), rs.getString(2)));
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
    public Cargo buscar(String dni) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizar(Cargo obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
