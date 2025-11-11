public class MainImprimible {
    public static void main(String[] args) {
        Imprimible libro = new Libro("Alas de sangre", "Rebecca Yarros");
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes");
        Imprimible cuenta = new CuentaBancaria("Ismael", 2350.30);

        libro1.primerasLineas();
        libro1.imprimir();
        System.out.println(libro1.getTitulo() + " " + libro1.getAutor());

        libro.imprimir();
        cuenta.imprimir();

    }
}
