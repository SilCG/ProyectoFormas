import java.util.ArrayList;

public class Coleccion {

    // Atributos
    private String nombre;
    private ArrayList<Figura> figuras;
    private ArrayList<Cuerpo> cuerpos;

    // Constructor
    public Coleccion(String nombre) {
        this.nombre = nombre;
        this.figuras = new ArrayList<>();
        this.cuerpos = new ArrayList<>();
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public ArrayList<Figura> getFiguras() {
        return figuras;
    }

    public ArrayList<Cuerpo> getCuerpos() {
        return cuerpos;
    }

    // Setters (las listas no llevan setter: solo cambian con agregar)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos
    public void agregarFigura(Figura figura) {
        figuras.add(figura);
    }

    public void agregarCuerpo(Cuerpo cuerpo) {
        cuerpos.add(cuerpo);
    }

    public void listarFiguras() {
        for (Figura f : figuras) { // se lee: "para cada figura f de la lista..."
            f.imprimirInformacion();
            System.out.println();
        }
    }

    public void listarCuerpos() {
        for (Cuerpo c : cuerpos) {
            c.imprimirInformacion();
            System.out.println();
        }
    }

    public double calcularPerimetroTotal() {
        double total = 0;
        for (Figura f : figuras) {
            total += f.calcularPerimetro();
        }
        for (Cuerpo c : cuerpos) {
            total += c.calcularPerimetro();
        }
        return total;
    }

    public double calcularAreaTotal() {
        double total = 0;
        for (Figura f : figuras) {
            total += f.calcularArea();
        }
        for (Cuerpo c : cuerpos) {
            total += c.calcularArea();
        }
        return total;
    }

    public double calcularVolumenTotal() {
        double total = 0;
        for (Cuerpo c : cuerpos) { // solo los cuerpos tienen volumen
            total += c.calcularVolumen();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Colección " + nombre + " con " + figuras.size() + " figuras y " + cuerpos.size() + " cuerpos.";
    }

    public boolean equals(Coleccion otra) {
        return nombre.equals(otra.nombre);
    }
}