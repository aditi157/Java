import java.util.*;
public class majorityElement_o_n2 {
    static int freq(int n, int arr[], int x){
        int f=0;
        for(int i=0;i<x;i++){
            if(arr[i]==n){
                f++;
            }
        }
        return f;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print("n= "+arr[i]+" freq= "+freq(arr[i],arr, n)+"\n");
            if(freq(arr[i], arr, n)>n/2){
                System.out.print(arr[i]);
                break;
            }
        }
        sc.close();
    }
}
