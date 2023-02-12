/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos.interfaces;

import entidades.TipoVisita;
import java.util.List;

/**
 *
 * @author Jhon Rendon
 */
public interface TipoVisitaInterface {
    
    public boolean insertar(TipoVisita obj);
    
    public List<TipoVisita> listar();
    
    public TipoVisita buscar(int cc);
    
    public boolean actualizar(TipoVisita obj);
    
    public boolean eliminar(int cc);
}
