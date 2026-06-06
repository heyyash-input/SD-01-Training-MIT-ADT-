package Day06.AbstractClasses.Concept;

public class Rectangle extends Shape {
    @Override
    public void area(){
        System.out.println("-------Rectangle area------");
    }

    public void displayCircle(){
        System.out.println("-----circle specific method------");
    }
}
