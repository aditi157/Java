import java.util.*;
public class josephus_trap{
    static int jos_rec(int n, int k){
        if (n==1) return 0;
        return (jos_rec(n-1, k)+k)%n;
    }
    static int jos_it(int n, int k){
        int res=0;
        for(int i=2;i<=n;i++){
            res=(res+k)%i;
        }
        return res; 
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        System.out.print(jos_rec(n,k)+" "+jos_it(n, k));
        sc.close();
    }
}
