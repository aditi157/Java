import java.util.*;
public class toggle{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean b[]=new boolean[n+1];
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j+=i){
                b[j]=!b[j];
            }
        }
        for(int i=0;i<=n;i++){
            if(b[i]){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}