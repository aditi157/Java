import java.util.*;
public class celebrity_problem {
    static int isCelebrity(int arr[][], int n){
        Stack<Integer> s=new Stack<Integer>();
        for(int i=0;i<n;i++){
            s.push(i);
            while(s.size()>1){
                int r=s.pop();
                int c=s.pop();
                if(arr[r][c]==1){
                    s.push(c);
                }else{
                    s.push(r);
                }
            }
            
        }
        int cel=s.pop();
        for(int i=0;i<n;i++){
            if(i!=cel){
                if(arr[cel][i]==1){
                    return -1;
                }
                if(arr[i][cel]==0){
                    return -1;
                }
            }
        }
        return cel;
    }
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.print("The celebrity is: "+isCelebrity(arr, n));
        sc.close();
    }
}

