/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17_4;

import java.util.Hashtable;
import javax.swing.JOptionPane;

/**
 *
 * @author klemavilanova
 */
public class Metodos {
    Hashtable<Integer, String> valores = new Hashtable<>();
    
    public void CargarValores(){
        valores.put(3, "A");
        valores.put(11, "B");
        valores.put(20, "C");
        valores.put(9, "D");
        valores.put(22, "E");
        valores.put(7,"F");
        valores.put(4, "G");
        valores.put(18, "H");
        valores.put(13, "J");
        valores.put(21, "K");
        valores.put(19, "L");
        valores.put(5, "M");
        valores.put(12, "N");
        valores.put(8, "P");
        valores.put(16, "Q");
        valores.put(1, "R");
        valores.put(15, "S");
        valores.put(0, "T");
        valores.put(17, "V");
        valores.put(2, "W");
        valores.put(10, "X");
        valores.put(6, "Y");
        valores.put(14, "Z");

    }
    
    public String CalcularDni(int dni){
        int res = (dni%23);
        return valores.get(res);
    }
}
