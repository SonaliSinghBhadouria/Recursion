package recursion;
import java.util.*;
public class SumOfNaturalNo {
    public static void printSum(int n , int i, int sum) {
        if (i==n){
            sum += i;
            System.out.print("the sum is: "+sum);
            return;
        }
        sum += i;
        i++;
        printSum(n ,i,sum);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no.: ");
        int n = sc.nextInt();
        
        printSum(n ,1 ,0);
        
    }
    
}
