import java.util.*;
public class alice {
    public static void main(String ars[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0, count=0;
        while(sum<a){
            count++;
            sum+=12*count*count;
        }
        System.out.print(8*count);
        sc.close();
    }
}
