/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibbonaccitablica;

/**
 *
 * @author Krzysiek
 */
public class FibbonacciTablica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        long[] tab;                         //deklaracja tablicy
        tab = new long[51];                 // stworzenie tablicy 50 znakowej
        tab[0] = 0;
        tab[1] = 1;
        for(i=2;i<=tab.length-1;i++)
        {
            tab[i]=tab[i-1]+tab[i-2];      //przypisywanie kolejnych wartości do danych komórek
        }
        System.out.println(i-1  + " liczba ciągu Fibbonacciego wynosi: " + tab[i-1]); // wypisanie wskazanej liczby ciągu Fibbonacciego
    }
    
}
