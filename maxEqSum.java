import java.util.*;
public class maxEqSum{
    static void eqsum(int a[]){
        int total=0, max=0, left=0;
        for(int n:a){
            total+=n;
        }
        int index=0;
        for(int i=0;i<a.length;i++){
            total-=a[i];
            if(total==left){
                max=Math.max(max, left);
                index=i;
            }
            left+=a[i];
        }
        System.out.print(max+" at "+index);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        eqsum(a);
        sc.close();
    }
}
