public class Multiplicacion {

    private double operando1;
    private double operando2;

    // Getters y Setters
    public double getOperando1() {
        return operando1;
    }

    public void setOperando1(double operando1) {
        this.operando1 = operando1;
    }

    public double getOperando2() {
        return operando2;
    }

    public void setOperando2(double operando2) {
        this.operando2 = operando2;
    }

    // Método de multiplicación
    public double multiplicar() {
        return operando1 * operando2;
    }
}
