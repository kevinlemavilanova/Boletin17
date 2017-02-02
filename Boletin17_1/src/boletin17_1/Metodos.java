/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17_1;

/**
 *
 * @author klemavilanova
 */
public class Metodos {
    int[] numeros = new int[6];
    
    public void CargarArray(){
        for(int i=0; i<numeros.length;i++){
            numeros[i] = (int) (Math.random()*50+1);
        }
    }
    public void Mostrar() {
        for(int num: numeros) {
            System.out.println(num);
        }
    }
    public void MostrarReves() {
        for(int i = numeros.length-1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
    
}
