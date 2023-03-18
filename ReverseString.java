package recursion;
import java.util.*;
public class ReverseString {
    public static void PrintString(String s , int i) {
        if(i==0){
            System.out.print(s.charAt(i));
            return ;
        }
        System.out.print(s.charAt(i));
        PrintString(s, i-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string : ");
        String s = sc.nextLine();
        PrintString(s, s.length()-1);
    }
}