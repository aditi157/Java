import java.util.*;
class strobo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        int s=1;
        int l=0, r=n.length()-1;
        while(l<r){
            if((n.charAt(l)=='8' && n.charAt(r)=='8')||(n.charAt(l)=='6' && n.charAt(r)=='9')||(n.charAt(l)=='9' && n.charAt(r)=='6')||(n.charAt(l)=='1' && n.charAt(r)=='1')||(n.charAt(l)=='0' && n.charAt(r)=='0')){
                l++;
                r--;
            }else{
                s=0;
                break;
            }
        }
        if(s==0){
            System.out.print("no");
        }else{
            System.out.print("yes");
        }
    }
}
