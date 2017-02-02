/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17_4;

/**
 *
 * @author klemavilanova
 */
public class Boletin17_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos dni = new Metodos();
        dni.CargarValores();
        System.out.println(dni.CalcularDni(35611858));
    }
    
}
