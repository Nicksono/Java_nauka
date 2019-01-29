
package zespolone;

public class Zespolone 
{


    public static void main(String[] args) 
    {
       Complex complex = new Complex();
       complex.dodawanie(1, 2, 4, 7);
    }
    
}

class Complex
{
    int dodawanie(int re1, int imag1, int re2, int imag2)
    {
        int reSuma = re1 + re2;
        int imagSuma = imag1 + imag2; 
        System.out.println(reSuma + "+" + imagSuma + "I");
        return 1;
    }
    
    
}