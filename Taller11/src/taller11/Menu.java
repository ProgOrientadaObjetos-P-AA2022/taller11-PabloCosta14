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
    protected String NombrePlato;
    protected double valorM;
    protected double ValorInicialM;
    protected double valorCancelar;

    public String obtenerNombrePlato() {
        return NombrePlato;
    }

    public void establecerNombrePlato(String n) {
        NombrePlato = n;
    }

    public double obtenerValorM() {
        return valorM;
    }

    public void establecerValorM(double n) {
        valorM = n;
    }

    public double obtenerValorInicialM() {
        return ValorInicialM;
    }

    public void establecerValorInicialM(double n) {
        ValorInicialM = n;
    }
    
     public abstract void establecerValorCancelar();    
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
