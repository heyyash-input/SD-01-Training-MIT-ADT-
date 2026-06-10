package Day09.ITC;


public class DepositOperation extends Thread {
//----------------------------------------------------------------------------------------------------------------
        private Account act ;
//----------------------------------------------------------------------------------------------------------------

    public DepositOperation(Account act) {
        this.act = act;
    }

//----------------------------------------------------------------------------------------------------------------
    //must override run method from Thread class:why?
    //Answer:Thread class run method is empty
    //run method in Thread does nothing

    //override rule:same fun name and same sign and return type

    @Override
    public void run (){
        try {
            System.out.println("------Deposite Thread started--------" + Thread.currentThread().getName());
            Thread.sleep(2000);
            act.deposite(5000);
            Thread.sleep(1000);
            System.out.println("------Deposite Thread Ended --------" + Thread.currentThread().getName());
        }catch (Exception ex ){
            System.err.println("Error: " + ex.getMessage());
        }
    }
//----------------------------------------------------------------------------------------------------------------
}
