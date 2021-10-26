package homework_week_8;
/*3. Write a class with the name Calculator. The class needs two fields (instance variables) with name
floor of type Floor and carpet of type Carpet.
The class needs to have one constructor with parameters floor of type Floor and carpet of type Carpet
and it needs to initialize the fields.
Write the following methods (instance methods):
● Method named getTotalCost without any parameters, it needs to return the calculated total
cost to cover the floor with a carpet.
*/
public class Calculator17{
    private Floor17 floor;
    private Carpet17 carpet;
    public Calculator17(Floor17 floor, Carpet17 carpet) //parameterised constructor
    {
        this.floor=floor;
        this.carpet=carpet;
    }
    public double getTotalCost()
    {
        return floor.getArea()*carpet.getCost();
    }
}
