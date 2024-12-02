
package com.mycompany.calculadora;


public class Calculadora {

    public static void main(String[] args) {
        Operaciones operaciones= new Operaciones (5,4);
       
        System.out.println(operaciones.sumar());
         System.out.println(operaciones.resta());
          System.out.println(operaciones.multiplicar());
           System.out.println(operaciones.dividir());
           
    }
}
