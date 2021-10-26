package homework_week_8;
/*10. Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
1+125+27=153*/
import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        int n, i = 0, a, b, c, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        n = sc.nextInt();
        a = n;
        c = n;
        while (a > 0) {
            a = a / 10;
            i++;
        }
        while (n > 0) {
            b = n % 10;
            sum = (int) (sum + Math.pow(b, i));
            n = n / 10;
        }
        if (sum == c) {

            System.out.println(" This  is Armstrong number");
        } else {
            System.out.println(" This  is not Armstrong number ");

        }
    }
}
