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
public class mainProducto {
    public static void main(String[] args) {
        String Nombre = JOptionPane.showInputDialog("Nombre del producto: ");
        double Precio = Double.parseDouble(JOptionPane.showInputDialog("Precio: "));

        Producto p1 = new Producto(Nombre, Precio);
        
        p1.esCaro();
    }
}
