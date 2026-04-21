package ch.l.libro;

public class Main {
    public static void main(String[] args) {
        Libro hobbit =  new Libro("The Hobbit", "Tolkien", 2025);
        //hobbit.setTitulo("The Hobbit");
        //hobbit.setAutor("Tolkien");
        //hobbit.setAnioPublicado(2024);
        hobbit.status();

    }
}
