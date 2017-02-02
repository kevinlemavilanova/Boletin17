/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17_2;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author klemavilanova
 */
public class Metodos {
    int[] alumnos = new int[4];
    String[] nomes = new String[4];
    
    public void CargarArray(){
        nomes[0] = "Pedro";
        nomes[1] = "Juan";
        nomes[2] = "Ana";
        nomes[3] = "Diego";
        for(int i=0; i<alumnos.length;i++){
            alumnos[i] = (int) (Math.random()*10+1);
        }
    }
    public void MostrarAlumno(String nome){
        for(int i=0; i<alumnos.length;i++){
            if(nomes[i] == nome){
                System.out.println(nome +": "+ alumnos[i]);
            }
        }
    }
    public void MostrarAlumnoPedido(){
        String nome = JOptionPane.showInputDialog("Nome do alumno:");
        for(int i=0; i<alumnos.length;i++){
            if(nomes[i].equals(nome)) {
                System.out.println(nome +": "+ alumnos[i]);
            }
        }
    }
    public void MostrarAlumnosAprobados() {
        ArrayList Aprobados = new ArrayList();
        
        for(int i=0; i<alumnos.length;i++) {
            if(alumnos[i]>5){
                Aprobados.add(nomes[i]);
            }
        }
        for(Object nome: Aprobados) {
            System.out.println(nome);
        }
    }
    public void MostrarNotasOrdenadas() {
        int[] aux = new int[4];
        for(int i=0; i<alumnos.length;i++) {
            aux[i] = alumnos[i];
        }
        Arrays.sort(aux);
        
        for(int nota: aux) {
            System.out.println(nota);
        }

    }
    public void MostrarNotas() {
        int aprobados = 0;
        int suspensos = 0;
        int max = 0;
        int total = 0;
        for(int nota: alumnos) {
            if(nota>5){
                aprobados++;
            }
            else {
                suspensos++;
            }
            if(nota>max){
                max = nota;
            }
            total+=nota;
        }
        System.out.println("Aprobados: "+ aprobados);
        System.out.println("Suspensos: "+ suspensos);
        System.out.println("Nota media: "+ total/4);
        System.out.println("Nota maxima: "+ max);
    }
}
