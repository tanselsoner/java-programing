package day_57_Abstraction_polymorphism.shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapesTest {
    public static void main(String[] args) {
        Shape triangle = new Triangle();
        triangle.draw();
        Shape circle = new Circle();
        circle.draw();
        Shape square = new Square();
        square.draw();
        /**
         * create list of shapes and store 10 different shapes
         * using a loop print out each shape
         */
        List<Shape> shapes = new ArrayList<>();
        shapes.add(triangle);
        shapes.add(new Triangle());
        shapes.add(new Square());
        shapes.add(new Square());
        shapes.add(new Circle());
        shapes.add(new Circle());
        shapes.add(new Triangle());
        shapes.add(new Square());
        shapes.add(new Square());
        shapes.add(new Circle());
        shapes.add(new Circle());
        // System.out.println(shapes);prints hashcodes of objects
        for (Shape eachShape : shapes) {
            eachShape.draw();
        }
        drawShape(new Circle());
        drawShape(new Square());
        drawShape(new Triangle());


    }
    /**static method:drawShape
     *accepts object of shape
     * then calls draw(method
     */
    public static void drawShape(Shape shape) {
        System.out.println("----Drawing shape----");
        shape.draw();
    }
}