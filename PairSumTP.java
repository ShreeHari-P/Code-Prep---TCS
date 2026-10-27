import java.util.Scanner;

public class PairSumTP {
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

        while(left < right){
            if(arr[left] + arr[right] < target){
                left++;
            }else if(arr[left] + arr[right] > target){
                right--;
            }else if(arr[left] + arr[right] == target){
                System.out.println("[" + arr[left] + "," + arr[right] + "]");
                left++;
                right--;
            }
        }

        scan.close();
    }
}
