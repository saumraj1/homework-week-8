package homework_week_8;
/*8. Display right angle triangle of @ using nested for loops
 @
 @@
 @@@
 @@@@
 @@@@@
*/
public class Question8 {


    public static void main(String[] args) {


        int i, j;
        char rows = 5;

        for (i = 1; i <= rows; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println("");
        }
    }
}
