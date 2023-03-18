package recursion;
import java.util.*;
public class Unique {
    public static void subsequence(String s, int i , String ns, HashSet<String>set) {
        //base condition
        if(i==s.length()){
            if(set.contains(ns)){
                return ;
            }
            else{
                System.out.println(ns);
                set.add(ns);
                return;

            }
        }
        char curr= s.charAt(i);
        //Recursive call for including character 
        subsequence(s, i+1, ns+curr,set);
        //Recursive call for not including character
        subsequence(s, i+1, ns , set);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string :");
        String s = sc.nextLine();
        HashSet<String>set= new HashSet<>();
        subsequence(s, 0, "" ,set);       
    }
    
}
// Print all the unique substrings of a string 
/* input = soon
 * output = soon
 *          soo
 *          son
 *          so
 *          sn
 *          on
 *          s
 *          o
 *          n
 */    
