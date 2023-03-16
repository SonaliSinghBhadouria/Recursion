package recursion;
import java.util.*;
public class Pow {
    public static int PrintPow(int x , int n) {
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int a = PrintPow(x, n-1);
        int b = x*a;
        return b;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int x = sc.nextInt();
        System.out.println("Enter the power of your number: ");
        int n = sc.nextInt();
        int s = PrintPow(x, n);
        System.out.println(s);
    }
    
}
