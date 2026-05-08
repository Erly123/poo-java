package ch.l.cafeteria;

public interface MaquinaCafe {
    void encender();
    void apagar();
    void colocarPortafiltro();
    void retirarPortafiltro();
    void seleccionarModo(ModoCafe modoCafe);
    void hacerCafe();

}
