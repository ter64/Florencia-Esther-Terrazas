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
public class Ejercicio2 {
         public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
         
        int num= sc.nextInt();
        
        if (num==0){
            System.out.println("Numero Neutro");
            
        }else if (num<0){
            System.out.println("Numero Negativo");
        } else {
            System.out.println("Numero Positivo");
        }
        
    }

}
