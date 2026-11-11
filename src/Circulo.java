public class Circulo extends Figura{ // sin implements Forma porque ya lo hereda de la mamá

    // Atributos
    private double radio;

    // Métodos
    // Constructor
    public Circulo(double radio){
        super("Círculo");
        this.radio = radio;
    }

    // Getters
    public double getRadio() {
        return radio;
    }

    // Setters
    public void setRadio(double radio) {
        this.radio = radio;
    }

    // toString ()
    @Override
    public String toString(){
        return nombre + " tiene un radio de: " + radio;
    }

    // equals
    public boolean equals(Circulo otro) {
        return radio == otro.radio;
    }

    // calcularPerimetro()
    @Override
    public double calcularPerimetro(){
        return 2 * Math.PI * radio;
    }

    // calcularArea()
    @Override
    public double calcularArea(){
        return Math.PI * radio * radio;
    }

}
