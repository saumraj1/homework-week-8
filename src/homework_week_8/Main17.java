package homework_week_8;
/* OUTPUT
total= 38.5
total= 36.45
NOTE: All methods should be defined as public NOT public static.
NOTE: In total, you have to write 4 classes.*/
public class Main17 {
    private static Object Carpet17;

    public static void main(String[] args)
    {
        Carpet17 carpet=new Carpet17(3.5);
        Floor17 floor=new Floor17(2.75,4);
        Calculator17 calculator=new Calculator17(floor,carpet);
        System.out.println("total=" + calculator.getTotalCost());
        Carpet17 =new Carpet17(1.5);
        floor=new Floor17(5.4,4.5);
        calculator=new Calculator17(floor,carpet);
        System.out.println("total "+ calculator.getTotalCost());

    }

}