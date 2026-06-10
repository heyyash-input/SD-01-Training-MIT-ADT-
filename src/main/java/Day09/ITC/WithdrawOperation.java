package Day09.ITC;

import Day09.Revision_Threads.Account;

public class WithdrawOperation extends Thread{
//----------------------------------------------------------------------------------------------------------------
    private Day09.Revision_Threads.Account act ;
//----------------------------------------------------------------------------------------------------------------
    public WithdrawOperation(Account act) {
        this.act = act;
    }
//----------------------------------------------------------------------------------------------------------------
    @Override
    public void run (){
        try {
            System.out.println("------WithDraw Thread 1 started--------" + Thread.currentThread().getName());
            Thread.sleep(2000);
            act.withdraw(1000);
            Thread.sleep(2000);
            System.out.println("------WithDrawT hread 1 Ended --------" + Thread.currentThread().getName());
        }catch (Exception ex ){
            System.err.println("Error: " + ex.getMessage());
        }
    }
//-------------------------------------------------------------------------------------------------------------
}
