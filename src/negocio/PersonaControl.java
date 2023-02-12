package negocio;

import datos.PersonaDAO;
import entidades.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class PersonaControl {

    PersonaDAO datos;
    Persona persona;

    DefaultTableModel modelo;

    public PersonaControl() {
        datos = new PersonaDAO();
        persona = new Persona();
    }

    public List ListarPersonas() {

        List<Persona> lista = new ArrayList<>();
        lista.addAll(datos.listar());

        if (lista == null || lista.size() == 0) {
            System.out.println(" Sin registros NULL");
        } else {
            System.out.println(" Con Registros");
        }
        return lista;
    }
    
     public Persona buscarByCedula( int cedula ) {

         persona = datos.buscarByCedula( cedula );

        if ( persona == null ) {
            System.out.println(" Sin registros NULL");
        } else {
            System.out.println(" Con Registros");
        }
        return persona;
    }
    

    public boolean insertar(int cedula, String nombre, String apellido, int cargo, String estado, byte[] huella, String foto, int area) {

        persona.setCedula(cedula);
        persona.setNombre(nombre);
        persona.setApellido(apellido);
        persona.setCargo(cargo);
        persona.setEstado(estado);
        persona.setHuella(huella);
        persona.setFoto(foto);
        persona.setArea(area);

        if (datos.insertar(persona)) {
            return true;
        } else {
            return false;
        }
    }

    /*public DefaultTableModel mostrar(){
        List<Persona> lista = new ArrayList<>();
        
        lista.addAll(datos.listar());
        
        String[] title = {"idPersona", "Dni", "Nombre", "Apellido", "Telefono", "Edad"};
        modelo = new DefaultTableModel(null, title);
        
        String[] registro = new String[6];
        
        for (Persona item : lista) {
            registro[0] = Integer.toString(item.getIdPersona());
            //registro[1] = (String) item.getCedula();
            registro[2] = item.getNombre();
            registro[3] = item.getApellido();
            registro[4] = item.getTelefono();
            registro[5] = Integer.toString(item.getEdad());
            
            modelo.addRow(registro);
        }
        
        return modelo;
        
    }*/
    public Persona buscar(int cc ) {
        //persona = datos.buscar(dni);
        return persona;
    }

    public String actualizar(Persona persona) {
        if (datos.actualizar(persona)) {
            return "OK";
        } else {
            return "Ocurrio un error al actualizar";
        }
    }

    public String eliminar(int cc) {
        if (datos.eliminar(cc)) {
            return "OK";
        } else {
            return "Ocurrio un error al eliminar";
        }
    }

}
