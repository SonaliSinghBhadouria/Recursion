package recursion;
import java.util.*;
public class Subsequence {
    public static void subsequence(String s, int i , String ns) {
        if(i==s.length()){
            System.out.println(ns);
            return;
        }
        char curr= s.charAt(i);
        //Recursive call for including character 
        subsequence(s, i+1, ns+curr);
        //Recursive call for not including character
        subsequence(s, i+1, ns);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string :");
        String s = sc.nextLine();
        subsequence(s, 0, "");       
    }   
    
}


