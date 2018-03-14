/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pa.modelo.dominio;

/**
 *
 * @author 41512086
 */
public class Carta {
   
    int valor;
    String nipe;
 
    
    public int getPeso(){
        
        if ((valor == 4 && !nipe.equalsIgnoreCase("P")) || 
                valor == 5 || 
                valor == 6 || 
                (valor == 7 && (!nipe.equalsIgnoreCase("O") && nipe.equalsIgnoreCase("C"))) ||
                (valor >= 8 && valor <= 10)){
            return valor - 3;
        }
        
        if (valor == 2 || valor == 3){
            return valor + 7;
        }
        
        if (valor == 1){
            if(!nipe.equalsIgnoreCase("E")){
                return 8;
            }else{
                return 12;
            }  
        }
        
        if(valor == 4){
            return 14;
        }
        if(valor == 7){
            if(!nipe.equalsIgnoreCase("O")){
                return 11;
            }else{
                return 13;
            } 
        }
        return 0;
    }
}
