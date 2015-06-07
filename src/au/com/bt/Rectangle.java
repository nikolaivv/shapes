package au.com.bt;

/**
 * A Rectangle shape.
 *
 * @author Nikolai von Veh
 */
public class Rectangle implements Shape {
    private final double height;
    private final double width;

    /**
     * Constructs a Rectangle with a width and height.
     *
     * @param width     The width of the rectangle.
     * @param height    The height of the rectangle
     */
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    /**
     * Gets the width of the rectangle.
     *
     * @return  The width of the rectangle.
     */
    public double getWidth() {
        return width;
    }

    /**
     * Gets the height of the rectangle.
     *
     * @return  The height of the rectangle.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Accept the visitor.
     * @param visitor  A ShapeVisitor to accept.
     */
    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
