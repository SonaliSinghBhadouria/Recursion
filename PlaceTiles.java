package recursion;

public class PlaceTiles {
    public static int place(int n,int m) {
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        int v = place(n-m, m);
        int h = place(n-1, m);
        return h+v;      
    }
    public static void main(String[] args) {
        int n=4;
        int m=2;
        System.out.println(place(n, m));
        
    }

    
}
