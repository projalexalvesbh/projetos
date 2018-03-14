package br.com.pa.modelo.dominio;

import br.com.pa.enums.Nipes;

public class Carta {
	
    int valor;
    String nipe;
 
    public int getPeso(){
        
        if ((valor == 4 && !nipe.equalsIgnoreCase(Nipes.PAUS.getSigla())) || 
                valor == 5 || 
                valor == 6 || 
                (valor == 7 && (!nipe.equalsIgnoreCase(Nipes.OUROS.getSigla()) && nipe.equalsIgnoreCase(Nipes.COPAS.getSigla()))) ||
                (valor >= 8 && valor <= 10)){
            return valor - 3;
        }
        
        if (valor == 2 || valor == 3){
            return valor + 7;
        }
        
        if (valor == 1){
            if(!nipe.equalsIgnoreCase(Nipes.ESPADA.getSigla())){
                return 8;
            }else{
                return 12;
            }  
        }
        
        if(valor == 4){
            return 14;
        }
        if(valor == 7){
            if(!nipe.equalsIgnoreCase(Nipes.OUROS.getSigla())){
                return 11;
            }else{
                return 13;
            } 
        }
        return 0;
    }
}
