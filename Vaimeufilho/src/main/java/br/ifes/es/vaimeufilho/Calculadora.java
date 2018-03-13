/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.es.vaimeufilho;

import java.util.HashMap;

/**
 *
 * @author Brenno
 */
public class Calculadora {
    
    private HashMap<String,Integer> mapaNumeros;
    
    public Calculadora(){
        mapaNumeros = new HashMap<String,Integer>();
        mapaNumeros.put("I", 1);
        mapaNumeros.put("V", 5);
        mapaNumeros.put("X", 10);
        mapaNumeros.put("L", 50);
        mapaNumeros.put("C", 100);    
        mapaNumeros.put("D", 500);    
        mapaNumeros.put("M", 1000);    
    }
    
    public int calcular(String numeroRomano){
        int total = 0, i;
        for(i=0; i<numeroRomano.length()-1; i++){
            int num = mapaNumeros.get(Character.toString(numeroRomano.charAt(i)));
            int num_prox = mapaNumeros.get(Character.toString(numeroRomano.charAt(i+1)));
            if(num >= num_prox){
                total += num;
            }else{
                total -= num;
            }
        }
        return total+mapaNumeros.get(Character.toString(numeroRomano.charAt(numeroRomano.length()-1)));
    }
    
}
