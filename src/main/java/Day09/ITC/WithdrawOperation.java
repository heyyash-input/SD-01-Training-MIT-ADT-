package Day09.ITC;


public class WithdrawOperation extends Thread{
//----------------------------------------------------------------------------------------------------------------
    private Account act ;
//----------------------------------------------------------------------------------------------------------------
    public WithdrawOperation(Account act) {
        this.act = act;
    }
//----------------------------------------------------------------------------------------------------------------
    //// must override run method from Thread class:why?
    //	// Answer:Thread class run method is empty
    //	// run method in Thread does nothing

    @Override
    public void run (){
        try {
            System.out.println("------WithDraw Thread started--------" + Thread.currentThread().getName());
            Thread.sleep(2000);
            act.withdraw(7000);
            Thread.sleep(2000);
            System.out.println("------WithDraw Thread Ended --------" + Thread.currentThread().getName());
        }catch (Exception ex ){
            System.err.println("Error: " + ex.getMessage());
        }
    }
//-------------------------------------------------------------------------------------------------------------
}
