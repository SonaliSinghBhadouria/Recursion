package recursion;
import java.util.*;
public class Pattern1 {
    public static void PrintPattern(int n) {
        if(n==0){
            return ;
        }
        Column(n);
        System.out.println();
        PrintPattern(n);
    }
    public static void Column(int n) {
        if(n==0){
            return;
        }
        System.out.print("* ");
        Column(n);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = sc.nextInt();   
        PrintPattern(n);   
        sc.close();  
    }
    
}
