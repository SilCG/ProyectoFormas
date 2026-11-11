public class Main {

    public static void main(String[] args) {

        Coleccion coleccion = new Coleccion("Práctica");

        // Figuras planas
        coleccion.agregarFigura(new Circulo(2));
        coleccion.agregarFigura(new Rectangulo(4, 3));
        coleccion.agregarFigura(new Cuadrado(3));
        coleccion.agregarFigura(new Rombo(8, 6));
        coleccion.agregarFigura(Triangulo.crearTriangulo(3, 3, 3)); // Equilátero
        coleccion.agregarFigura(Triangulo.crearTriangulo(5, 5, 6)); // Isósceles
        coleccion.agregarFigura(Triangulo.crearTriangulo(3, 4, 5)); // Escaleno

        // Cuerpos: se construyen a partir de figuras planas
        coleccion.agregarCuerpo(new Cubo(new Cuadrado(3)));
        coleccion.agregarCuerpo(new Cilindro(new Circulo(2), 5));
        coleccion.agregarCuerpo(new Tetraedro(new Equilatero(3)));
        coleccion.agregarCuerpo(new Esfera(2));

        System.out.println(coleccion);
        System.out.println();

        System.out.println("=== FIGURAS ===");
        coleccion.listarFiguras();

        System.out.println("=== CUERPOS ===");
        coleccion.listarCuerpos();

        System.out.println("=== TOTALES ===");
        System.out.println("Perímetro total: " + coleccion.calcularPerimetroTotal());
        System.out.println("Área total: " + coleccion.calcularAreaTotal());
        System.out.println("Volumen total: " + coleccion.calcularVolumenTotal());
    }
}