import java.util.*;
public class longest1s_afterFlip {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String b=sc.nextLine();
        int maxlen=0, currlen=0, prevlen=0;
        for(int i=0;i<b.length();i++){
            if(b.charAt(i)=='1'){
                currlen++;
            }else{
                maxlen=Math.max(maxlen, currlen+prevlen+1);
                prevlen=currlen;
                currlen=0;
            }
        }
        maxlen=Math.max(maxlen, currlen+1+prevlen);
        System.out.print(maxlen);
        sc.close();
    }
}
