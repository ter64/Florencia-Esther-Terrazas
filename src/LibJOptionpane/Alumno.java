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
public class Alumno {
    String Nombre;
    double Nota;
    
    public Alumno (String Nombre, double Nota){
        this.Nombre = Nombre;        
        this.Nota = Nota;

    }
    void aprobo() {
        if (Nota > 5) {
            JOptionPane.showMessageDialog(null, "Aprobo...");
        } else {
            JOptionPane.showMessageDialog(null, "No Aprobo...");

        }
    }
}
