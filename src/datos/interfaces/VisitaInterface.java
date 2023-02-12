/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos.interfaces;

import entidades.Visita;
import java.util.List;

/**
 *
 * @author Jhon Rendon
 */
public interface VisitaInterface {
    
    public boolean insertar(Visita obj);
    
    public List<Visita> listar();
    
    public Visita buscar(int cc);
    
    public boolean actualizar(Visita obj);
    
    public boolean eliminar(int cc);
    
}
