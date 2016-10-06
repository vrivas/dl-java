/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author vrivas
 */
public class Patata {

    private boolean piel = true;
    private int trozos = 1;

    public void pelar() {
        piel = false;
    }

    public void dividir() {
        trozos *= 2;
    }

    public String comoEstas() {
        return "- " 
                +((piel) ? "Tengo" : "No tengo") + " piel"
                + " y estoy dividida en "
                + trozos
                + " partes";
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Patata papa=new Patata();
        
        System.out.println("*** Comienza el programa *** ");
        
        System.out.println("+ ¿Cómo estás, patata?");
        System.out.println(papa.comoEstas());
        
        System.out.println("+ Ok. Voy a pelarte y dividirte un par de veces");
        papa.pelar();
        papa.dividir();
        papa.dividir();
        
        System.out.println("+ ¿Cómo estás ahora?");
        System.out.println(papa.comoEstas());

    }

}
