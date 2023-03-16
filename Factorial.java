package recursion;
import java.util.*;
public class Factorial {
    public static int PrintFactorial(int n) {
        if(n==0||n==1){
            return 1 ;
        }
        int a = PrintFactorial(n-1);
        int b = n*a;
        return b ;      
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enteryour number: ");
        int n = sc.nextInt();
        int s = PrintFactorial(n);
        System.out.println(s);     
        
    }
    
}
