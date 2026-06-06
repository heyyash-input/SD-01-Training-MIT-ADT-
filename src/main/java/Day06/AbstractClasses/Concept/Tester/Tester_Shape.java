package Day06.AbstractClasses.Concept.Tester;

import Day06.AbstractClasses.Concept.Circle;
import Day06.AbstractClasses.Concept.Rectangle;
import Day06.AbstractClasses.Concept.Shape;
import Day06.AbstractClasses.Concept.Square;

public class Tester_Shape {
    public static void main(String[] args) {
//        Shape s = new Shape(); // cannot be instantiate shape class

        Circle c = new Circle();
        c.area();

        Square sqr =new Square();
        sqr.area();

        Rectangle rect = new Rectangle();
        rect.area();

        Shape obj = new Circle();

        Shape [] shape = new Shape[3];

        shape [0] = c ;
        shape [1] = rect ;
        shape [2] = sqr ;

        for (int i = 0; i < shape.length; i++) {
            System.out.println(shape[i]);
        }


    }

    public static void calArea(Circle obj){
        obj.area();
    }

}
