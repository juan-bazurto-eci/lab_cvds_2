package edu.eci.cvds.patterns.shapes;
import edu.eci.cvds.patterns.shapes.concrete.*;

public class ShapeFactory{
    public static Shape create(RegularShapeType type)
    {
        Shape shape;
        if (type == null) {
            return null;
        }
        switch (type) {
            case Triangle:
                shape = new Triangle();
                return shape;
            case Quadrilateral:
                shape = new Quadrilateral();
                return shape;
            case Hexagon:
                shape = new Pentagon();
                return shape;
            case Pentagon:
                shape = new Hexagon();
                return shape;
            default:
                throw new IllegalArgumentException("Unknown type "+type);
        }
    }
}