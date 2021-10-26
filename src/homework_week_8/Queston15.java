package homework_week_8;
/*15. Display left angle triangle of * using nested for loops
 *
 * *
 * * *
 * * * *
 * * * * * */
public class Queston15 {
    public static void main(String[] args)
    {
        int rows=5;
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=rows-i;j++)
            {
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
