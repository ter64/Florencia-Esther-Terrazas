/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author Estudiante
 */
public class Presentacion {
    String nombre;
    int edad;
    String vivienda;
    String salud;

    public Presentacion(String nombre, int edad, String vivienda, String salud) {
        this.nombre = nombre;
        this.edad = edad;
        this.vivienda = vivienda;
        this.salud = salud;
    }

    void ubicacion() {
        System.out.println(nombre + " vive en "+ vivienda );
    }

    void salud() {
        System.out.println(nombre + " esta " + salud);
    }

}
