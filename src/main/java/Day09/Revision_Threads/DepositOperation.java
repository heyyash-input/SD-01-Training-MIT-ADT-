package Day09.Revision_Threads;

public class DepositOperation extends Thread {
//----------------------------------------------------------------------------------------------------------------
        private Account act ;
//----------------------------------------------------------------------------------------------------------------

    public DepositOperation(Account act) {
        this.act = act;
    }

//----------------------------------------------------------------------------------------------------------------
    @Override
    public void run (){
        try {
            System.out.println("------Deposite Thread started--------" + Thread.currentThread().getName());
            Thread.sleep(2000);
            act.deposite(6000);
            Thread.sleep(2000);
            System.out.println("------Deposite Thread Ended --------" + Thread.currentThread().getName());
        }catch (Exception ex ){
            System.err.println("Error: " + ex.getMessage());
        }
    }
//----------------------------------------------------------------------------------------------------------------
}
