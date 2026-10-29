import java.util.*;

public class MoveZeroesToEndTP {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }

        int left = 0;
        int right = n - 1;
        int count = 0;

        while(left <= right){
            if(arr[left] != 0){
                arr[count] = arr[left];
                count++;
            }

            left++;
        }

        while(count < n){
            arr[count] = 0;
            count++;
        }

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
