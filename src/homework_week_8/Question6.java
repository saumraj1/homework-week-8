package homework_week_8;

import java.util.Scanner;

/*6. Write a program in Java to display the pattern like a triangle with a number.
 For eg.
 Input number of rows: 10
 Expected Output:
 1
 12
 123
 1234
 12345
 123456
 1234567
 12345678
 123456789
 12345678910 */
public class Question6 {
    public static void main(String[] args) {
        //To take input from the user
        //Create an object of scanner class
        Scanner sc = new Scanner(System.in);
        int num;  //Declare a variable
        System.out.println("Enter a number:");
        num =sc.nextInt();

        //If number is divisible by 2 then it's an even number
        //else odd number
        if ( num % 2 == 0 )
            System.out.println("The entered number is even");
        else
            System.out.println("The entered number is odd");

    }
}
