package Day06.Revision.code.payroll;
//Super: Object unless and until you are not making extend
public class Manager extends Employee{
//----------------------------------------------------------------------------------------------------------------

    private String dname;
    private double incen;

//----------------------------------------------------------------------------------------------------------------

    //Constructor:-
    public Manager(String name, String emial, double salary, String dname, double incen) {
        super(name, emial, salary); // Employee Class ka call hoga
        this.dname = dname;
        this.incen = incen;
    }

//----------------------------------------------------------------------------------------------------------------

    @Override
    public String toString() {
        return  super.toString() + "Manager{" +
                "dname='" + dname + '\'' +
                ", incen=" + incen +
                '}';
    }

//----------------------------------------------------------------------------------------------------------------

    //Hide Employee calSal Method
    //Override in Manager Class
    // Manager salary = salary + incentives;
    //override
    @Override
    public void calSalary(){
        System.out.println("Manager Salary: " + salary + incen);
    }

//----------------------------------------------------------------------------------------------------------------

    public void managerTask(){
        System.out.println("----This is manager specific task----");
    }

//----------------------------------------------------------------------------------------------------------------
}
