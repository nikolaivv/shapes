package au.com.bt;

/**
 * Calculates the area of different shapes.
 *
 * @author Nikolai von Veh
 */
public class AreaVisitor implements ShapeVisitor {

    /**
     * Calculate the area of a circle.
     *
     * @param circle    The circle to calculate the area of.
     */
    @Override
    public void visit(Circle circle) {
        double area = Math.PI * (Math.pow(circle.getRadius(), 2.0));
        System.out.format("The area of the circle is %.3f%n", area);
    }

    /**
     * Calculate the area of a rectangle.
     *
     * @param rectangle The rectangle to calculate the area of.
     */
    @Override
    public void visit(Rectangle rectangle) {
        double area = rectangle.getWidth() * rectangle.getHeight();
        System.out.format("The area of the rectangle is %.3f%n", area);
    }

    /**
     * Calculate the area of a triangle.
     *
     * @param triangle  The triangle to calculate the area of.
     */
    @Override
    public void visit(Triangle triangle) {
        double area = triangle.getBase() * triangle.getHeight() / 2;
        System.out.format("The area of the triangle is %.3f%n", area);
    }
}
