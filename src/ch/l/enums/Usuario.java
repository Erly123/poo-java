package ch.l.enums;

public class Usuario {
    private String nombre;
    private NivelAcceso nivelAcceso;
    private String email;

    public Usuario(String nombre, NivelAcceso nivelAcceso, String email) {
        this.nombre = nombre;
        this.nivelAcceso = nivelAcceso;
        this.email = email;
    }

    public String getNombre() {
        return this.nombre;
    }

    public NivelAcceso getNivelAcceso() {
        return this.nivelAcceso;
    }

    public String getEmail() {
        return this.email;
    }
    public void mostrarInfo() {
        System.out.println("===============================");
        System.out.println("Nome: " + this.nombre);
        System.out.println("Email: " + this.email);
        System.out.println("Nivel de aceeso: " + this.nivelAcceso.getDescripcion());
        System.out.println("===============================");
    }
}
