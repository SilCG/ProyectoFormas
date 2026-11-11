public abstract class Figura implements Forma { // “Figura es una idea general (abstracta) y firma el contrato Forma.”

    // Figura implementa imprimirInformacion() (igual para todas).
    // calcularPerimetro() y calcularArea() los implementan las hijas. ¿Por qué? Porque es abstracta, entonces le “pasa la obligación” a sus *hijas*

    // Atributos
    protected String nombre;

    // Métodos
    // Constructor
    public Figura(String nombre){
        this.nombre = nombre;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // toString()
    @Override
    public String toString(){
        return "Figura: " + nombre + ".";
    }

    // equals
    public boolean equals(Figura otra) {
        return nombre.equals(otra.nombre) && calcularArea() == otra.calcularArea();
    }

    // Implementación común: todas las figuras se imprimen igual
    @Override
    public void imprimirInformacion() {
        System.out.println(this); // se imprime esta objeto
        System.out.println("Perímetro: " + calcularPerimetro()); // se imprime el perímetro que calcula la hija
        System.out.println("Área: " + calcularArea());
    }

}
