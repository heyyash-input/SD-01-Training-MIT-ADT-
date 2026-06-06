package Day06.AbstractClasses.Concept;
//abstract class can not be instantiated
//instance of abstract class: not allowed
//abstract class must be inherited
public abstract class Shape {
//----------------------------------------------------------------------------------------------------------------

    //abstract contains non implemented method
    // who will implemented abstract methods : child class
    // how: inherit abstract class and override abstarct methods
    public static void main(String[] args) {

    }

//----------------------------------------------------------------------------------------------------------------
    public abstract void area();
//----------------------------------------------------------------------------------------------------------------

    public void display(){
        System.out.println("---Implemented method in shape---");
    }

//----------------------------------------------------------------------------------------------------------------
}
