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
public class Ejercicio1 {
     public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
         
        int edad= sc.nextInt();
        
        if (edad<18){
            System.out.println("Acceso Denegado");
            
        }else {
            System.out.println("Acceso Permitido");
        }
        
    }
}
