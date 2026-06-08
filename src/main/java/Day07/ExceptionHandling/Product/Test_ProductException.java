package Day07.ExceptionHandling.Product;

import java.util.Scanner;

public class Test_ProductException {
    public static void main(String[] args) {
//-----------------------------------------------------------------------------------------------------------------

        try(Scanner sc = new Scanner(System.in);){
            Shelf s1 = new Shelf(101 , " Book " , 400);
            System.out.println("Enter ammount not more than price :");
            s1.limitedPrd(sc.nextInt());
        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Error: " + ex.getMessage());
        }

//-----------------------------------------------------------------------------------------------------------------
    }
}
