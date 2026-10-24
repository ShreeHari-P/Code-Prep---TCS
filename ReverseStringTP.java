import java.util.Scanner;

public class ReverseStringTP {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        char[] ch = str.toCharArray();

        int left = 0;
        int right = str.length() - 1;

        while(left < right){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            left++;
            right--;            
        }

        for(char c : ch){
            System.out.print(c);
        }
    }    
}
