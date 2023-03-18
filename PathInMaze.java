package recursion;
import java.util.*;
public class PathInMaze {
    public static int CountPath(int i,int j , int n , int m) {
        if(i==n || j==m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        int down = CountPath(i+1, j, n, m);
        int right = CountPath(i, j+1, n, m);
        return down+right;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter you row");
        int n = sc.nextInt();
        System.out.println("enter you column");
        int m = sc.nextInt();
        int totalpath = CountPath(0, 0, n, m);
        System.out.println( totalpath);
    }
    
}
