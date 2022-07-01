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
    protected ArrayList<Menu> menu;
    protected double valorCancelarTotal;
    protected double subtotal;
    protected double iva;

    public String obtenerNombre() {
        return nombre;
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
    public void establecerValorCancelar(){
       valorCancelarTotal = subtotal + (iva * subtotal)/100;
    
    }
    public double obtenerValorCancelar() {
        return valorCancelarTotal;
    }

    public double obtenerSubtotal() {
        return subtotal;
    }

    public void establecerSubtotal() {
        for (int i = 0; i < menu.size(); i++) {
            subtotal = subtotal + menu.get(i).obtenerValorM();
        }
    }

    public double obtenerIva() {
        return iva;
    }

    public void establecerIva() {
        iva = 0.10;
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
                + "Subtotal: %.2f\n"
                + "IVA: %.2f\n"
                + "Total a pagar: %.2f\n",
                cadena,
                obtenerSubtotal(),
                obtenerIva(),
                obtenerValorCancelar());

        return cadena;
    }
}
