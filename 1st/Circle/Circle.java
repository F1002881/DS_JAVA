import java.lang.Math;

public class Circle{
    private int Radius;
    Circle()
    {
        Radius = 1;
    }

    Circle(int Radius)
    {
        Radius = this.Radius;
    }

    public int getRadius()
    {
        return Radius;
    }

    public void setRadius(int newRadius)
    {
        Radius = newRadius;
    }

    public int diameter()
    {
        return 2 * Radius;
    }

    public double circumference()
    {
        return 2 * 3.14 * Radius;
    }

    public double area()
    {
        return 3.14 * Math.pow(Radius, 2);
    }

    public String toString()
    {
        return "Radius: " + getRadius() + " Diameter: " + diameter() + "\nCircumference: " + circumference() + "\nArea: " + area();
    }
}
