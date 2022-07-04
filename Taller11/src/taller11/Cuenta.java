/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class Cuenta {

    private String nombre;
    private ArrayList<Menu> menu;
    private double valorCancelarTotal;
    private double subtotal;
    private double iva;

    public String obtenerNombre() {
        return nombre;
    }

    public Cuenta(String n, ArrayList m, double i) {
        nombre = n;
        menu = m;
        iva = i;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public ArrayList<Menu> obtenerMenu() {
        return menu;
    }

    public void establecerMenu(ArrayList<Menu> n) {
        menu = n;
    }

    public void establecerValorCancelarTotal() {
        valorCancelarTotal = subtotal + (iva * subtotal) / 100;

    }

    public double obtenerValorCancelarTotal() {
        return valorCancelarTotal;
    }

    public double obtenerSubtotal() {
        return subtotal;
    }

    public void establecerSubtotal() {

        for (int i = 0; i < menu.size(); i++) {
            subtotal = subtotal + menu.get(i).obtenerValorCancelar();
        }
    }

    public double obtenerIva() {
        return iva;
    }

    public void establecerIva(double n) {
        iva = n;
    }

    @Override
    public String toString() {
        String cadena = String.format("Factura\n"
                + "Cliente: %s\n",
                obtenerNombre());

        for (int i = 0; i < obtenerMenu().size(); i++) {
            cadena = String.format("%s%s\n",
                    cadena,
                    obtenerMenu().get(i));
        }

        cadena = String.format("\n%s"
                + "Subtotal: %.1f\n"
                + "IVA: %.2f\n"
                + "Total a pagar: %.3f\n",
                cadena,
                obtenerSubtotal(),
                obtenerIva(),
                obtenerValorCancelarTotal());

        return cadena;
    }
}
