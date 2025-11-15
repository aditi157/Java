import java.util.*;
class strobo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=n, n2=0;
        while(n>0){
            n2=n2*10+n%10;
            n/=10;
        }
        int s=1;
        while(n1>0 && n2>0){
            if((n1%10==8 && n2%10==8)||(n1%10==6 && n2%10==9)||(n1%10==9 && n2%10==6)||(n1%10==1 && n2%10==1)||(n1%10==0 && n2%10==0)){
                n1/=10;
                n2/=10;
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
