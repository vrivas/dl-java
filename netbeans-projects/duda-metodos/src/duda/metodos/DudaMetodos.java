/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duda.metodos;

/**
 *
 * @author vrivas
 */
public class DudaMetodos {

    static int metodo1(int b) {
        b = 6;
        return b;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int a = 5;
        int c = metodo1(a);
        System.out.println(a);  // mostrará 5 
        System.out.println(c);  // mostrará 6
    }

}
