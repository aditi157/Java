import java.util.*;
public class maxProdSubarray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int max=a[0], min=a[0], res=a[0];
        for(int i=1;i<n;i++){
            int t=max;
            max=Math.max(a[i], Math.max(max*a[i], min*a[i]));
            min=Math.min(a[i], Math.min(t*a[i], min*a[i]));
            res=Math.max(res, max);
        }
        System.out.print(Math.max(max, res));
        sc.close();
    }
}
// public class maxProdSubarray {

//     public static void maxProductWithSubarray(int[] nums) {

//         // Track max/min products ending at current index
//         int maxHere = nums[0];
//         int minHere = nums[0];

//         // Global max product
//         int maxSoFar = nums[0];

//         // Track indices
//         int start = 0, end = 0;          // final answer
//         int tempStart = 0;               // possible start index

//         for (int i = 1; i < nums.length; i++) {

//             // If multiplying by a negative flips signs, swap max/min
//             if (nums[i] < 0) {
//                 int temp = maxHere;
//                 maxHere = minHere;
//                 minHere = temp;
//             }

//             // Extend or restart maxHere
//             if (nums[i] > maxHere * nums[i]) {
//                 maxHere = nums[i];
//                 tempStart = i;  // restart subarray
//             } else {
//                 maxHere = maxHere * nums[i];
//             }

//             // Extend or restart minHere
//             minHere = Math.min(nums[i], minHere * nums[i]);

//             // Update the global maximum + update indices
//             if (maxHere > maxSoFar) {
//                 maxSoFar = maxHere;
//                 start = tempStart;
//                 end = i;
//             }
//         }

//         // Print result
//         System.out.println("Maximum Product = " + maxSoFar);
//         System.out.print("Subarray = [ ");
//         for(int i = start; i <= end; i++){
//             System.out.print(nums[i] + " ");
//         }
//         System.out.println("]");
//     }

//     public static void main(String[] args) {
//         int[] arr = { 1, 2, 0, 0, 5, 3 };
//         maxProductWithSubarray(arr);
//     }
// }
