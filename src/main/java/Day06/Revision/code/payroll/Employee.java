package Day06.Revision.code.payroll;

public class Employee {
//----------------------------------------------------------------------------------------------------------------
    // data Members : instance variable

    private int empId ;
    private String name ,emial ;
    protected double salary;

//----------------------------------------------------------------------------------------------------------------
    private static int empidCounter;
//----------------------------------------------------------------------------------------------------------------
//static data member : static block
    static {
        //only once then use static block execute
        empidCounter =1001 ;
    }

//----------------------------------------------------------------------------------------------------------------

    public Employee(String name, String emial, double salary) {
        //super(); Object cls default constructor
        this.name = name;
        this.emial = emial;
        this.salary = salary;
        this.empId = empidCounter;
        empidCounter++; //1002 hojayega
        System.out.println("-----Employee Created-----");
    }

//----------------------------------------------------------------------------------------------------------------

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmial() {
        return emial;
    }

    public void setEmial(String emial) {
        this.emial = emial;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static int getEmpidCounter() {
        return empidCounter;
    }

    public static void setEmpidCounter(int empidCounter) {
        Employee.empidCounter = empidCounter;
    }

//----------------------------------------------------------------------------------------------------------------

    public void calSalary (){
        System.out.println("Employee Salary:" + salary);
    }

//----------------------------------------------------------------------------------------------------------------

    public final void calIncomeTax(){

    }

//----------------------------------------------------------------------------------------------------------------

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", emial='" + emial + '\'' +
                ", salary=" + salary +
                '}';
    }
//----------------------------------------------------------------------------------------------------------------
}

