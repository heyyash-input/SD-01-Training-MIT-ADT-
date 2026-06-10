package Day09.Revision_Threads;

public class Test_ThreadSync {

    public static void main(String[] args) throws InterruptedException {
        Account act = new Account(101 , "Ram" ,5000);

        WithdrawOperation t1 = new WithdrawOperation(act);
        t1.setName("WithDraw Thread");
        t1.start();

        DepositOperation t2 = new DepositOperation(act);
        t2.setName("Deposite Thread");
        t2.start();

        t1.join();
        t2.join();

        System.out.println("---------Main Thread Over----------");
    }
}
