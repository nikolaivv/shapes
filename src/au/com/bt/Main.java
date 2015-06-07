package au.com.bt;

/**
 * The shapes application demonstrates the use of the visitor pattern.
 *
 * @author Nikolai von Veh
 */
public class Main {

    /**
     * The main application entry point.
     *
     * @param args  Command line arguments.
     */
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(10, 10);
        Triangle triangle = new Triangle(10, 10);

        AreaVisitor areaVisitor = new AreaVisitor();
        areaVisitor.visit(circle);
        areaVisitor.visit(rectangle);
        areaVisitor.visit(triangle);
    }
}
