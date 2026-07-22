//Krishnamurthy Number
import java.util.*;

public class StrongNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = scan.nextInt();

        int original = n;
        int factSum = 0;

        while(n != 0){
            int digit = n%10;
            int factorial = 1;

            for(int i = 1; i <= digit; i++){
                factorial *= i;
            }
            factSum += factorial;

            n /= 10;
        }

        if(original == factSum){
            System.out.println("Strong Number");
        }else{
            System.out.println("Not Strong Number");
        }
        scan.close();
    }
}
