package au.com.bt;

/**
 * A Triangle shape.
 *
 * @author Nikolai von Veh
 */
public class Triangle implements Shape {
    private final double height;
    private final double base;

    /**
     * Constructs a Triangle with a height and base.
     *
     * @param base    The height of the triangle.
     * @param height    The height of the triangle.
     */
    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    /**
     * Gets the base of the triangle.
     *
     * @return  The base of the triangle.
     */
    public double getBase() {
        return base;
    }

    /**
     * Gets the height of the triangle.
     *
     * @return  The height of the triangle.
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
