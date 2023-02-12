/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import datos.interfaces.VisitaInterface;
import entidades.Visita;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Jhon Rendon
 */
public class VisitaDAO implements VisitaInterface{

    PreparedStatement ps;
    ResultSet rs;

    @Override
    public boolean insertar(Visita obj) {
        
         boolean resp = false;
        
        try {
            String sql = "INSERT INTO APPBIOMETRIA.VISITA( persona_documento,fecha,hora ) VALUES (? , NOW() , NOW() )";

            ps = Conexion.getConexion().prepareStatement(sql);
            ps.setInt(1, obj.getDocumento() );
            
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
    public List<entidades.Visita> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Visita buscar(int cc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizar(Visita obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(int cc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
