public class Rectangulo extends Figura {

    // Atributos
    protected double base;
    protected double altura;

    // Métodos
    // Constructor
    public Rectangulo(double base, double altura){
        super("Rectángulo");
        this.base = base;
        this.altura = altura;
    }

    // Getters
    public double getBase() {
        return base;
    }

    public double getAltura(){
        return altura;
    }

    // Setters
    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // toString ()
    @Override
    public String toString(){
        return nombre + " tiene una base de: " + base + " y una altura de: " + altura;
    }

    // equals
    public boolean equals(Rectangulo otro) {
        return base == otro.base && altura == otro.altura;
    }

    // calcularPerimetro()
    @Override
    public double calcularPerimetro(){
        return 2 * (base + altura);
    }

    // calcularArea()
    @Override
    public double calcularArea(){
        return base * altura;
    }

}



