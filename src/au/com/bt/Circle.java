package au.com.bt;

/**
 * A Circle shape.
 *
 * @author Nikolai von Veh
 */
public class Circle implements Shape {
    private final double radius;

    /**
     * Constructs a Circle with a radius.
     * @param radius   The radius of the circle.
     */
    public Circle(double radius){
        this.radius = radius;
    }

    /**
     * Gets the radius of the circle.
     *
     * @return  The radius of the circle.
     */
    public double getRadius() {
        return radius;
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
