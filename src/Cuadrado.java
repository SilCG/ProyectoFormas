public class Cuadrado extends Rectangulo{

    // Atributos - sin atributos porque son heredados de Rectangulo

    // Métodos
    // Constructor

    public Cuadrado(double lado){
        super(lado, lado); // preguntarle al profe mejor
        this.nombre = "Cuadrado";
    }

    // Getters
    public double getLado() {
        return base;
    }

    // Setters
    public void setLado(double lado) {
        this.base = lado;
        this.altura = lado;
    }

    // toString ()
    @Override
    public String toString(){
        return nombre + " tiene un lado de: " + base;
    }

    // equals
    public boolean equals(Cuadrado otro) {
        return base == otro.base;
    }

}

