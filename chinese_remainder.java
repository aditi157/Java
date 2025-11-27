import java.util.*;
public class chinese_remainder {
    static void crt(int n, int num[], int rem[]){
        int x=1, i;
        while(true){
            for(i=0;i<n;i++){
                if(x%num[i]!=rem[i]){
                    break;
                }
            }
            if(i==n){
                System.out.print(x);
                return;
            }
            x++;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num[]=new int[n];
        int rem[]=new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            rem[i]=sc.nextInt();
        }
        sc.close();
        crt(n, num, rem);
    }
}
