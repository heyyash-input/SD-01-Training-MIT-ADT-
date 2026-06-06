package Day06.Revision.code.Tester;
import Day06.Revision.code.payroll.* ;
public class Test_Payroll {

    public static void main(String[] args) {
//---------------------------------------------------------------------------------------------------------------
        Manager mgr = new Manager("Ram" , "m@gmail.com" , 890000 ,"Sham" , 8900);
        mgr.calSalary();
        System.out.println(mgr); // toString --> is called for manager to string method

        SalesPerson salesPerson = new SalesPerson("Sunil " , "@gmial.com" , 8900 ,6868 , 68664 ,757 );
        salesPerson.calSalary();
        System.out.println(salesPerson);

//---------------------------------------------------------------------------------------------------------------

        Employee [] emp = new Employee[2];
        // tried by me :- below
//        emp [0] = new Employee("Rohit" , "@rohit" , 7800);
//        emp [1] = new Manager("Shyam" ,"Shyam@emial.in" , 89000 , " yaam" , 7600);

        emp [0] = mgr ;
        emp[1] = salesPerson;
        for (int i = 0; i < emp.length; i++) {
            System.out.println(emp[i]);
        }

        System.out.println("-----Show all emial----");
        for (int i = 0; i < emp.length; i++) {
            System.out.println(emp[i].getEmial());
        }

//---------------------------------------------------------------------------------------------------------------

        System.out.println("------------Show Emp specific task------------");
        for (int i = 0; i < emp.length; i++) {
            // forcfully
//          Manager m  =   emp[i].managerTask(); //

            // CLassCastException:-
            //to avoid this use RTTI:-
//            Manager m = ((Manager)emp[i]);
//            m.managerTask();
            if(emp[i] instanceof Manager){
                Manager m = ((Manager) emp[i]);
                m.managerTask();
            }
            else if (emp[i] instanceof SalesPerson){
                SalesPerson s = ((SalesPerson) emp[i]);
                s.salesperTask();
            }

        }
//---------------------------------------------------------------------------------------------------------------

    }

}
