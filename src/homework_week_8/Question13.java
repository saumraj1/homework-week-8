package homework_week_8;
/*13. Shared Digit
Write a method named hasSharedDigit with two parameters of type int.
Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
otherwise, the method should return false.
EXAMPLE INPUT/OUTPUT:
* hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
* hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
* hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
NOTE: The method hasSharedDigit should be defined as public static
*/
import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter  first Digit : ");
        int a = sc.nextInt();
        System.out.println("Enter  second  Digit : ");
        int b= sc.nextInt();
        System.out.println(hasSharedDigit(a,b));

    }
    public static boolean hasSharedDigit(int a,int b){
        if((a>=10 && a<=99) && (b>=10 && b<=99)){
            int firstNumberLastDigit = a%10;
            int secondNumberLastDigit= b%10;
            a/=10;
            b/=10;

            int firstNumberFirstDigit  = a;
            int secondNumberFirstDigit = b;

            return ((firstNumberFirstDigit == secondNumberFirstDigit) || (firstNumberFirstDigit == secondNumberLastDigit)
                    || (firstNumberLastDigit == secondNumberFirstDigit) || (firstNumberLastDigit == secondNumberLastDigit));
        }
        System.out.println("Invalid input.");
        return false;


    }


}
