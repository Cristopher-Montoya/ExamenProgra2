package Examprogramacion2;
/**
 *
 * @author crist
 */

import javax.swing.JOptionPane;
final class barcoPasajero extends Barco {
    private final String[] nombresPasajeros;
    private final double precioBoleto;
    private int contadorPasajeros;
    public barcoPasajero(int capacidadMaxima, double precioBoleto) {
        super("Barco Pasajero");
        this.nombresPasajeros = new String[capacidadMaxima];
        this.precioBoleto = precioBoleto;
        this.contadorPasajeros = 0;
    }
    @Override
    public void agregarElemento() {
        if (contadorPasajeros < nombresPasajeros.length) {
          String nombre = JOptionPane.showInputDialog("Ingresar nombre: ").toUpperCase();

          nombresPasajeros[contadorPasajeros++] = nombre;
        } else {
    JOptionPane.showMessageDialog(null, "Barco lleno.");
        }
    }
    @Override
    public double vaciarCobrar() {
        double total=contadorPasajeros * precioBoleto;
        contadorPasajeros = 0;
        return total;
    }
    @Override
    public double precioElemento() {
        return precioBoleto;
    }
    @Override
    public String toString() {
        return super.toString() + ", Cantidad de Pasajeros que compraron boleto: " + contadorPasajeros;
    }
    public void listarPasajeros() {
        JOptionPane.showMessageDialog(null, "Pasajeros que han ingresado: ");
        listarPasajerosRecursividad(0);
    }
    private int listarPasajerosRecursividad(int cont) {
        if (cont<contadorPasajeros) {
            System.out.println(nombresPasajeros[cont]);
           return listarPasajerosRecursividad(cont+ 1);
        }
        return 0;

    }
}