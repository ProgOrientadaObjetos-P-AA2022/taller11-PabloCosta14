/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author DELL
 */
public class MenuEconomico extends Menu {

    private double porcentajeDescuento;

    public MenuEconomico(String nom, double vI, double porc) {
        super(nom, vI);
        porcentajeDescuento = porc;
    }

    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void establecerPorcentajeDescuento(double n) {

        porcentajeDescuento = n;
    }

    @Override
    public void establecerValorCancelar() {
        valorCancelar = valorInicialM - ((porcentajeDescuento * valorInicialM) / 100);
    }

    @Override
    public String toString() {
        String cadena = String.format("Menu Economico: \n%s", super.toString());
        cadena = String.format("%sValor del PorcentajeDescuento: %.2f\n"
                + "Valor del Menu:  %.2f\n",
                cadena,
                obtenerPorcentajeDescuento(), obtenerValorCancelar());
        return cadena;
    }

}
