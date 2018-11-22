/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacciobiekt;

/**
 *
 * @author Krzysiek
 */
public class FibonacciObiekt {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
        Fib fib = new Fib();  //utowrzenie obiektu fib w klasie Fib
        long wynik = fib.fibonacci(51);
        System.out.println(wynik);
    }
    
}

class Fib   //utworzenie klasy Fib
{
    long fibonacci(int rozmiar)  //Stworzenie metody Fibonacci do której przekazujemy argument rozmiar
    {
        int i;
        long[] wyrazy;
        wyrazy = new long[rozmiar];
        wyrazy[0] = 0;
        wyrazy[1] = 1;
        for(i=2;i<=rozmiar-1;i++)
        {
            wyrazy[i] = wyrazy [i-2] + wyrazy[i-1];
        }
        return wyrazy[rozmiar-1];
    }
}