
package negocio;

import SecuGen.FDxSDKPro.jni.SGFDxErrorCode;
import SecuGen.FDxSDKPro.jni.SGFingerInfo;
import SecuGen.FDxSDKPro.jni.SGFingerPosition;
import SecuGen.FDxSDKPro.jni.SGImpressionType;
import biometria.JSGD;
import datos.PersonaDAO;
import entidades.Persona;
import java.awt.Image;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class PersonaControl {
    
    PersonaDAO datos;
    Persona persona;
    
    DefaultTableModel modelo;
    
    public PersonaControl(){
        datos = new PersonaDAO();
        persona = new Persona();
    }
    
     public String insertar2( byte [] huella, String nombre ){
         
         if( datos.InsertEspecialBinaryArray(huella, nombre) ) {
            return "OK";
        }else{
            return "Ocurrio un error en el registro";
        }
     }
    
     public HashMap SelectBytesEspecial() {
           
         if( datos.SelectBytesEspecial() == null){
                System.out.println(" Sin registros NULL");
         }else{
              System.out.println(" Con Registros");
         }
         return datos.SelectBytesEspecial();
     }
     
     
      public List ListarPersonas() {
         
         List<Persona> lista = new ArrayList<>();
         lista.addAll(datos.listar());
         
         if( lista == null || lista.size() == 0 ){
                System.out.println(" Sin registros NULL");
         }else{
              System.out.println(" Con Registros");
         }
         return lista;
     }
    
    public String insertar(String cedula, String nombre, String apellido, String cargo, String estado , byte[] huella, String foto ){
        
        persona.setCedula(cedula);
        persona.setNombre(nombre);
        persona.setApellido(apellido);
        persona.setCargo(cargo);
        persona.setEstado(estado);
        persona.setHuella(huella);
        persona.setFoto(foto);
        
        if (datos.insertar(persona)) {
            return "Registro creado satisfactoriamente";
        }else{
            return "Ocurrio un error en el registro";
        }
    }
    
    public DefaultTableModel mostrar(){
        List<Persona> lista = new ArrayList<>();
        
        lista.addAll(datos.listar());
        
        String[] title = {"idPersona", "Dni", "Nombre", "Apellido", "Telefono", "Edad"};
        modelo = new DefaultTableModel(null, title);
        
        String[] registro = new String[6];
        
        for (Persona item : lista) {
            registro[0] = Integer.toString(item.getIdPersona());
            registro[1] = item.getCedula();
            registro[2] = item.getNombre();
            registro[3] = item.getApellido();
            registro[4] = item.getTelefono();
            registro[5] = Integer.toString(item.getEdad());
            
            modelo.addRow(registro);
        }
        
        return modelo;
        
    }
    
    public Persona buscar(String dni){
        persona = datos.buscar(dni);
        return persona;
    }
    
    public String actualizar(Persona persona){
        if (datos.actualizar(persona)) {
            return "OK";
        }else{
            return "Ocurrio un error al actualizar";
        }
    }
    
    public String eliminar(String dni){
        if (datos.eliminar(dni)) {
            return "OK";
        }else{
            return "Ocurrio un error al eliminar";
        }
    }
    
    

    
}
