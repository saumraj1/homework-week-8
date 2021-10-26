package homework_week_8;
/*19. Cylinder
1. Write a class with the name Circle. The class needs one field (instance variable) with name radius
of type double.
The class needs to have one constructor with parameter radius of type double and it needs to initialize
the fields.
In case the radius parameter is less than 0 it needs to set the radius field value to 0.
Write the following methods (instance methods):
● Method named getRadius without any parameters, it needs to return the value of the radius
field.
● Method named getArea without any parameters, it needs to return the calculated area
(radius * radius * PI). For PI use Math.PI constant.*/
import javafx.scene.shape.Circle;

public class Cylinder19 extends Circle {
    private double height;//instance variable
    public  Cylinder19(double radius, double height) //constructor
    {
        super(radius);
        if(height<0)
        {
            this.height=0;
        }else
        {
            this.height=height;
        }
    }
    public double getHeight()
    {
        return height;
    }
    public double getVolume()
    {
        double volume=getArea()*getHeight();
        return volume;
    }

    double getArea() {
        return height;
    }


}
