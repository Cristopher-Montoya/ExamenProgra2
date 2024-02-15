package Examprogramacion2;
/**
 *
 * @author crist
 */
final class barcoPesquero extends Barco {
    
    private int pecesCapturados;
    private final tipoPesquero tipo;

    public barcoPesquero(tipoPesquero tipo) {
        super("Barco Pesquero");
        this.tipo = tipo;
        this.pecesCapturados = 0;
    }
    @Override
    public void agregarElemento() {
        pecesCapturados++;
    }

    @Override
    public double vaciarCobrar() {
        double total = pecesCapturados * tipo.price;
        pecesCapturados = 0;
        return total;
    }
    @Override
    public double precioElemento() {
        return tipo.price;
    }
    @Override
    public String toString() {
        return super.toString() + ", Tipo de pesquero: " + tipo.name() + ", Peces Capturados: " + pecesCapturados;
}
}
