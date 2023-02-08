
package datos.interfaces;

import entidades.Persona;
import java.util.List;

public interface PersonaInterface {
    
    public boolean insertar(Persona obj);
    
    public List<Persona> listar();
    
    public Persona buscar(String dni);
    
    public boolean actualizar(Persona obj);
    
    public boolean eliminar(String dni);
}
