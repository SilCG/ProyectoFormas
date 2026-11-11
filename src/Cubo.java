public class Cubo extends Cuerpo {

    // Atributos
    private Cuadrado cara; // las 6 caras son iguales, solo se guarda una

    // Constructor
    public Cubo(Cuadrado cara) {
        super("Cubo");
        this.cara = cara;
    }

    // Getters
    public Cuadrado getCara() {
        return cara;
    }

    public double getLado() {
        return cara.getLado(); // la medida sale de la figura plana
    }

    // Setters
    public void setCara(Cuadrado cara) {
        this.cara = cara;
    }

    // Métodos
    @Override
    public String toString() {
        return nombre + " de lado " + getLado();
    }

    @Override
    public double calcularPerimetro() {
        return 12 * getLado(); // 12 aristas
    }

    @Override
    public double calcularArea() {
        return 6 * cara.calcularArea(); // 6 caras
    }

    @Override
    public double calcularVolumen() {
        return cara.calcularArea() * getLado(); // área de la base × altura
    }

    public boolean equals(Cubo otro) {
        return getLado() == otro.getLado();
    }
}