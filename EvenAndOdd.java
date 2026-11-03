import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }

        int left = 0;
        int right = n - 1;

        while(left < right){
            if(arr[left]%2 == 0){
                left++;
            }else if(arr[right]%2 != 0){
                right--;
            }else{
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
