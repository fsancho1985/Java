/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresmatematicos;

/**
 *
 * @author fr_sa
 */
public class OperadoresMatematicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2)/2;
        System.out.println("A média é " + m);
        */
        
       /* int numero = 5;
        int valor = 5 + numero++;
        System.out.println(numero);
        System.out.println(valor++);
        */
       
       /*int x = 4;
       x += 2; //x = x + 2
       System.out.println(x);
       */
       
       /*float v = 8.3f;
       //int ar =(int) Math.floor(v);
       //int ar = (int) Math.round(v);
       //int ar = (int) Math.abs(v);
       int ar = (int) Math.ceil(v);
       System.out.println(ar);
       */
       
       double ale = Math.random();
       int n = (int) (1 + ale * (60-1));
       System.out.println(ale);
       System.out.println(n);
    }
    
}
