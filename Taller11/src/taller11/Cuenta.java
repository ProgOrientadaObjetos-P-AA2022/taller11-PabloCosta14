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

    protected String nombre;
    protected ArrayList<Menu> Menu;
    protected double valorCancelar;
    protected double subtotal;
    protected double iva;

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public ArrayList<Menu> obtenerMenu() {
        return Menu;
    }

    public void establecerMenu(ArrayList<Menu> n) {
        Menu = n;
    }

    public double obtenerValorCancelar() {
        return valorCancelar;
    }

    public double obtenerSubtotal() {
        return subtotal;
    }

    public void establecerSubtotal(double n) {
        subtotal = n;
    }

    public double obtenerIva() {
        return iva;
    }

    public void establecerIva() {
        iva = 0.10;
    }

    @Override
    public String toString() {
        String cadena = String.format("Datos Del Usuario/Cliente\n"
                + "Nombre del cliente: %s\n",
                obtenerNombre());

        for (int i = 0; i < obtenerMenu().size(); i++) {
            cadena = String.format("%s%s\n",
                    cadena,
                    obtenerMenu().get(i));
        }

        cadena = String.format("\n%s"
                + "Subtotal: %.2f\n"
                + "Valor Del IVA: %.2f\n"
                + "Total a pagar: %.2f\n",
                cadena,
                obtenerSubtotal(),
                obtenerIva(),
                obtenerValorCancelar());

        return cadena;
    }
}
