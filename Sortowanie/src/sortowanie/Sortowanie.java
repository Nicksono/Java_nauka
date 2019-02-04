/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortowanie;

import java.util.Random;

/**
 *
 * @author Krzysiek
 */
public class Sortowanie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int maks = 100; //gorny zakres losowanych liczb
        int rozmiar = 10;
        int najmniejsza = 0;
        Kroki dzialania = new Kroki();
        System.out.println("Wylosowana (zakres 0 - 100) tablica o długości wskazanej prezentuje się następująco ");
        int[] tablica = new int[rozmiar];
        tablica=dzialania.losowanie(rozmiar);
        for(int i = 0 ; i < rozmiar ; i++)
        {
            System.out.print(tablica[i] + " | ");
        }
        int[] posortowana = new int[rozmiar];
        posortowana = dzialania.babelkowe(rozmiar, tablica);
        System.out.println();
        System.out.println("Posortowana tablica prezentuje się następująco ");
        for(int i = 0 ; i < rozmiar ; i++)
        {
            System.out.print(posortowana[i] + " | ");
        }
        
        // TODO code application logic here
    }
    
}

class Kroki
{
    int[] losowanie(int rozmiar)
    {
        int[] tablica = new int[rozmiar];
        Random liczba = new Random();
        for(int i = 0; i < rozmiar ; i++)
        {
            tablica[i]=liczba.nextInt(101);
        }
        return tablica;
    }
    int[] babelkowe(int rozmiar, int[] tab) // sortowanie bąbelkowe 
    {
        int bufor;
        do
        {
            for ( int i = 0 ; i < rozmiar - 1 ; i++)
            {
                if (tab[i] > tab[i+1])
                {
                    bufor = tab[i];
                    tab[i] = tab[i+1];
                    tab[i+1] = bufor;
                }
            }
        rozmiar = rozmiar - 1;
        }
        while (rozmiar >1);
            return tab;
    }
}
