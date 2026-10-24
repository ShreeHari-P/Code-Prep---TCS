import java.util.Scanner;

public class PalindromeTP {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        char[] ch = str.toCharArray();

        int left = 0;
        int right = str.length() - 1;
        boolean isPalindrome = true;

        while(left < right){
            if(ch[left] != ch[right]){
                isPalindrome = false;
                break;
            }

            left++;
            right--;
        }

        System.out.println("Is Palindrome: " + isPalindrome);
        scan.close();
    }
}
