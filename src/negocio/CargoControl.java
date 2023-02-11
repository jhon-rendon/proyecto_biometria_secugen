/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import datos.CargoDAO;
import entidades.Cargo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jhon Rendon
 */
public class CargoControl {
    
    CargoDAO datos;
    Cargo cargo;
    
    public CargoControl() {
        datos  = new CargoDAO();
        cargo  = new Cargo();
    }
    
     public List ListarCargos() {
         
         List<Cargo> lista = new ArrayList<>();
         lista.addAll(datos.listar());
         
         if( lista == null || lista.size() == 0 ){
                System.out.println(" Sin registros NULL");
         }else{
              System.out.println(" Con Registros");
         }
         return lista;
     }
     
        public List ListarCargosByIdArea( int idarea) {
         
         List<Cargo> lista = new ArrayList<>();
         lista.addAll(datos.listarCargosByArea(idarea));
         
         if( lista == null || lista.size() == 0 ){
                System.out.println(" Sin registros NULL");
         }else{
              System.out.println(" Con Registros");
         }
         return lista;
     }
}
