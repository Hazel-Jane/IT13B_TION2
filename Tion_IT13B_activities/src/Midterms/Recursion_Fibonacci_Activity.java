package Midterms;


public class Recursion_Fibonacci_Activity {
    public static void main(String[] args){
        int n = 10;
        System.out.print ("The Fibonacci is:");
        for (int i = 0; i < n; i++){
            System.out.print(fibonacci(i) + " ");
           
            
        }
    }
    public static int fibonacci(int n){
        if (n <= 1){
            return  n;
            
        }
        return fibonacci(n-1)+ fibonacci(n-2);
    
    }
}
