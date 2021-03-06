/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author DELL
 */
public class MenuNinios extends Menu {

    private double valorPorcionHelado;
    private double valorPorcionPastel;

    public MenuNinios(String nom, double vI, double vH, double vP) {
        super(nom, vI);
        valorPorcionHelado = vH;
        valorPorcionPastel = vP;

    }

    public double obtenerValorPorcionHelado() {
        return valorPorcionHelado;
    }

    public void establecerValorPorcionHelado(double n) {
        valorPorcionHelado = n;
    }

    public double obtenerValorPorcionPastel() {
        return valorPorcionPastel;
    }

    public void establecerValorPorcionPastel(double n) {
        valorPorcionPastel = n;
    }

    @Override
    public void establecerValorCancelar() {
        valorCancelar = valorInicialM
                + valorPorcionHelado + valorPorcionPastel;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menu del Dia\n%s", super.toString());
        cadena = String.format("%sValor Porcion de Helado: %.2f\n"
                + "Valor Porcion de Pastel %.2f\nValor del Menu: %.2f\n",
                cadena,
                obtenerValorPorcionHelado(), obtenerValorPorcionPastel(),
                obtenerValorCancelar());
        return cadena;
    }
}
