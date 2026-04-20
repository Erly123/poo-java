package ch.l;

public class Boligrafo {

    protected String color;
    protected String marca;
    protected double punta;
    protected int carga;
    private boolean tapada;

    public void tapar() {
        this.tapada = true;
    }
    public void destapar() {

        this.tapada = false;
    }
    protected void escribir(String texto) {
        System.out.println("Escribiendo: " + texto);
    }
    public void status() {
        System.out.println(("===================="));
        System.out.println(("Color:" + this.color));
        System.out.println(("Marca:" + this.marca));
        System.out.println(("Punta:" + this.punta));
        System.out.println(("Carga:" + this.carga));
        System.out.println(("Tapada:" + this.tapada));
        System.out.println(("===================="));
    }

}
