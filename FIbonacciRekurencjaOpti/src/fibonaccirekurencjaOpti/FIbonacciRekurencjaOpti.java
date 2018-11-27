/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonaccirekurencjaOpti;

/**
 *
 * @author Krzysiek
 */
public class FIbonacciRekurencjaOpti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
    Fibonacci liczba = new Fibonacci();    // utworzenie OBIEKTU liczba 
    System.out.println("50 wyraz ciągu Fibonacciego to : " + liczba.obiektfib(50));
    }
}
class Fibonacci    // Stworzenie Klasy FIbonacci która może mieć w sobie wiele metod ( funkcji)
{
    long[] tablica = new long[51]; //stworzenie tablicy do przechowywania porownywanych n'tych liczb
    long obiektfib(int wyraz)    // metoda obiektfib(z parametrem wyraz)
    {
        if(wyraz < 2 ) // "granica rekurencji" w tym miejscu pod wyraz-1 podrzucamy wartość
        {
            if(tablica[wyraz] == 0)  // sprawdzamy czy komorka jest pusta
            {
                if(wyraz == 0) //sprawdzamy czy wyraz nie jest 0 
                {
                    tablica[wyraz]=0; // jesli tak zwracamy 0
                    return 0;
                }
                if(wyraz == 1) //sprawdzam czy wyraz nie jest 1 
                {
                    tablica[wyraz]=1; // jesli tak zwracamy 1
                    return 1;
                }
                tablica[wyraz]=tablica[wyraz-1]+tablica[wyraz-2]; // komórka jest pusta więc nadajemy jej wartość              
            }
            return tablica[wyraz]; //zwracamy wartosc 2 wyrazu
        }
        if(tablica[wyraz] != 0)  // sprawdzamy czy komorka jest pusta
            {
                return tablica[wyraz]; // jesli komorka nie jest pusta to zwracamy te wartosc
            }
        else
            tablica[wyraz]=tablica[wyraz-1]+tablica[wyraz-2]; // komorka jest pusta więc nadajemy jej wartość 
                return obiektfib(wyraz-1)+obiektfib(wyraz-2); //rekurencja odnosimy cały czas cofamy się do tego miejsca tworząc drzewo !!
    }
} 