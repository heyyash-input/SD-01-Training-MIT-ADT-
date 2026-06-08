package Day07.ExceptionHandling.Exception;

import java.util.Scanner;

public class Test_Div {
    public static void main(String[] args) {
//---------------------------------------------------------------------------------------------------------------

       try {
           System.out.println("-----File opened-----");
           int [] arr = new int[3];
           arr[6] = 90 ;
           System.out.println("-----Starter-----");
           Scanner sc = new Scanner(System.in);
           int no1, no2, no3;
           System.out.println("No1 No2");
           no1 = sc.nextInt();
           no2 = sc.nextInt();

           no3 = no1 / no2;

           System.out.println("---store result into file/Db-----");
           System.out.println("---call other methods-----");
           System.out.println("----End----");
       }
       catch (Exception e1){
           System.out.println( e1);
       }
       finally {
           System.out.println("--------END----");
       }

    }
//---------------------------------------------------------------------------------------------------------------
}
