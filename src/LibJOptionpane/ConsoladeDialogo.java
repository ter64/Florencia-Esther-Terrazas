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
public class ConsoladeDialogo {
    public static void main(String[] args) {
  
        String nombre = JOptionPane.showInputDialog("Ingresa tu nombre");
              JOptionPane.showMessageDialog(null, "holi "+ nombre);
        int dormir = Integer.parseInt(JOptionPane.showInputDialog("Cuantas horas duermes?"));
              JOptionPane.showMessageDialog(null, "duermo "+dormir+ "horas");
    }
}
