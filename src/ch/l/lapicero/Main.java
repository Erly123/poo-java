package ch.l.lapicero;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Boligrafo boligrafoAzul = new Boligrafo();
        boligrafoAzul.color = "azul";
        boligrafoAzul.carga = 100;
        boligrafoAzul.marca = "Layconsa";
        boligrafoAzul.punta = 0.5;
        boligrafoAzul.tapar();
        System.out.println("Boligrafo Azul Creado! " +
                "Color: " + boligrafoAzul.color +
                " Marca: " + boligrafoAzul.marca );
        boligrafoAzul.destapar();
        System.out.println("Boligrafo Azul Creado! " +
                "Color: " + boligrafoAzul.color +
                " Marca: " + boligrafoAzul.marca );
        boligrafoAzul.escribir("Precio bajo...");
        System.out.println("--------------------------");

        Boligrafo boligrafoRojo = new Boligrafo();
        boligrafoRojo.color = "rojp";
        boligrafoRojo.carga = 100;
        boligrafoRojo.marca = "Pupi";
        boligrafoRojo.punta = 0.5;
        boligrafoRojo.tapar();
        System.out.println("Boligrafo Rojo Creado! " +
                "Color: " + boligrafoRojo.color +
                " Marca: " + boligrafoRojo.marca );
        boligrafoRojo.tapar();
        System.out.println("Boligrafo Rojo Creado! " +
                "Color: " + boligrafoRojo.color +
                " Marca: " + boligrafoRojo.marca );
        boligrafoRojo.escribir("Precio caro...");

        boligrafoAzul.status();
        boligrafoRojo.status();
    }
}