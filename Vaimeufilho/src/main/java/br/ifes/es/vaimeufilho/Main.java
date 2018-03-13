/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.es.vaimeufilho;

/**
 *
 * @author Brenno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        Calculadora calculadora = new Calculadora();
        numero = calculadora.calcular("XIV");
        System.out.println(numero);
     
    }
    
}
