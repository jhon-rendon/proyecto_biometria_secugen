/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import datos.VisitaDAO;
import entidades.Visita;

/**
 *
 * @author Jhon Rendon
 */
public class VisitaControl {
    
    
    VisitaDAO datos;
    Visita visita;
    
    public VisitaControl() {
        datos   = new VisitaDAO();
        visita  = new Visita();
    }
    
    public boolean insertar( int documento ) {

        visita.setDocumento(documento);

        if (datos.insertar(visita)) {
            return true;
        } else {
            return false;
        }
    }
}
