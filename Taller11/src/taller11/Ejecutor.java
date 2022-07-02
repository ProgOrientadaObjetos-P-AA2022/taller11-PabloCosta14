/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller11;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /// Reto1
        ArrayList<Menu> listaMenus = new ArrayList<>();

        MenuNinios n1 = new MenuNinios("Niños 01", 2.00, 1.00, 1.50);
        MenuNinios n2 = new MenuNinios("Niños 02", 3.00, 1.00, 1.50);

        MenuEconomico e1 = new MenuEconomico("Econo 001", 4.00, 25.00);

        MenuDia d1 = new MenuDia("Dia 001", 5.00, 1.00, 1.00);

        MenuCarta c1 = new MenuCarta("Carta 001", 6.0, 1.5, 2.0, 10.00);

        listaMenus.add(n1);
        listaMenus.add(n2);
        listaMenus.add(e1);
        listaMenus.add(d1);
        listaMenus.add(c1);

        for (int i = 0; i < listaMenus.size(); i++) {
            listaMenus.get(i).establecerValorCancelar();
        }
        Cuenta cue = new Cuenta("Rene Elizalde", listaMenus, 10);

        cue.establecerSubtotal();
        cue.establecerValorCancelarTotal();

        System.out.println(cue);
    }
}
