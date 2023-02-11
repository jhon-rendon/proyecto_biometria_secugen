
package entidades;

public class Persona {
    
    private int cedula;
    private String nombre;
    private String apellido;
    private byte[] huella;
    private int cargo;
    private String estado;
    private String foto;
    private int area;
    private Area objArea;
    private Cargo objCargo;

    public Persona() {
    }

     public Persona(int cedula, String nombre, String apellido, int cargo, String estado, byte[] huella, String foto, int area ) {
        
        this.cedula    = cedula;
        this.nombre    = nombre;
        this.apellido  = apellido;
        this.estado    = estado;
        this.huella    = huella;
        this.cargo     = cargo;
        this.foto      = foto;
        this.area      = area;
    }
     
      public Persona(int cedula, String nombre, String apellido, int cargo, String estado, byte[] huella, String foto ) {
        
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

  

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cc) {
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

   
    public byte[] getHuella() {
        return huella;
    }

    public void setHuella(byte[] huella) {
        this.huella = huella;
    }
    
    
    
    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
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
    
    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
    
      public Area getAreaObj() {
        return objArea;
    }

    public void setAreaObj(Area obj) {
        this.objArea = obj;
    }
    
    public Cargo getCargoObj() {
        return objCargo;
    }

    public void setCargoObj(Cargo obj) {
        this.objCargo = obj;
    }
    
    
}
