public class Isosceles extends Triangulo {

    // Constructor
    public Isosceles(double ladoIgual, double base) {
        super("Isósceles", ladoIgual, ladoIgual, base);
    }

    // Getters
    public double getLadoIgual() {
        return lado1;
    }

    public double getBase() {
        return lado3;
    }

    // Setters
    public void setLadoIgual(double ladoIgual) {
        this.lado1 = ladoIgual;
        this.lado2 = ladoIgual;
    }

    public void setBase(double base) {
        this.lado3 = base;
    }

    // Métodos
    public boolean equals(Isosceles otro) {
        return lado1 == otro.lado1 && lado3 == otro.lado3;
    }

}