package Day02.Mini_Projects;

import java.util.ArrayList;
import java.util.Scanner;

public class Pizza_Shop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("----------------Welcome to Si-Nonas shop-------------- "); 
        System.out.println("1: Margretta");
        System.out.println("2: Ginger Garlic Bread");
        System.out.println("3: Non Veg Pizza");
        System.out.println("4: Corn Burst");
        System.out.println("5: Cheese Burst");
        System.out.println("6: Total Bill summary");

        int ch = 0 ;
        double amount = 0  ;;
        int quantity =0 ;

        
        do {
            System.out.println("Enter choice");
            ch=sc.nextInt();

            switch (ch){
                case 1:
                    System.out.println("Margeretta -> rs 550");
                    System.out.println("Enter Quantity");
                    quantity = sc.nextInt();
                    amount +=  (quantity * 550);
                    System.out.println("Order was successfull please pay: " + amount );
                    break;
                case 2:
                    System.out.println("Ginger Garlic Bread -> rs 250");
                    System.out.println("Enter Quantity");
                    quantity = sc.nextInt();
                    amount +=  (quantity * 250);
                    System.out.println("Order was successfull please pay: " + amount );
                    break;
                case 3:
                    System.out.println(" Non Veg Pizza -> rs 650");
                    System.out.println("Enter Quantity");
                    quantity = sc.nextInt();
                    amount += (quantity * 650);
                    System.out.println("Order was successfull please pay: " + amount );
                    break;
                case 4:
                    System.out.println(" Corn Burst -> rs 450");
                    System.out.println("Enter Quantity");
                    quantity = sc.nextInt();
                    amount +=  (quantity * 450);
                    System.out.println("Order was successfull please pay: " + amount );
                    break;
                case 5:
                    System.out.println("Cheese Burst-> rs 350");
                    System.out.println("Enter Quantity");
                    quantity = sc.nextInt();
                    amount += (quantity * 350);
                    System.out.println("Order was successfull please pay: " + amount);
                    break;
                case 6:
//                    double maxAmt = 0 ;
                    System.out.println("total Amount is:" + amount);
                    break;
            }
            
        }
        while(ch != 7);
        
        //what to use for repetation
        sc.close();
        
    }
}
