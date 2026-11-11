public abstract class Triangulo extends Figura{ // Todo triangulo tiene que ser de uno de estos tipos: equilátero, isósceles o escaleno

    // Atributos
    protected double lado1;
    protected double lado2;
    protected double lado3;

    // Métodos
    // Constructor
    public Triangulo (String nombre, double lado1, double lado2, double lado3){
        super(nombre);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    // Getters
    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    // Setters
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    // Método para decidir que tipo de triangulo se crea según los lados que recibe
    public static Triangulo crearTriangulo(double lado1, double lado2, double lado3) {
        if (lado1 == lado2 && lado2 == lado3) {
            return new Equilatero(lado1);
        } else if (lado1 == lado2) {
            return new Isosceles(lado1, lado3);
        } else if (lado1 == lado3) {
            return new Isosceles(lado1, lado2);
        } else if (lado2 == lado3) {
            return new Isosceles(lado2, lado1);
        } else {
            return new Escaleno(lado1, lado2, lado3);
        }
    }


    // toString()
    @Override
    public String toString(){
        return "Los 3 lados del triangulo son: " + lado1 + ", " + lado2 + " y" + lado3;
    }

    // calcularPerimetro()
    @Override
    public double calcularPerimetro(){
        return lado1 + lado2 + lado3;
    }

    // calcularArea() - Fórmula Herón
    @Override
    public double calcularArea() {
        double s = calcularPerimetro() / 2; // semiperímetro
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }
}
