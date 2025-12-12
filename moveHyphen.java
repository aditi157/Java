import java.util.*;
public class moveHyphen{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String ip=sc.nextLine();
        if(ip.contains("-")){
            int n=ip.indexOf("-");
            System.out.print("-"+ip.substring(0, n)+ip.substring(n+1));
        }else{
            System.out.print(ip);
        }
        sc.close();
    }
}