/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author DELL
 */
public class MenuDia extends Menu {

    private double valorPostre;
    private double valorBebida;

    public double obtenerValorPostre() {
        return valorPostre;
    }

    public void establecerValorPostre(double n) {
        this.valorPostre = n;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }

    public void establecerValorBebida(double n) {
        this.valorBebida = n;
    }

    @Override
    public void establecerValorCancelar() {
        valorCancelar = ValorInicialM
                + valorPostre + valorBebida;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menu del Dia\n%s", super.toString());
        cadena = String.format("%sValor del Postre: %.2f\n"
                + "Valor De Bebida: %.2f\nValor del Menu:  %.2f\n",
                cadena,
                obtenerValorPostre(),
                obtenerValorBebida(), obtenerValorM());
        return cadena;
    }

}
