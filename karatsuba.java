import java.util.*;
public class karatsuba {
    static long karatsubaMul(long x, long y){
        if(x<10 || y<10) return (long)(x*y);
        int n=Math.max(Long.toString(x).length(), Long.toString(y).length());
        int half=(n+1)/2;
        long a=x/(long)Math.pow(10, half);
        long b=x%(long)Math.pow(10, half);
        long c=y/(long)Math.pow(10, half);
        long d=y%(long)Math.pow(10, half);
        long ac=karatsubaMul(a, c);
        long bd=karatsubaMul(b, d);
        long abcd=karatsubaMul(a+b, c+d)-ac-bd;
        return ac*(long)Math.pow(10, 2*half)+ abcd*(long)Math.pow(10, half)+bd;


    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.print(karatsubaMul(x, y));
        sc.close();
    }
}
