public class Cilindro extends Cuerpo {

    // Atributos
    private Circulo base;        // las 2 tapas son iguales
    private Rectangulo lateral;  // el costado desenrollado

    // Constructor
    public Cilindro(Circulo base, double altura) {
        super("Cilindro");
        this.base = base;
        this.lateral = new Rectangulo(base.calcularPerimetro(), altura);
    }

    // Getters
    public Circulo getBase() {
        return base;
    }

    public Rectangulo getLateral() {
        return lateral;
    }

    public double getRadio() {
        return base.getRadio();
    }

    public double getAltura() {
        return lateral.getAltura();
    }

    // Setters
    public void setBase(Circulo base) {
        this.base = base;
        lateral.setBase(base.calcularPerimetro()); // el costado se ajusta al nuevo círculo
    }

    public void setAltura(double altura) {
        lateral.setAltura(altura);
    }

    // Métodos
    @Override
    public String toString() {
        return nombre + " de radio " + getRadio() + " y altura " + getAltura();
    }

    @Override
    public double calcularPerimetro() {
        return 2 * base.calcularPerimetro(); // los 2 bordes circulares
    }

    @Override
    public double calcularArea() {
        return 2 * base.calcularArea() + lateral.calcularArea(); // 2 tapas + costado
    }

    @Override
    public double calcularVolumen() {
        return base.calcularArea() * getAltura(); // área de la base × altura
    }

    public boolean equals(Cilindro otro) {
        return getRadio() == otro.getRadio() && getAltura() == otro.getAltura();
    }
}