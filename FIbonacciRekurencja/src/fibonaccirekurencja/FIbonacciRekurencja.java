/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonaccirekurencja;

/**
 *
 * @author Krzysiek
 */
public class FIbonacciRekurencja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Fibonacci liczba = new Fibonacci();    // utworzenie OBIEKTU liczba 
    System.out.println(liczba.obiektfib(50));
    
    }
}
class Fibonacci    // Stworzenie Klasy FIbonacci która może mieć w sobie wiele metod ( funkcji)
{
    long obiektfib(int wyraz)    // metoda obiektfib(z parametrem wyraz)
    {
        return wyraz<2? wyraz : obiektfib(wyraz - 1) + obiektfib(wyraz - 2); // jesli przeslana zmienna jest mniejsza niz 2 to zwracamy jej wartość. jeśli nie to robimy rekurencje funkcji obiektfib
    }
}