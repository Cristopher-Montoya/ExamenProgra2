/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examprogramacion2;
import java.util.Date;

abstract class Barco {
    private final String nombre;
    private final Date fechaCirculacion;

    public Barco(String nombre) {
        this.nombre = nombre;
        this.fechaCirculacion = new Date();
    }

    public final String getNombre() {
        return nombre;
    }

    public final Date getFechaPuestaEnCirculacion() {
        return new Date(fechaCirculacion.getTime());
    }

    @Override
    public String toString() {
        return "Nombre pasajero: "+nombre;
    }

    public abstract void agregarElemento();

    public abstract double vaciarCobrar();

    public abstract double precioElemento();
}
