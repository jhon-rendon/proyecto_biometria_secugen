/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Jhon Rendon
 */
public class TipoVisita {
    
    private int id;
    private String nombre;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoVisita(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public TipoVisita() {
    }
}
