//longest sequence of 1s in a binary number

import java.util.*;
public class longestseq1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String b=sc.nextLine();
        int count=0,max=0;
        for(int i=0;i<b.length();i++){
            if(b.charAt(i)=='1'){
                count++;
            }else{
                max=Math.max(max,count);
                count=0;
            }
        }
        System.out.print(Math.max(max, count));
        sc.close();
    }
}
