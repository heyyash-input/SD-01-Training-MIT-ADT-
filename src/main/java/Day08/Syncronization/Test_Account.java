package Day08.Syncronization;

public class Test_Account {

    public static void main(String[] args) throws InterruptedException {
//-----------------------------------------------------------------------------------------------------------------

        System.out.println("----------Main Thread started-------");

        Account act1 = new Account(101 , "Ram" , 5000);
        Thread1 bankEmp1 = new Thread1(act1);
        bankEmp1.setName("Bank Emp 1");
        bankEmp1.start();


        System.out.println();
        Thread2 bankEmp2 = new Thread2(act1);
        bankEmp2.setName("Bank Emp 2 ");
        bankEmp2.start();


        bankEmp1.join();
        bankEmp2.join();
        System.out.println("----------Main Thread started-------");

//---------------------------------------------------------------------------------------------------------------
    }
}
