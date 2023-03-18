package recursion;

import java.util.*;
public class MoveAllX {
    public static void MoveX(String s, int i , int count , String ns) { // i= index , ns= new string  , count = counting no. of x   
        // Base condition
        if(i==s.length()){  
            for (int j = 0; j < count; j++) {
               ns+="x"; 
            }                           
            System.out.println(ns);
            return ;
        }
        char curr = s.charAt(i); // curr = current character
        // comparing current charater with x
        if(curr == 'x'){
            count++;
            //Recursive call
            MoveX(s, i+1, count, ns);
        }else{
            ns+=curr; //ns = ns+curr
            //Recursive call
            MoveX(s, i+1, count, ns);
        }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your string : "); 
       String s = sc.nextLine();
       MoveX(s, 0, 0, "");
    }
    
}
