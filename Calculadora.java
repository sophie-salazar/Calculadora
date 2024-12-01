import java.util.Scanner;

public class Calculadora {

    private Suma suma;
    private Resta resta;
    private Multiplicacion multiplicacion;
    private Division division;

    public Calculadora() {
        // Inicializando las clases de operaciones
        suma = new Suma();
        resta = new Resta();
        multiplicacion = new Multiplicacion();
        division = new Division();
    }

    // Métodos para realizar las operaciones
    public double realizarSuma(double a, double b) {
        suma.setOperando1(a);
        suma.setOperando2(b);
        return suma.sumar();
    }

    public double realizarResta(double a, double b) {
        resta.setOperando1(a);
        resta.setOperando2(b);
        return resta.restar();
    }

    public double realizarMultiplicacion(double a, double b) {
        multiplicacion.setOperando1(a);
        multiplicacion.setOperando2(b);
        return multiplicacion.multiplicar();
    }

    public double realizarDivision(double a, double b) {
        division.setOperando1(a);
        division.setOperando2(b);
        return division.dividir();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        // Realizar las operaciones
        System.out.println("Suma: " + calculadora.realizarSuma(num1, num2));
        System.out.println("Resta: " + calculadora.realizarResta(num1, num2));
        System.out.println("Multiplicación: " + calculadora.realizarMultiplicacion(num1, num2));
        
        // Verificación de división por cero
        if (num2 != 0) {
            System.out.println("División: " + calculadora.realizarDivision(num1, num2));
        } else {
            System.out.println("Error: División por cero.");
        }

        scanner.close();  // Cerramos el scanner
    }
}
