package au.com.bt;

/**
 * An interface visitors for shapes.
 *
 * @author Nikolai von Veh
 */
public interface ShapeVisitor {

    /**
     * Visit a Circle
     *
     * @param circle    The circle to visit.
     */
    void visit(Circle circle);

    /**
     * Visit a Rectangle.
     *
     * @param rectangle The rectangle to visit.
     */
    void visit(Rectangle rectangle);

    /**
     * Visit a Triangle.
     *
     * @param triangle  The triangle to visit.
     */
    void visit(Triangle triangle);
}
