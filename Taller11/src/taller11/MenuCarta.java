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
    
    
    public MenuCarta(String nom, double vI,double vG,double vB,double porc){
    super(nom,vI);
    valorPorcionGuarnicion = vG;
    valorBebida = vB;
    porcentajeServ = porc;
    }

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
        valorCancelar = valorM + valorInicialM + valorPorcionGuarnicion
                + valorBebida + (valorInicialM * porcentajeServ / 100);
    }

    @Override
    public String toString() {
        String cadena = String.format("Menu a la Carta:\n%s", super.toString());
        cadena = String.format("%sValor de porcion de guarnicion %.1f\n"
                + "Valor De Bebida %.1f\n"
                + "Porcentaje Adicional %.2f\n"
                + "Valor del Menu: %.2f\n", cadena,
                obtenerValorPorcionGuarnicion(),
                obtenerValorBebida(),
                obtenerPorcentajeServ(), obtenerValorCancelar());
        return cadena;
    }
}
