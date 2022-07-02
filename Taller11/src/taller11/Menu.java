/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author DELL
 */
public abstract class Menu {

    protected String nombrePlato;
    protected double valorM;
    protected double valorInicialM;
    protected double valorCancelar;
      
    
    public Menu(String a, double n){
        nombrePlato = a;
        valorInicialM = n;
    
    }
    public String obtenerNombrePlato() {
        return nombrePlato;
    }

    public void establecerNombrePlato(String n) {
        nombrePlato = n;
    }

    public double obtenerValorM() {
        return valorM;
    }

    public void establecerValorM(double n) {
        valorM = n;
    }

    public double obtenerValorInicialM() {
        return valorInicialM;
    }

    public void establecerValorInicialM(double n) {
        valorInicialM = n;
    }

    public abstract void establecerValorCancelar();

    public double obtenerValorCancelar() {
        return valorCancelar;
    }

    @Override
    public String toString() {
        String cadena = String.format(""
                + "Nombre del plato: %s\n"
                + "Valor del menu inicial: %.2f\n",
                obtenerNombrePlato(),
                obtenerValorInicialM());
        return cadena;
    }
}
