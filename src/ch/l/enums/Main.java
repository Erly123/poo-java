package ch.l.enums;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Usuario erly = new Usuario("Erly",
                                    NivelAcceso.ADMIN,
                                    "chl@gmail.com");
        erly.mostrarInfo();
        Usuario maria = new Usuario("Maria",
                                    NivelAcceso.INVITADO,
                                    "m@gmail.com");
        maria.mostrarInfo();
    }
}
