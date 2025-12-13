import java.util.*;
public class swapnibble {
    static void swap(byte n){
        byte h=(byte)((n & 0xF0) >>4);
        byte l=(byte)((n & 0x0F));
        byte result=((byte)((l<<4)|h));
        System.out.println(
    String.format("%8s", Integer.toBinaryString((result & 0xFF))).replace(' ', '0')
);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String b=sc.nextLine();
        int x=Integer.parseInt(b,2);
        x=x&0xff;
        byte n=(byte)x;
        swap(n);
        sc.close();
    }
}
