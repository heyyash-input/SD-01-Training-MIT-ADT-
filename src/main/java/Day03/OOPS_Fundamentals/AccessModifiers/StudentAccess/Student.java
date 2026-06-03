package Day03.OOPS_Fundamentals.AccessModifiers.StudentAccess;

import java.util.Scanner;

public class Student {

    private int stuID ;
    private String name , email ;
    private int marks ;

//----------------------------------------------------------------------------------------------------------------

    public void assignDetails(int id , String nm , String em , int mar){
        stuID = id;
        name = nm ;
        email = em;
        marks = mar;
        System.out.println("----Display Student---");
    }

//----------------------------------------------------------------------------------------------------------------

    public void displayInfo(){
        System.out.println(stuID+" "+name+" "+email+" "+marks);
    }

//----------------------------------------------------------------------------------------------------------------

    public void studentDetails(){
        System.out.println("------Student Details----");
    }

//----------------------------------------------------------------------------------------------------------------


}
