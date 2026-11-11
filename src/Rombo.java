public class Rombo extends Figura{

    // Atributos
    private double diagonalMayor;
    private double diagonalMenor;

    // Métodos
    // Constructor
    public Rombo (double diagonalMayor, double diagonalMenor){
        super("Rombo");
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }

    // Getters
    public double getDiagonalMayor() {
        return diagonalMayor;
    }

    public double getDiagonalMenor() {
        return diagonalMenor;
    }

    // Setters
    public void setDiagonalMayor(double diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }

    public void setDiagonalMenor(double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }

    // toString ()
    @Override
    public String toString(){
        return nombre + " tiene una diagonal mayor de: " +  diagonalMayor + " y una diagonal menor de: " + diagonalMenor;
    }

    // equals
    public boolean equals(Rombo otro) {
        return diagonalMayor == otro.diagonalMayor && diagonalMenor == otro.diagonalMenor;
    }

    // calcularLado()
    public double calcularLado(){
        double mitadMayor = diagonalMayor / 2;
        double mitadMenor = diagonalMenor / 2;
        return Math.sqrt(mitadMayor * mitadMayor + mitadMenor * mitadMenor);
    }
    // calcularPerimetro()
    @Override
    public double calcularPerimetro(){
        return 4 * calcularLado();
    }

    // calcularArea()
    @Override
    public double calcularArea(){
        return (diagonalMayor * diagonalMenor) / 2;
    }
}
