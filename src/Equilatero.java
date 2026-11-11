public class Equilatero extends Triangulo{

    // Métodos
    // Constructor
    public Equilatero(double lado){
        super("Equilátero", lado, lado, lado);
    }

    // Getters
    public double getLado() {
        return lado1;
    }

    // Setters
    public void setLado(double lado) {
        this.lado1 = lado;
        this.lado2 = lado;
        this.lado3 = lado;
    }

    // equals
    public boolean equals(Equilatero otro) {
        return lado1 == otro.lado1;
    }

}
