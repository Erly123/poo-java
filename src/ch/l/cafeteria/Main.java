package ch.l.cafeteria;

public class Main {
    public static void main(String[] args) {
        DulceGusto dulceGusto = new DulceGusto();

        dulceGusto.encender();
        dulceGusto.colocarPortafiltro();

        dulceGusto.seleccionarModo(ModoCafe.EXPRESO);
        dulceGusto.hacerCafe();


    }
}
