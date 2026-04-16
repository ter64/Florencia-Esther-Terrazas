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
public class mainAuto {

    public static void main(String[] args) {
        String marca = JOptionPane.showInputDialog("Ingresa la marca de tu auto");
        String modelo = JOptionPane.showInputDialog("Ingresa el modelo de tu auto");

        Auto autito1 = new Auto(marca, modelo);
        autito1.arrancar();
    }
}
