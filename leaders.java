import java.util.*; 
public class leaders {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=0;
        int op[]=new int[n];
        op[0]=a[a.length-1];
        for(int i=a.length-2;i>=0;i--){
            if(a[i]>a[i+1]){
                op[++k]=a[i];
            }
        }
        for(int i=k;i>=0;i--){
            System.out.print(op[i]+" ");
        }
        sc.close();
    }
}
