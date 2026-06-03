package Day03.OOPS_Fundamentals.AccessModifiers.EmployeeAccess;

import java.util.Scanner;

public class Test_Employee {
    public static void main(String[] args) {
//----------------------------------------------------------------------------------------------------------------
        Employee test = new Employee();
        test.empDetails();
        test.salDetails();
        test.displayInfo();

//----------------------------------------------------------------------------------------------------------------

        test.assignDetails(101,"Yash","abc",1234567);
        test.displayInfo();

//----------------------------------------------------------------------------------------------------------------

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id name email salary");
        // Take Input :- for id , name , email , salary
        int id = sc.nextInt();
        String nm = sc.next();
        String em = sc.next();
        double sal = sc.nextDouble();
        // Param Values
        test.assignDetails(id,nm,em,sal);
        test.displayInfo();
        System.out.println("----END----");

//----------------------------------------------------------------------------------------------------------------

    }
}
