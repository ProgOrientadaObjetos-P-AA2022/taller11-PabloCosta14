/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author DELL
 */
public class MenuCarta extends Menu {

    private double valorPorcionGuarnicion;
    private double valorBebida;
    private double porcentajeServ;

    public double obtenerPorcentajeServ() {
        return porcentajeServ;
    }

    public void establecerPorcentajeServ(double n) {
        // porcentajeServ = (n * obtenerValorM()) / 100;
        porcentajeServ = n;
    }

    public double obtenerValorPorcionGuarnicion() {
        return valorPorcionGuarnicion;
    }

    public void establecerValorPorcionGuarnicion(double n) {
        valorPorcionGuarnicion = n;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }

    public void establecerValorBebida(double n) {
        valorBebida = n;
    }

    @Override
    public void establecerValorCancelar() {
        valorCancelar = valorM + ValorInicialM + valorPorcionGuarnicion
                + valorBebida + porcentajeServ;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menu a la Carta\n%s", super.toString());
        cadena = String.format("%sValor de porcion de guarnicion %.2f\n"
                + "Valor De Bebida %.2f\n"
                + "Porcentaje Adicional %s\n"
                + "Valor del Menu:  %.2f\n", cadena,
                obtenerValorPorcionGuarnicion(),
                obtenerValorBebida(),
                obtenerPorcentajeServ(), obtenerValorCancelar());
        return cadena;
    }
}
