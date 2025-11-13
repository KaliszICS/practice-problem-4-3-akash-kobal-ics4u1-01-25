/** 
 * The Rectangle class represents the length and width of a rectangle
 * @author Akash
 * @version 1.0
*/
public class Rectangle {
    //instance variables
    private double length;
    private double width;

/**
 * Creates a rectangle class with width and width values
 * @param length - the measurement of length
 * @param width - the measurement of width
 */
//constructor - params
    public Rectangle(int length, double width) {
        this.length = length;
        this.width = width;
    }
//method - 2 initialized variables
/**
 * @return returns the value of width (8), and length (4)
 */
    //Constructor 1:
    public Rectangle() {
        this.width = 8;
        this.length = 4;
    }

    //method - 1 param, length is input, width is initialized
    /**
     * @param length - input of length
     * @param width - intiailized value
     */
    //Constructor 2:
    public Rectangle(double length) {
        this.length = length;
        this.width = 8;
    }

    /**
     * method - 2 param, length is input, width is input
     * @param length - input of length
     * @param width - input of width
     */
    //Constructor 3:
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    //getter variable for length
    public double getLength() {
        return length;
    }
    //getter variable for width
    public double getWidth() {
        return width;
}
}
