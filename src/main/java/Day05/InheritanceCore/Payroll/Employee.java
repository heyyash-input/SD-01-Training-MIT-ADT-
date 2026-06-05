package Day05.InheritanceCore.Payroll;
//Super java.lang.Obj
public class Employee {
//---------------------------------------------------------------------------------------------------------------

    private int empId;
    private String name;
    private double salary;

//---------------------------------------------------------------------------------------------------------------

    public void displayInfo(){
        System.out.println("Info:" + empId + "-> " + name + "-> " + salary );
    }

//---------------------------------------------------------------------------------------------------------------


    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

// ---------------------------------------------------------------------------------------------------------------

    public Employee(){
        System.out.println("----Default Employee----");
        empId = 10 ;
        name = "RAM";
        salary = 10000;
    }

//---------------------------------------------------------------------------------------------------------------

    public void calSal(){
        System.out.println("Emplye Salary: " + salary);
    }

//---------------------------------------------------------------------------------------------------------------

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    //---------------------------------------------------------------------------------------------------------------
}
