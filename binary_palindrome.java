import java.util.*;
public class binary_palindrome{
    static void isPalin(int n){
        int op=0, ip=n;
        while(n>0){
            op<<=1;
            op=op|(n&1);
            n>>=1;
        }
        if(ip==op){
            System.out.print("yes");
        }else{
            System.out.print("no");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        isPalin(n);
    }
}
