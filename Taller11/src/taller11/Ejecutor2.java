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
public class Ejecutor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Cuenta cue = new Cuenta();
        ArrayList<Menu> listaMenus = new ArrayList<>();

         cue.establecerMenu(listaMenus);
        cue.establecerNombre("Pablo Costa Torres");
       

        MenuNinios n1 = new MenuNinios();
        MenuNinios n2 = new MenuNinios();

        n1.establecerNombrePlato("Niños01");
        n1.establecerValorInicialM(2.00);
        n1.establecerValorPorcionHelado(1.00);
        n1.establecerValorPorcionPastel(1.50);
        n1.establecerValorM(4.50);
        

        n2.establecerNombrePlato("Niños02");
        n2.establecerValorInicialM(3.00);
        n2.establecerValorPorcionHelado(1.50);
        n2.establecerValorPorcionPastel(1.50);
        n2.establecerValorM(5.50);
      
        MenuEconomico e1 = new MenuEconomico();
        e1.establecerNombrePlato("Econo 001");
        e1.establecerValorInicialM(4.00);
        e1.establecerPorcentajeDescuento(25.00);
        

        MenuDia d1 = new MenuDia();
        d1.establecerNombrePlato("Dia 001");
        d1.establecerValorInicialM(5.00);
        d1.establecerValorBebida(1.00);
        d1.establecerValorPostre(1.00);
      

        MenuCarta c1 = new MenuCarta();
        c1.establecerNombrePlato("Carta 001");
        c1.establecerValorInicialM(6.0);
      
        c1.establecerValorPorcionGuarnicion(1.5);
        c1.establecerValorBebida(2.0);
        c1.establecerPorcentajeServ(10.00);

        listaMenus.add(n1);
        listaMenus.add(n2);
        listaMenus.add(e1);
        listaMenus.add(d1);
        listaMenus.add(c1);
        
     
        cue.establecerSubtotal();
        cue.establecerIva();

        
        for (int i = 0; i < listaMenus.size(); i++) {
            listaMenus.get(i).establecerValorCancelar();
        }
        
        //System.out.println(listaMenus.get(1).obtenerValorCancelar());
        cue.establecerValorCancelar();
       System.out.println(cue);
    }
}
