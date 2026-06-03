package Day03.OOPS_Fundamentals.AccessModifiers.StudentAccess;

import java.util.Scanner;

public class Test_Student {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//----------------------------------------------------------------------------------------------------------------

        Student student = new Student();
        student.studentDetails();

//----------------------------------------------------------------------------------------------------------------

        student.assignDetails(101,"Yash","yash" , 89);
        student.displayInfo();

//----------------------------------------------------------------------------------------------------------------

        int id = sc.nextInt();
        String nm = sc.next();
        String em = sc.next();
        int mar = sc.nextInt();
        student.assignDetails(id,nm,em,mar);
        student.displayInfo();

//----------------------------------------------------------------------------------------------------------------

    }
}
