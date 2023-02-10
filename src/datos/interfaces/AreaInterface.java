/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos.interfaces;

import entidades.Area;
import java.util.List;

/**
 *
 * @author Jhon Rendon
 */
public interface AreaInterface {
    
    public boolean insertar(Area obj);
    
    public List<Area> listar();
    
    public Area buscar(String dni);
    
    public boolean actualizar(Area obj);
    
    public boolean eliminar(String dni);
}
