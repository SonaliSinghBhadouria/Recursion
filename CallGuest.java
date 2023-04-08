package recursion;
import java.util.*;
public class CallGuest {
    public static int guest(int n) {
        if (n<=1){
            return 1;
        }
        int s = guest(n-1);
        int f = (n-1)*guest(n-2);
        return s+f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number of guests: ");
        int n = sc.nextInt();
        System.out.println(guest(n));
        
    }
    
}
