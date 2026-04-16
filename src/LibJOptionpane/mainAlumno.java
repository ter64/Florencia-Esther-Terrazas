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
public class mainAlumno {
        public static void main(String[] args) {
        String Nombre = JOptionPane.showInputDialog("Ingresa tu nombre: ");
        double Nota = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu nota: "));

        Alumno alum1 = new Alumno(Nombre, Nota);
        alum1.aprobo();
    }
}
