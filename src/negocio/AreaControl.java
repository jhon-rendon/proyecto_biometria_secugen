/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import datos.AreaDAO;
import entidades.Area;
import java.util.ArrayList;
import java.util.List;



public class AreaControl {
    
    AreaDAO datos;
    Area area;
     public List ListarAreas() {
         
         List<Area> lista = new ArrayList<>();
         lista.addAll(datos.listar());
         
         if( lista == null || lista.size() == 0 ){
                System.out.println(" Sin registros NULL");
         }else{
              System.out.println(" Con Registros");
         }
         return lista;
     }

    public AreaControl() {
   
    }
     
     
}
