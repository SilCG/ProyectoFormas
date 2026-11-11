public abstract class Cuerpo implements Forma {
    // Idea general de un sólido; firma el contrato Forma

    // Atributos
    protected String nombre;

    // Métodos
    // Constructor
    public Cuerpo (String nombre){
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

    // Método para calcular su volumen
    public abstract double calcularVolumen();

     @Override
    public String toString(){
         return "Cuerpo " + nombre + ".";
     }

     // Implementación común: todos los cuerpos se imprimen igual
    @Override
    public void imprimirInformacion() {
        System.out.println(this);
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("Área: " + calcularArea());
        System.out.println("Volumen: " + calcularVolumen());
    }

    public boolean equals(Cuerpo otro) {
        return nombre.equals(otro.nombre) && calcularVolumen() == otro.calcularVolumen();
    }

}
