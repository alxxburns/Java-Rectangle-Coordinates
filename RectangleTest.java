/*Program to test Rectangle class*/
public class RectangleTest {
   
	public static void main(String[] args) {
       
		Rectangle rectangle1 = new Rectangle();
		
        System.out.println("Rectangle 1"); // create rectangle1 object with default values
        System.out.println("Length: " + rectangle1.getLength());
        System.out.println("Width: " + rectangle1.getWidth());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());
        System.out.println("Area: " + rectangle1.getArea());

        Rectangle rectangle2 = new Rectangle(6.0, 4.0);
        
        System.out.println("Rectangle 2"); // create rectangle2 object with custom values
        System.out.println("Length: " + rectangle2.getLength());
        System.out.println("Width: " + rectangle2.getWidth());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());
        System.out.println("Area: " + rectangle2.getArea());

        try {
            Rectangle rectangle3 = new Rectangle(30.0, 7.0); // use invalid length value 
        } catch (IllegalArgumentException e) { // catch illegal exception thrown
            System.out.println(e.getMessage());
        }

        try {
            Rectangle rectangle4 = new Rectangle(56.0, 12.0); // use invalid width value
        } catch (IllegalArgumentException e) { // catch illegal exception thrown
            System.out.println(e.getMessage());
        }
    }
}
