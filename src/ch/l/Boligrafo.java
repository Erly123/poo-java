package ch.l;

public class Boligrafo {

    String color;
    String marca;
    double punta;
    int carga;
    boolean tapada;

    void tapar() {
        this.tapada = true;
    }
    void destapar() {
        this.tapada = false;
    }
    void escribir(String texto) {
        System.out.println("Escribiendo: " + texto);
    }

}
