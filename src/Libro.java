public class Libro implements Imprimible{
    private String titulo;
    private String autor;

    public  Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void primerasLineas(){
        System.out.println("La linea esta primera");
    }

    @Override
    public void imprimir() {
        System.out.println("El libro " + titulo + " es del autor " + autor);
    }
}
