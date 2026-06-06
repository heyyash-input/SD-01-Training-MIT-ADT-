package Day06.Revision.code.payroll;

public final class SalesPerson extends Employee {
//----------------------------------------------------------------------------------------------------------------
    private double pa , fa , ta ;
//----------------------------------------------------------------------------------------------------------------
    public SalesPerson(String name, String emial, double salary, double pa, double fa, double ta) {
        super(name, emial, salary);
        this.pa = pa;
        this.fa = fa;
        this.ta = ta;
    }
//----------------------------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return super.toString() + "SalesPerson{" +
                "pa=" + pa +
                ", fa=" + fa +
                ", ta=" + ta +
                '}';
    }
//----------------------------------------------------------------------------------------------------------------

    @Override
    public void calSalary(){
        System.out.println("Sales Person salary" + (salary +(  pa + fa + ta )));
    }
//----------------------------------------------------------------------------------------------------------------

    //Cannot oerride the final mehtod from employee:
//    @Override
//    public final void calIncomeTax(){
//
//    }

// ----------------------------------------------------------------------------------------------------------------

    public void salesperTask(){
        System.out.println("----This is salesPerson specific task----");
    }
//    ----------------------------------------------------------------------------------------------------------------
}
