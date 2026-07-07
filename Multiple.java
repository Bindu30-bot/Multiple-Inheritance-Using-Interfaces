import java.util.Scanner;
// Interface for Rectangle
interface Rectangle {
    void rectangleArea(double length, double breadth);
}
// Interface for Square
interface Square {
    void squareArea(double side);
}
// Class implementing both interfaces
class AreaCalculator implements Rectangle, Square {
    public void rectangleArea(double length, double breadth) {
        double area = length * breadth;
        System.out.println("Area of Rectangle = " + area);
    }
    public void squareArea(double side) {
        double area = side * side;
        System.out.println("Area of Square = " + area);
    }
}
public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AreaCalculator obj = new AreaCalculator();
        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double breadth = sc.nextDouble();
        System.out.print("Enter side of square: ");
        double side = sc.nextDouble();
        obj.rectangleArea(length, breadth);
        obj.squareArea(side);
        sc.close();
    }
}

