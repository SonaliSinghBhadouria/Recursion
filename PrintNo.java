package recursion;

import java.security.DrbgParameters.NextBytes;
import java.util.*;

public class PrintNo {
    public static void print(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        n--;
        print(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        int n = sc.nextInt();     

        print(n);
    }
    
}
