public class Escaleno extends Triangulo {

    // Constructor
    public Escaleno(double lado1, double lado2, double lado3) {
        super("Escaleno", lado1, lado2, lado3);
    }

    // Métodos
    public boolean equals(Escaleno otro) {
        return lado1 == otro.lado1 && lado2 == otro.lado2 && lado3 == otro.lado3;
    }
}