import java.util.*;

public class Armstrong {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a Number: ");
        int n = scan.nextInt();

        int original = n;
        int sum = 0;
        int count = String.valueOf(n).length();

        while(n != 0){
            int digit = n % 10;
            sum += Math.pow(digit,count);
            n /= 10; 
        }

        if(original == sum){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not Armstrong Number");
        }
        scan.close();
    }
}
