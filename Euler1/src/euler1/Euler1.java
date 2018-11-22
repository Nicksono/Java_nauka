/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler1;

/**
 *
 * @author Krzysiek
 */
public class Euler1 { //suma wszystkich liczb naturalnych podzielnych przez 3 i 5 bez reszty mniejszych niż 1000

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        int suma=0;
        for(i=3;i<1000;i++)
        {
            if(i%3==0 || i%5==0)
            {
                suma=suma+i;
            }
        }
        System.out.println(suma);
    }
    
}
