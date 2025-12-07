import java.util.*;
public class majorityElement_o_n {
    static void ismajelem(int[] a){
        int cand=0, count=0;
        for(int n:a){
            if(count==0){
                cand=n;
            }
            count+=(n==cand)?1:-1;
        }
        int f=0;
        for(int n:a){
            if(n==cand){
                f++;
            }
        }
        if(f>a.length/2){
            System.out.print(cand);
        }else{
            System.out.print(-1);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        ismajelem(a);
        sc.close();
    }
}
