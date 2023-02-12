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
public class Visita {
    
    private int id;
    private String fecha;
    private String hora;
    private int idTIpoVisita;
    private TipoVisita tipovisita;
    private int documento;
    private String direccionMac;
    private String direccionIP;
    private int codigoTerritorio;
    private String nombreTerritorio;

    public void setId(int id) {
        this.id = id;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setIdTIpoVisita(int idTIpoVisita) {
        this.idTIpoVisita = idTIpoVisita;
    }

    public void setTipovisita(TipoVisita tipovisita) {
        this.tipovisita = tipovisita;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public void setDireccionMac(String direccionMac) {
        this.direccionMac = direccionMac;
    }

    public void setDireccionIP(String direccionIP) {
        this.direccionIP = direccionIP;
    }

    public void setCodigoTerritorio(int codigoTerritorio) {
        this.codigoTerritorio = codigoTerritorio;
    }

    public void setNombreTerritorio(String nombreTerritorio) {
        this.nombreTerritorio = nombreTerritorio;
    }

    public int getId() {
        return id;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public int getIdTIpoVisita() {
        return idTIpoVisita;
    }

    public TipoVisita getTipovisita() {
        return tipovisita;
    }

    public int getDocumento() {
        return documento;
    }

    public String getDireccionMac() {
        return direccionMac;
    }

    public String getDireccionIP() {
        return direccionIP;
    }

    public int getCodigoTerritorio() {
        return codigoTerritorio;
    }

    public String getNombreTerritorio() {
        return nombreTerritorio;
    }

    public Visita() {
    }

    public Visita(int id, String fecha, String hora, int idTIpoVisita, TipoVisita tipovisita, int documento, String direccionMac, String direccionIP, int codigoTerritorio, String nombreTerritorio) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.idTIpoVisita = idTIpoVisita;
        this.tipovisita = tipovisita;
        this.documento = documento;
        this.direccionMac = direccionMac;
        this.direccionIP = direccionIP;
        this.codigoTerritorio = codigoTerritorio;
        this.nombreTerritorio = nombreTerritorio;
    }
    
    
    
}
