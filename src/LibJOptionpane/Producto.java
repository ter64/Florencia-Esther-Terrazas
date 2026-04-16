/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibJOptionpane;

import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class Producto {
    String Nombre;
    double Precio;
    
    public Producto (String Nombre, double Precio){
        this.Nombre = Nombre;        
        this.Precio = Precio;

    }
    void esCaro() {
        if (Precio>10000){
            JOptionPane.showMessageDialog(null,"TRUE");

        }
    }
}
