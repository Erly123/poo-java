package ch.l.enums;

public enum NivelAcceso {
    ADMIN("Administrador del sistema"),
    USUARIO("Usuario del sistema"),
    INVITADO("Invitado del sistema");

    private String descripcion;

    NivelAcceso(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return this.descripcion;
    }
}
