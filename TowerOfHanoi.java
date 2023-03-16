package recursion;
import java.util.*;
public class TowerOfHanoi {
    public static void towerOfHanoi(int n , String s, String h, String d) {
    if (n==1){
        System.out.println("tranfer disk "+n+" form "+s+" to "+d);
        return ;
    }
    towerOfHanoi(n-1, s, d, h); 
    System.out.println("tranfer disk "+n+" form "+s+" to "+d);
    towerOfHanoi(n-1, h, s, d); 
    
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of disk: ");
        int n = sc.nextInt();
        towerOfHanoi(n, "s", "h", "d");
    }
    
}
