package Day06.AbstractClasses.Concept;

public class Square extends Shape{

    @Override
    public void area(){
        System.out.println("-------Square area------");
    }

    public void displayCircle(){
        System.out.println("-----Square specific method------");
    }

}
