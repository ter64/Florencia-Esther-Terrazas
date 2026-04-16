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
public class mainPersona {
     public static void main(String[] args) {
        String Nombre = JOptionPane.showInputDialog("Ingresa tu nombre: ");
        int Edad= Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad: "));

        Persona per1 = new Persona(Nombre, Edad);
        per1.esMayordeEdad();
    }
}
