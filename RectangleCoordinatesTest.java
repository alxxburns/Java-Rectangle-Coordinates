/* Test RectangleCoordinates class */
public class RectangleCoordinatesTest {
	
    public static void main(String[] args) {
    	
        // create a rectangle with valid coordinates
        RectangleCoordinates rect1 = new RectangleCoordinates(2.0, 2.0, 10.0, 2.0, 10.0, 8.0, 2.0, 8.0);

        // test getLength method
        double length1 = rect1.getLength();
        System.out.println("Length of rect1: " + length1);

        // test getWidth method
        double width1 = rect1.getWidth();
        System.out.println("Width of rect1: " + width1);

        // test getPerimeter method
        double perimeter1 = rect1.getPerimeter();
        System.out.println("Perimeter of rect1: " + perimeter1);

        // test getArea method
        double area1 = rect1.getArea();
        System.out.println("Area of rect1: " + area1);

        // test isSquare method
        boolean isSquare1 = rect1.isSquare();
        System.out.println("Is rect1 a square: " + isSquare1);

        // create a rectangle with invalid coordinates
        RectangleCoordinates rect2 = new RectangleCoordinates(2.0, 2.0, 10.0, 2.0, 10.0, 22.0, 2.0, 8.0);

        // test getLength method
        double length2 = rect2.getLength();
        System.out.println("Length of rect2: " + length2);

        // test getWidth method
        double width2 = rect2.getWidth();
        System.out.println("Width of rect2: " + width2);

        // test getPerimeter method
        double perimeter2 = rect2.getPerimeter();
        System.out.println("Perimeter of rect2: " + perimeter2);

        // test getArea method
        double area2 = rect2.getArea();
        System.out.println("Area of rect2: " + area2);

        // test isSquare method
        boolean isSquare2 = rect2.isSquare();
        System.out.println("Is rect2 a square: " + isSquare2);
    }
}
