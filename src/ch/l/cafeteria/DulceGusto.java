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
        if (this.esEncendida()) {
            if (this.poseeCapuchino) {
                if (this.modoCafeSeleccionado != null) {
                    this.añadirAguaCaldera(300);
                    this.conectarCalentador();
                    System.out.println("Haciendo " + this.modoCafeSeleccionado.getDescripcion() + "...");
                    System.out.println("Café listo!");
                    this.vaciarAguaCaldera();
                    this.desconectarCalentador();
                } else {
                    System.out.println("Modo de Cafe no fue selecionado. Selecione antes de proseguir.");
                }
            } else {
                System.out.println("Dolce Gusto está sem o cachimbo. Coloque o cachimbo com o pó de café.");
            }
        } else {
            System.out.println("Dolce Gusto está desligada.");
        }

    }
    private boolean esEncendida() {
        return this.encendida;
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
