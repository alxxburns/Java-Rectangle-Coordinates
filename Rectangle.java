/*Rectangle class java program*/
public class Rectangle {
	
    private double length;
    private double width;

    //default constructor
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    public Rectangle(double length, double width) { // constructor with length and width as parameters
        this.setLength(length);
        this.setWidth(width);
    }

    public double getLength() { // get method for length
        return length;
    }

    public void setLength(double length) { // set method for length
        if (length > 0.0 && length < 20.0) {
            this.length = length;
        } else {
            throw new IllegalArgumentException("Length must be larger than 0.0 and less than 20.0");
        }
    }

    public double getWidth() { // get method for width
        return width;
    }

    public void setWidth(double width) { // set method for width
        if (width > 0.0 && width < 20.0) {
            this.width = width;
        } else {
            throw new IllegalArgumentException("Width must be greater than 0.0 and less than 20.0");
        }
    }

    public double getPerimeter() { // method to calculate perimeter
        return 2 * (length + width);
    }

    public double getArea() { // method to calculate area
        return length * width;
    }
}