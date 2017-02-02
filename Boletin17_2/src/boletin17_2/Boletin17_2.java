/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17_2;
import libreria.Libreria;

/**
 *
 * @author klemavilanova
 */
public class Boletin17_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos ej1 = new Metodos();
        ej1.CargarArray();
        ej1.MostrarNotas();
        
        ej1.MostrarAlumno("Ana");
        
        System.out.println("");
        
        System.out.println("Aprobados:");
        ej1.MostrarAlumnosAprobados();
        
        System.out.println("Notas Ordenadas");
        ej1.MostrarNotasOrdenadas();
        
        ej1.MostrarAlumnoPedido();
    }
    
}
