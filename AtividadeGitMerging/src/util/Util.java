/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Felipe
 */
public class Util {
    
    
    public double CalcularIMC(){
        double peso = 80;
        double altura = 1.70;
        double imc = peso/(altura*altura);
        
        return imc;
    }
    
}
