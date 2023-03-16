package recursion;
import java.util.*;
public class Fibonacci {
    public static void PrintFibonacci(int a, int b, int n ) {
        if ( n == 0) {
            return;
        }
        int c = a+b;
        System.out.print(c+" ");
        PrintFibonacci(b, c, n-1);
    }
    public static void main(String[] args) {
        int a=0;
        int b=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enteryour number: ");
        int n = sc.nextInt();
        PrintFibonacci(a, b, n-2);
    }
    
}
