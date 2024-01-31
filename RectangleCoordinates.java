/* Rectangle with coordinates class */
public class RectangleCoordinates {
    private double x1, y1, x2, y2, x3, y3, x4, y4;

    // constructor to take four sets of coordinates as arguments
    public RectangleCoordinates(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        setCoordinates(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    // set method to verify coordinates
    public void setCoordinates(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        
    	// verify that all coordinates are in the first quadrant and less than 20.0
        if (x1 >= 0 && x1 <= 20.0 && y1 >= 0 && y1 <= 20.0 &&
            x2 >= 0 && x2 <= 20.0 && y2 >= 0 && y2 <= 20.0 &&
            x3 >= 0 && x3 <= 20.0 && y3 >= 0 && y3 <= 20.0 &&
            x4 >= 0 && x4 <= 20.0 && y4 >= 0 && y4 <= 20.0) {
        	
            // verify that the coordinates specify a rectangle
            if (x1 == x4 && y1 == y2 && x2 == x3 && y3 == y4) {
                this.x1 = x1;
                this.y1 = y1;
                this.x2 = x2;
                this.y2 = y2;
                this.x3 = x3;
                this.y3 = y3;
                this.x4 = x4;
                this.y4 = y4;
                
            } else {
                throw new IllegalArgumentException("Coordinates do not specify a rectangle.");
            }
            
        } else {
            throw new IllegalArgumentException("Coordinates must be in the first quadrant and less than 20.0.");
        }
    }

    // method to calculate the length of the rectangle
    public double getLength() {
        if (x2 - x1 > x3 - x4) {
            return x2 - x1;
        } else {
            return x3 - x4;
        }
    }

    // method to calculate the width of the rectangle
    public double getWidth() {
        if (y3 - y2 > y4 - y1) {
            return y3 - y2;
        } else {
            return y4 - y1;
        }
    }

    // method to calculate the perimeter of the rectangle
    public double getPerimeter() {
        return 2 * (getLength() + getWidth());
    }

    // method to calculate the area of the rectangle
    public double getArea() {
        return getLength() * getWidth();
    }

    // method to determine if the rectangle is a square
    public boolean isSquare() {
        return getLength() == getWidth();
    }
}
