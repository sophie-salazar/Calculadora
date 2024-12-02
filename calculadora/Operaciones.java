package com.mycompany.calculadora;


public class Operaciones {
    double numero1;
    double numero2;

    public Operaciones(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public double sumar() {
        return numero1+numero2;
        
    }   
     public double resta() {
        return numero1-numero2;
     }
      public double multiplicar() {
        return numero1*numero2;
      }
       public double dividir() {
        return numero1/numero2;
       }
    
}
