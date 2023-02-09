
package entidades;

public class Persona {
    
    private int idPersona;
    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;
    private int edad;
    private byte[] huella;
    private String cargo;
    private String estado;
    private String foto;

    public Persona() {
    }

    public Persona(int idPersona, String dni, String nombre, String apellido, String telefono, int edad) {
        this.idPersona = idPersona;
        this.cedula = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.edad = edad;
    }
    
     public Persona(String cedula, String nombre, String apellido, String cargo, String estado, byte[] huella, String foto ) {
        
        this.cedula    = cedula;
        this.nombre    = nombre;
        this.apellido  = apellido;
        this.estado    = estado;
        this.huella    = huella;
        this.cargo     = cargo;
        this.foto      = foto;
    }
    
    public Persona( String nombre, byte[] huella) {
       this.nombre = nombre;
       this.huella = huella;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cc) {
        this.cedula = cc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    public byte[] getHuella() {
        return huella;
    }

    public void setHuella(byte[] huella) {
        this.huella = huella;
    }
    
    
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
     public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    
}
