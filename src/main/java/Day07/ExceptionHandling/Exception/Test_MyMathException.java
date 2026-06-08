package Day07.ExceptionHandling.Exception;

import java.util.Scanner;

public class Test_MyMathException {
    public static void main(String[] args) {
//---------------------------------------------------------------------------------------------------------------
        // resource try
        try(  Scanner sc = new Scanner(System.in);){
            System.out.println("no1 no2");
            int no1 = sc.nextInt();
            int no2 = sc.nextInt();

            int no3 = MyMath.div(no1 , no2 );
            System.out.println("Div: " + no3);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        finally {
            System.out.println("---------END--------");
        }
    }
//---------------------------------------------------------------------------------------------------------------
}
