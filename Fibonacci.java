import java.util.*;

public class Fibonacci {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a range: ");
        int num = scan.nextInt();

        int a = 0, b = 1;
        for(int i = 0; i < num; i++){
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        scan.close();
    }
}
