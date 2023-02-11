/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos.interfaces;

import entidades.Cargo;
import java.util.List;

/**
 *
 * @author Jhon Rendon
 */
public interface CargoInterface {
  
    public boolean insertar(Cargo obj);
    
    public List<Cargo> listar();
    
    public Cargo buscar(String dni);
    
    public boolean actualizar(Cargo obj);
    
    public boolean eliminar(String id);
}
