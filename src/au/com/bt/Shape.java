package au.com.bt;

/**
 * An interface to shapes which accept a ShapeVisitor.
 *
 * @author Nikolai von Veh
 */
public interface Shape {

    /**
     * Accept the visitor.
     *
     * @param visitor  A ShapeVisitor to accept.
     */
    void accept(ShapeVisitor visitor);
}
