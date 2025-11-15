import java.util.*;
class strobo{
    static void isStrobo(String n){
        Map<Character, Character> map=new HashMap<Character, Character>();
        map.put('0','0');
        map.put('1','1');
        map.put('8','8');
        map.put('6','9');
        map.put('9','6');
        int l=0, r=n.length()-1;
        while(l<r){
            if(!map.containsKey(n.charAt(l))){
                System.out.print("no");
            }
            if(map.get(n.charAt(l))!=n.charAt(r)){
                System.out.print("no");
                return;
            }
            r--;
            l++;
        }
        System.out.print("yes");
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        isStrobo(n);
    }
}
