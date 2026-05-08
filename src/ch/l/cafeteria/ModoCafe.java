package ch.l.cafeteria;

public enum ModoCafe {
    EXPRESO("Cafe Expreso"),
    AMERICANO("Cafe Americano"),
    CORTADO("Cafe Cortado");

    private String descripcion;

    ModoCafe(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return this.descripcion;
    }
}
