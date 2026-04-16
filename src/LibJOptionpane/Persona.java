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
public class Persona {
    String Nombre;
    int Edad;
    
    public Persona (String Nombre, int Edad){
        this.Nombre = Nombre;        
        this.Edad = Edad;

    }
    void esMayordeEdad() {
         if (Edad>17){
            JOptionPane.showMessageDialog(null,"True");
        }
    }
}
