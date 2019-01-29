
package iloczynskalarny;

import java.util.Arrays; // zmiana tablicy na stringa
import java.util.Random; // losowanie liczb
/**
 *
 * @author Krzysiek
 */
public class IloczynSkalarny {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int rozmiar_tablic = 5; //rozmiar tablic na ktorych będziemy pracować
        Iloczyn obiekt = new Iloczyn(); // stworzenie obiektu w którym będą nasze metody
        int[] tab1 = new int[rozmiar_tablic]; //stworzenie tablicy z danymi
        int[] tab2 = new int[rozmiar_tablic]; //stowrzenie drugiej tablicy  
        for (int i = 0 ; i < rozmiar_tablic ; i++)  // wpisanie losowych wartości do tablic
         {
             tab1[i] = obiekt.losowanie1();
             tab2[i] = obiekt.losowanie1();
         }
        System.out.println("Twoja pierwsza tablica to : ");
        for (int i = 0 ; i < rozmiar_tablic ; i++)
         {
             System.out.println(i + " wyraz tablicy to: " + tab1[i]);
         }
        System.out.println("Twoja druga tablica to : ");
        for (int i = 0 ; i < rozmiar_tablic ; i++)
         {
             System.out.println(i + " wyraz tablicy to: " + tab2[i]);
         }
        int wynik_iloczynu=obiekt.skalar(tab1, tab2, rozmiar_tablic); //przechowuje w pamieci wartosc iloczynu skalarnego bo bedzie potrzebny wiecej niz raz 
        System.out.println("Iloczyn skalarny tych tablic wynosi: " + wynik_iloczynu);
        System.out.println("Rzut wektoru a na wektor b tworzy nam następujący wektor: " + Arrays.toString(obiekt.rzut(tab2, wynik_iloczynu, rozmiar_tablic)));
        System.out.println("Iloczyn wektorowy tych liczb to wektor: " + Arrays.toString(obiekt.iloczyn_wektorowy(tab1, tab2, rozmiar_tablic)));
    }
    
}

class Iloczyn
{
    int losowanie1()
    {
        int los;
        Random liczba = new Random(); //tworze obiekt liczba ktory posluzy mi do losowania
        los = liczba.nextInt(11);
        return los;
    }

    int skalar(int[]tab1, int[]tab2, int rozmiar)
    {
        int wynik=0;
        for(int i = 0 ; i<= rozmiar-1 ; i++) // mnoże kolejne elementy wektorów przez siebie i sumuje
        {
            wynik = (tab1[i] * tab2[i]) + wynik;
        }
        return wynik;
    }
    int[] iloczyn_wektorowy(int[]tab1, int[]tab2, int rozmiar)
    {
        int[] tab3 = new int[rozmiar];
        for(int i = 0;;i++)
        {
            if (i == rozmiar-1) //ze wzoru na wyliczam wyznaczniki macierzy kolejnych elementow. dla 2 ostatnich kolumn
            {
                int j = 0;
                tab3[i]= tab1[i] * tab2[j] - tab1[j] * tab2[i];
                break;
            }
            else
            {
              tab3[i] = tab1[i] * tab2[i+1] - tab1[i+1] * tab2[i]; // wyliczam wyznaczniki macierzy : ) dla reszty
            }
        }
        return tab3;
    }
    
    double[] rzut(int[] tab2, int iloczyn_skalarny, int rozmiar)
    {
        double[] tablica_zrzutowana = new double[rozmiar];
        double stala;
        double pod_kreske = 0;
        for(int i = 0 ; i < rozmiar ; i++)
        {
            pod_kreske = Math.pow(tab2[i], 2)+pod_kreske;  //wyliczam wartosci ze wzoru z internetu Math.pow podnoszenie do potęgi
        }
        stala = iloczyn_skalarny/Math.sqrt(pod_kreske); // wylicam wartość potrzebnej do wyliczania kolejnych komórek wektora
        for(int i = 0 ; i < rozmiar ; i++)
        {
            tablica_zrzutowana[i]=tab2[i]*stala; // mnoże każdą komórkę * otrzymaną stałą i wpisuje do tablicy już zrzutowanej.
        }
        return tablica_zrzutowana;
    }
}
