package Day03.OOPS_Fundamentals.AccessModifiers.EmployeeAccess;

public class Employee {

    private int empid;
    private String name , email ;
    private double salary;

//----------------------------------------------------------------------------------------------------------------

    public void assignDetails (int id , String nm , String em , double sal){
        empid = id ;
        name = nm ;
        email = em ;
        salary = sal ;
        System.out.println("---Employee Details Assigned---");
    }

//----------------------------------------------------------------------------------------------------------------

    public void empDetails(){
        System.out.println("-----Employee Details----");
    }

//----------------------------------------------------------------------------------------------------------------

    public void displayInfo(){
        System.out.println(empid+ " " + name + " " + email + " " + salary);
    }

//----------------------------------------------------------------------------------------------------------------
    public void salDetails (){
        System.out.println("-----Salary Details----");
    }


}
