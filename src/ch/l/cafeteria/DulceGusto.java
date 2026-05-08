package ch.l.cafeteria;

public class DulceGusto implements MaquinaCafe {
    private boolean encendida;
    private boolean calentadorEncendido;
    private boolean poseeCapuchino;
    private ModoCafe modoCafeSeleccionado;
    private int ctdAguaCaldera;


    @Override
    public void encender() {
        System.out.println("Encendiendo Dulce Gusto");
        this.encendida = true;

    }

    @Override
    public void apagar() {
        System.out.println("Apagando Dulce Gusto");
        this.encendida = false;
    }

    @Override
    public void colocarPortafiltro() {
        System.out.println("Portafiltro colocado");
        this.poseeCapuchino = true;

    }

    @Override
    public void retirarPortafiltro() {
        System.out.println("Portafiltro retirado");
        this.poseeCapuchino = false;
    }

    @Override
    public void seleccionarModo(ModoCafe modoCafe) {
        System.out.println("Modo de cafe selecionado: " + modoCafe.getDescripcion());
        this.modoCafeSeleccionado = modoCafe;
    }

    @Override
    public void hacerCafe() {

    }
    private  void añadirAguaCaldera(int ctdAguaCaldera) {
        System.out.println("Añadiendo " + ctdAguaCaldera + "ml de agua en la cladera...");
        this.ctdAguaCaldera = ctdAguaCaldera;
    }
    private  void vaciarAguaCaldera() {
        System.out.println("Vaciando" + this.ctdAguaCaldera + "ml de la caldera...");
        this.ctdAguaCaldera = 0;
        System.out.println("Caldera vaciada...");
    }
    private void conectarCalentador() {
        System.out.println("Conectando el calentador...");
        this.calentadorEncendido = true;
    }
    private void desconectarCalentador() {
        System.out.println("Desconectando el calentador...");
        this.calentadorEncendido = false;
    }

}
