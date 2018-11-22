/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler4;

/**
 *
 * @author Krzysiek
 */
public class Euler4 { //najwiekszy palindrom iloczynu 2 liczb 3 cyfrowych

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 100;
        int j = 100;
        int chwilowa = 0;
        int wynik =0;
        int back = 0;
        int rozwiazanie = 0;
 
        for (i=99; i<999; i++) {
            for (j=99; j<999; j++) {
                wynik=i*j; //nasz iloczyn
                back=0; //zeuje back po kazdej petli for
                while (wynik != 0) { //dopoki nasza wymnozona liczba nie jest = 0 wykonujemy
                    chwilowa = wynik % 10; //odseparowanie ostatniej liczby
                    if (wynik < 10) { //jezeli nasz wynik jest liczba jednosci dodajemy ja do odwroconej
                        back = back + wynik;
                    } else { //nasza odseparowana liczbe dodajemy do pozostalych odwroconych i mnozymy *10
                        back = back + chwilowa;
                        back = back * 10;
                    }
                    wynik = wynik / 10; //otrzymany iloczyn dzielimy przez 10
                }
                wynik=i*j; //wymnazamy zeby sprawdzic
                if (wynik==back) //sprawdzenie czy lliczba odwrocona jest rowna iloczynowi naszych liczb
                {
                    if (back>rozwiazanie) //jezeli nasz palindrom nie jest wiekszy niz dotychczas otrzymamy nie nadpisujemy zmiennej
                    {
                        rozwiazanie=back;
                    }
                }
            }
        }
        System.out.println(rozwiazanie);
    }
    
}
