import java.util.*;

public class ClosestToTargetTP{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }

        int target = scan.nextInt();

        int left = 0;
        int right = n - 1;

        int a = arr[left];
        int b = arr[right];
        int minDiff = Integer.MAX_VALUE;

        while(left < right){
            int sum = arr[left] + arr[right];
            int diff = Math.abs(sum - target);

            if(diff < minDiff){
                minDiff = diff;
                a = arr[left];
                b = arr[right];
            }

            if(sum < target){
                left++;
            }else if(sum > target){
                right--;
            }else{
                break;
            }
        }

        System.out.println("Closest: " + "(" + a + "," + b +")");

        scan.close();
    }
}