/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CondicionalesyBucles;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Ejercicio5 {
      public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("---------- Menu de Opciones ----------");
          System.out.println("1. Ver Pefil");
          System.out.println("2. Editar Datos");
          System.out.println("3. Cerrar Sesion");
        int op= sc.nextInt();
        
        switch (op){
            case 1:
                System.out.println("Seleccionaste: la Opcion 1: Ver perfil");
                break;
            case 2 :
                System.out.println("Seleccionaste: la Opcinn 2: Editar Datos");
                break;
            case 3 :
                System.out.println("Seleccionaste: la Opcion 3: Cerrar Sesion");
                break;
        }
        
    }
}
