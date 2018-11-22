/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler6; //suma różnicy kwadratowej

/**
 *
 * @author Krzysiek
 */
public class Euler6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        long suma = 0;
        long kwadrat = 0;
        long roznica = 0;
        int suma_liczb = 0;
        for(i=1;i<=100;i++)
        {
            suma_liczb += i;
            kwadrat=i*i;
            suma += kwadrat;
        }
        suma_liczb = suma_liczb * suma_liczb;
        roznica = suma_liczb-suma;
        System.out.println("różnica wynosi: " + roznica);
    }
    
}
