package pojo.Libro;

public class Libro {
    // ATRIBUTOS
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean disponible;
    public static int contadorLibros = 0;
    //CONSTRUCTOR

    public Libro(String titulo, String autor, int anioPublicacion, boolean disponible) {
        // initParams(titulo, autor, anioPublicacion, disponible);
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.disponible = disponible;
        this.contadorLibros++;
    }
    /*public Libro(String titulo) {
        //this.titulo = titulo;
        if(){}
    }*/


    public Libro(){}
    //MÉTODOS
    // GETTER/SETTER

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anioPublicacion=" + anioPublicacion +
                ", disponible=" + disponible +
                '}';
    }
}
