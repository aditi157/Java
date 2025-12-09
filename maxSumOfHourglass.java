import java.util.*;
public class maxSumOfHourglass {
    static void maxsum(int a[][], int n, int m){
        int max=-999;
        for(int i=0;i<n-2;i++){
            for(int j=0;j<m-2;j++){
                int sum=a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+1]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
                max=Math.max(max, sum);
            }
        }
        System.out.print(max);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        maxsum(a, n, m);
        sc.close();
    }
}
