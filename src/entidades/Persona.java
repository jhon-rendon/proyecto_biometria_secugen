
package entidades;

public class Persona {
    
    private int idPersona;
    private String dni;
    private String nombre;
    private String apellido;
    private String telefono;
    private int edad;
    private byte[] huella;

    public Persona() {
    }

    public Persona(int idPersona, String dni, String nombre, String apellido, String telefono, int edad) {
        this.idPersona = idPersona;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.edad = edad;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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
    
    
}
