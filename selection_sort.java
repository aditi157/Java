import java.util.*;
public class selection_sort{
    static void sort(int a[]){
        int min;
        int n=a.length;
        for(int i=0;i<n-1;i++){
            min=i;
            for(int j=i+1;j<n;j++){
                if(a[min]>a[j]){
                    int t=a[j];
                    a[j]=a[min];
                    a[min]=t;
                }
            }
        }
        for(int num:a){
            System.out.print(num+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        sort(a);
        sc.close();
    }
}
