package homework_week_8;
/*9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number) */
public class Question9 {
    public static void main(String[] args) {
        int maxNumber = 8, previousNumber = 1, nextNumber = 1;
        System.out.println("Print the Fibonacci number sequence of " + maxNumber + " number:");

        int i = 1;
        while (i <= maxNumber) {
            System.out.println(previousNumber + " ");
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
            i++;

        }
    }
}
