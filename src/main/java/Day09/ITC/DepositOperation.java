package Day09.ITC;

import Day09.Revision_Threads.Account;

public class DepositOperation extends Thread {
//----------------------------------------------------------------------------------------------------------------
        private Day09.Revision_Threads.Account act ;
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
