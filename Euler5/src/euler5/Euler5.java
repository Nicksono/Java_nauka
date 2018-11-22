/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler5;

/**
 *
 * @author Krzysiek
 */
public class Euler5 { //najmniejsza liczba którą można podzielić przez wszystkie liczby z zakresu 1-20 bez reszty

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int start;
        int suma=0;
        int i;
        for(start=2520;start<1000000000;start++) //zaczynamy petle od 2520 bo to najmniejsza liczba z podzielna przez 1...10
        {
            suma=0; //nasza zmienna do sprawdzania czy caly zakres 1...20 moglismy podzielic przez nasza liczbe
            for(i=1;i<=20;i++) //dzielimy przez i otrzymana liczbe i bedzie naszymi liczbami z zakresu 1...20
            {
                if(start%i==0) // jezeli nasza liczba, którą sprawdzamy jest podzielna przez liczbę i to wtedy do zmiennej suma dodajemy 1
                {
                    suma++;
                }
                else //jezeli nie wyskakujemy z tej petli
                {
                    break;
                }
            }
            if(suma==20) //jezeli nasza zmienna sprawdzajaca jest = 20 to znaczy ze caly zakres liczb od 1 do 20 jest dzielnikiem sprawdzanej liczby
            {
                System.out.println(start); //wypisujemy sprawdzaną liczbę 
                break;
            }
        }
    }
    
}
