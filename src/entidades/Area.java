/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;


public class Area {
    
    private int id;
    private String nombre;

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Area(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    public Area(){
        
    }
    
    @Override
     public String toString() {
      return nombre;
   }
}
