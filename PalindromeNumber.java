import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = scan.nextInt();
        int original = num;
        int rev = 0;

        while(num != 0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }

        if(rev == original){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
        scan.close();
    }
}
