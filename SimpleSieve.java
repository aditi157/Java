import java.util.*;
class SimpleSieve {
    public static void SS(int lim){
        int prime[]=new int[lim+1];
        for(int i=2;i<=lim;i++){
            prime[i]=1;
        }
        for(int p=2;p*p<=lim;p++){
            if(prime[p]==1){
                for(int i=p*p;i<=lim;i+=p){
                    prime[i]=0;
                }
            }
        }
        for(int i=2;i<=lim;i++){
            if(prime[i]==1){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String args[]){
        SS(53);
    }
}
