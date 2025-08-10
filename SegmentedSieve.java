import java.util.*;
class SegmentedSieve{
  public static void SS(int l, int h){
    int prime[]=new int[h+1];
    for(int p=2;p*p<=h;p++){
      int sm=(l/p)*p;
      if(sm<l){
        sm+=p;
      }
      for(int i=sm;i<=h;i+=p){
        prime[i]=1;
      }
    }
    for(int i=l;i<=h;i++){
        if(prime[i]==0){
          System.out.print(i+" ");
        }
    }
  }
    public static void main(String args[]){
      SS(10,30);
    }
}
