package ch.l.libro;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicado;

    public Libro(String titulo, String autor, int anioPublicado) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicado = anioPublicado;
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

    public int getAnioPublicado() {
        return anioPublicado;
    }

    public void setAnioPublicado(int anioPublicado) {
        this.anioPublicado = anioPublicado;
    }

    public void status(){
        System.out.println("==========================");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Año publicado: " + this.anioPublicado);
        System.out.println("==========================");

    }
}
