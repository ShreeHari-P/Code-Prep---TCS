import java.util.*;

public class CountSumTP {
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
        int count = 0;

        while(left < right){
            if(arr[left] + arr[right] > target){
                right--;
            }else if(arr[left] + arr[right] < target){
                left++;
            }else if(arr[left] + arr[right] == target){
                count++;
                left++;
                right--;
            }
        }
        System.out.println("Count: " + count);
        scan.close();
    }
}
