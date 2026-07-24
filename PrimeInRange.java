import java.util.*;

public class PrimeInRange {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Range: ");
        int num = scan.nextInt();

        for(int i = 0; i <= num; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
        scan.close();
    }

    public static boolean isPrime(int num){
        if(num < 2){
            return false;
        }

        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}
