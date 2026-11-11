public class Tetraedro extends Cuerpo {

    // Atributos
    private Equilatero cara; // las 4 caras son iguales

    // Constructor
    public Tetraedro(Equilatero cara) {
        super("Tetraedro");
        this.cara = cara;
    }

    // Getters
    public Equilatero getCara() {
        return cara;
    }

    public double getLado() {
        return cara.getLado();
    }

    // Setters
    public void setCara(Equilatero cara) {
        this.cara = cara;
    }

    // Métodos
    @Override
    public String toString() {
        return nombre + " de arista " + getLado();
    }

    @Override
    public double calcularPerimetro() {
        return 6 * getLado(); // 6 aristas
    }

    @Override
    public double calcularArea() {
        return 4 * cara.calcularArea(); // 4 caras
    }

    @Override
    public double calcularVolumen() {
        double lado = getLado();
        return (lado * lado * lado) / (6 * Math.sqrt(2)); // fórmula del tetraedro regular
    }

    public boolean equals(Tetraedro otro) {
        return getLado() == otro.getLado();
    }
}