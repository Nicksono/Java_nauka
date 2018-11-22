/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacciiteracja;

/**
 *
 * @author Krzysiek
 */
public class FibonacciIteracja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long n = 49, t1 = 0, t2 = 1;
        int i=1;
        //for (int i = 1; i <= n; ++i)
        while (i<=n)
        {
            long sum = t1 + t2; //1 = 0 + 1 || 2=1+1 || 3 = 1 + 2  || 5 = 3 + 2
            t1 = t2; //0 = 1 || 1=1  || 1 = 2 || 2 = 3
            t2 = sum; // 1=1 || 1 = 2 || 2 = 3 || 3 = 5
            i++;
        }
        System.out.println("50 wyraz ciągu to: " + t2);
    }
    
}