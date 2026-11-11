public class Esfera extends Cuerpo {

    // Atributos
    private double radio;

    // Constructor
    public Esfera(double radio) {
        super("Esfera");
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

    // Métodos
    @Override
    public String toString() {
        return nombre + " de radio " + radio;
    }

    // La esfera no tiene aristas; usamos su circunferencia mayor (el "ecuador")
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public double calcularArea() {
        return 4 * Math.PI * radio * radio;
    }

    @Override
    public double calcularVolumen() {
        return (4.0 / 3) * Math.PI * radio * radio * radio;
    }

    public boolean equals(Esfera otro) {
        return radio == otro.radio;
    }
}