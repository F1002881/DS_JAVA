
public class CircleTester{
    public static void main(String[] args){
        Circle Circle1 = new Circle();
        Circle Circle2 = new Circle(2);
        Circle Circle3 = new Circle(45);
    
        Circle[] CircleGroup = {Circle1, Circle2, Circle3};

        for(int i = 0; i < CircleGroup.length; i++)
        {
            System.out.println("(Circle " + i + ")" + "\nCircumference: " + CircleGroup[i].circumference() + " Area: " + CircleGroup[i].area() + "\n");
        }
    }
}
