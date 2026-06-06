package Day06.AbstractClasses.Concept;
//Class 'Circle' must either be declared abstract or implement abstract method 'area()' in 'Shape'
public class Circle extends Shape{
    public static void main(String[] args) {

    }
    //Now we declared area abstract is defined:-
    @Override
    public void area(){
        System.out.println("-------circle area------");
    }

    public void displayCircle(){
        System.out.println("-----circle specific method------");
    }

}
