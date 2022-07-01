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

        Cuenta cue = new Cuenta();
        ArrayList<Menu> listaMenus = new ArrayList<>();
        
        cue.establecerMenu(listaMenus);
        cue.establecerNombre("Pablo Costa Torres");
        cue.establecerSubtotal(20);
        cue.establecerIva();
        
        
        MenuNinios n1 = new MenuNinios();
        MenuNinios n2 = new MenuNinios();
        
        n1.establecerNombrePlato("Cena Infantil");
        n1.establecerValorInicialM(6);
        n1.establecerValorPorcionHelado(1.00);
        n1.establecerValorPorcionPastel(4.20);
        n1.establecerValorCancelar();
        n2.establecerNombrePlato("Almuerzo infantil");
        n2.establecerValorInicialM(5);
        n2.establecerValorPorcionHelado(0.50);
        n2.establecerValorPorcionPastel(2.20);
        
        MenuEconomico e1 = new MenuEconomico();
        e1.establecerNombrePlato("Cuarto de pollo");
        e1.establecerValorInicialM(3.50);
        e1.establecerPorcentajeDescuento(10);
        
        MenuDia d1 = new MenuDia();
        d1.establecerNombrePlato("Camarones Reventados");
        d1.establecerValorInicialM(5.00);
        d1.establecerValorBebida(1.00);
        d1.establecerValorPostre(0.50);
        
        MenuCarta c1 = new MenuCarta();
        c1.establecerNombrePlato("Lasaña Inglesa");
        c1.establecerValorInicialM(8.00);
        c1.establecerValorM(10.00);
        c1.establecerValorPorcionGuarnicion(3.50);
        c1.establecerValorBebida(2.00);
        c1.establecerPorcentajeServ(32);
        
        listaMenus.add(n1);
        listaMenus.add(n2);
        listaMenus.add(e1);
        listaMenus.add(d1);
        listaMenus.add(c1);
        
        for (int i = 0; i < listaMenus.size(); i++) {
            listaMenus.get(i).establecerValorCancelar();
        }
        
        System.out.println(cue);
    }
}
