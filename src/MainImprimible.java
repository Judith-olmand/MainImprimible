public class MainImprimible {
    public static void main(String[] args) {
        Imprimible libro = new Libro("Alas de sangre", "Rebecca Yarros");
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes");
        Imprimible cuenta = new CuentaBancaria("Ismael", 2350.30);

        libro1.primerasLineas();
        libro1.imprimir();
        /**
         * libro.primerasLineas(); esto no se puede porque libro aunque es objero de Libro
         * referencia a Imprimible.
         * Puedes llamar solo a los métodos definidos en Imprimible
         * El objeto real tiene todas las características de Libro
         * Si necesitas acceder a métodos específicos de Libro, necesitarías hacer un casting:
         * ((Libro)libro).metodoEspecificoDeLibro();
         */
        ((Libro)libro).primerasLineas();
        System.out.println(libro1.getTitulo() + " " + libro1.getAutor());

        libro.imprimir();
        cuenta.imprimir();

    }
}
