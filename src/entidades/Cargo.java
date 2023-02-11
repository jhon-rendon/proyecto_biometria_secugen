/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;


public class Cargo {
    
    private int idcargo;
    private String nombre;
    private int idarea;

    public Cargo(int idcargo, String nombre, int idarea) {
        this.idcargo = idcargo;
        this.nombre = nombre;
        this.idarea = idarea;
    }
    
   public Cargo(int idcargo, String nombre) {
        this.idcargo = idcargo;
        this.nombre = nombre;
    }
    
    public Cargo(){
        
    }

    public void setIdcargo(int idcargo) {
        this.idcargo = idcargo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdarea(int idarea) {
        this.idarea = idarea;
    }

    public int getIdcargo() {
        return idcargo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdarea() {
        return idarea;
    }
    
    @Override
     public String toString() {
      return nombre;
   }
}
