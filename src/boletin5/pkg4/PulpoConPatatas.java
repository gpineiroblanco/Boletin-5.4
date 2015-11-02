/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5.pkg4;

/**
 *
 * @author Toshiba
 */
public class PulpoConPatatas {
    
    private int pulpo;
    private int patatas;
    private int clientes;

    public PulpoConPatatas() {

    }

    public PulpoConPatatas(int pulpo, int patatas) {

    }

    public int atenderClientes(int p, int t) {
        pulpo = p;
        patatas = t;
        do {
            pulpo -= 2;
            patatas -= 1;
            clientes += 3;
        } while (pulpo >= 2 && patatas >= 1);
        return clientes;
    }

    public void setPulpo(int x) {
        pulpo = x;
    }

    public void setPatatas(int y) {
        patatas = y;
    }

    public void getPulpo() {
        System.out.println("Pulpo: " + pulpo);
    }

    public void getPatatas() {
        System.out.println("Patatas: " + patatas);
    }
}
