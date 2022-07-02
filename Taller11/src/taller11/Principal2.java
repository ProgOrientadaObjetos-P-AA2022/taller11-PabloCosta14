/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

import java.util.ArrayList;

/**
 *
 * @author UTPL
 */
public class Principal2 {

    public static void main(String[] args) {

        //RETO 2
        String[][] datos001 = {{"Niños 01", "2.00", "1", "1.5"},
        {"Niños 02", "3.00", "1", "1.5"},
        {"Niños 03", "2.00", "2", "0.5"},};

        String[][] datos002 = {{"Econo 001", "4", "25"},
        {"Econo 002", "4", "15"},
        {"Econo 003", "4", "35"}
        };

        String[][] datos003 = {{"Dia 001", "5", "1", "1"},
        {"Dia 002", "6", "2", "2"},
        {"Dia 003", "5.5", "3", "1"},};

        String[][] datos004 = {{"Carta 001", "6", "1.5", "2", "10"},
        {"Carta 002", "7", "1.7", "2.1", "5"},
        {"Carta 003", "8", "1.9", "2.2", "5"},
        {"Carta 004", "9", "2.5", "2.9", "5"},};

        // Lista de Menus
        ArrayList lista = new ArrayList<>();

        /* Agregar un proceso para generar objetos de tipo Menu Carta, Día, 
        Economico y Niño*. Cada arreglo datos, se corresponde a un tipo de Menú.
        Iterar y crear los objetos según corresponda. Cada objeto generado, 
        agregar al ArrayList lista*/
        // Inicio de solución
        for (int i = 0; i < datos001.length; i++) {
            String nombreP = datos001[i][0];
            double valorInicial = Double.parseDouble(datos001[i][1]);
            double valorHel = Double.parseDouble(datos001[i][2]);
            double valorPas = Double.parseDouble(datos001[i][3]);

            MenuNinios n1 = new MenuNinios(nombreP, valorInicial, valorHel,
                    valorPas);
            n1.establecerValorCancelar();
            lista.add(n1);
        }

        for (int i = 0; i < datos002.length; i++) {
            String nombreP = datos002[i][0];
            double valorInicial = Double.parseDouble(datos002[i][1]);
            double porcentaje = Double.parseDouble(datos002[i][2]);

            MenuEconomico n2 = new MenuEconomico(nombreP, valorInicial, porcentaje);
            n2.establecerValorCancelar();
            lista.add(n2);
        }

        for (int i = 0; i < datos003.length; i++) {
            String nombreP = datos002[i][0];
            double valorInicial = Double.parseDouble(datos003[i][1]);
            double bebida = Double.parseDouble(datos003[i][2]);
            double postre = Double.parseDouble(datos003[i][3]);

            MenuDia n3 = new MenuDia(nombreP, valorInicial, bebida, postre);
            n3.establecerValorCancelar();
            lista.add(n3);
        }

        for (int i = 0; i < datos004.length; i++) {

            String nombreP = datos004[i][0];
            double valorInicial = Double.parseDouble(datos004[i][1]);
            double guarnicion = Double.parseDouble(datos004[i][2]);
            double bebida = Double.parseDouble(datos004[i][3]);
            double porcen = Double.parseDouble(datos004[i][4]);

            MenuCarta n4 = new MenuCarta(nombreP, valorInicial, guarnicion,
                    bebida, porcen);
            n4.establecerValorCancelar();
            lista.add(n4);
        }

        // Fin de solución
        /*for (int i = 0; i < lista.size(); i++) {
            lista.get(i).establecerValorCancelar;
        }
         */
        // Un objeto de tipo Cuenta
        Cuenta miCuenta = new Cuenta("Luis Andrade", lista, 10);
        miCuenta.establecerSubtotal();
        miCuenta.establecerValorCancelarTotal();
        System.out.printf("%s\n", miCuenta);

    }
}
