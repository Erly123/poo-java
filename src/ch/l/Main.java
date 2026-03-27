package ch.l;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Boligrafo boligrafoAzul = new Boligrafo();
        boligrafoAzul.color = "azul";
        boligrafoAzul.tapada = false;
        boligrafoAzul.carga = 100;
        boligrafoAzul.marca = "Layconsa";
        boligrafoAzul.punta = 0.5;
        boligrafoAzul.tapar();
        System.out.println("Boligrafo Azul Creado! " +
                "Color: " + boligrafoAzul.color +
                " Marca: " + boligrafoAzul.marca +
                " Tapada: " + boligrafoAzul.tapada );
        boligrafoAzul.destapar();
        System.out.println("Boligrafo Azul Creado! " +
                "Color: " + boligrafoAzul.color +
                " Marca: " + boligrafoAzul.marca +
                " Tapada: " + boligrafoAzul.tapada);
        boligrafoAzul.escribir("Precio bajo...");
        System.out.println("--------------------------");

        Boligrafo boligrafoRojo = new Boligrafo();
        boligrafoRojo.color = "rojp";
        boligrafoRojo.tapada = false;
        boligrafoRojo.carga = 100;
        boligrafoRojo.marca = "Pupi";
        boligrafoRojo.punta = 0.5;
        boligrafoRojo.destapar();
        System.out.println("Boligrafo Rojo Creado! " +
                "Color: " + boligrafoRojo.color +
                " Marca: " + boligrafoRojo.marca +
                " Tapada: " + boligrafoRojo.tapada);
        boligrafoRojo.tapar();
        System.out.println("Boligrafo Rojo Creado! " +
                "Color: " + boligrafoRojo.color +
                " Marca: " + boligrafoRojo.marca +
                " Tapada: " + boligrafoRojo.tapada);
        boligrafoRojo.escribir("Precio caro...");
    }
}