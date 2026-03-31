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
public class Ejercicio6 {
      public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("---------- Calculadora Basica ---------- ");
          System.out.println("Ingrese el primero numero: ");
        int num1= sc.nextInt();
          System.out.println("Ingrese el segundo numero: ");
        int num2= sc.nextInt();
        
          System.out.println("Elige una Operacion");
          char op= sc.next().charAt(0);
        switch (op){
            case '*' :
                System.out.println(num1+"*"+num2+" = "+(num1*num2));
                break;
            case '+' :
                System.out.println(num1+"+"+num2+" = "+(num1+num2));
                break;
            case '-' :
                System.out.println(num1+"-"+num2+" = "+(num1-num2));
                break;
            case '7' :
                System.out.println(num1+"/"+num2+" = "+(num1/num2));
                break;    
        }
        
    }
}
