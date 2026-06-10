package Day09.ITC;

public class Account {
//----------------------------------------------------------------------------------------------------------------
    private int actId ;
    private String name ;
    private double balance ;
//----------------------------------------------------------------------------------------------------------------
    public Account(int actId, String name, double balance) {
        this.actId = actId;
        this.name = name;
        this.balance = balance;
    }
//----------------------------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "Account{" +
                "actId=" + actId +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
//----------------------------------------------------------------------------------------------------------------
    public   void deposite (double ammount ) throws InterruptedException {

        Thread.sleep(2000);
        System.out.println("Deposite operation started by:" + Thread.currentThread()
                .getName());

//        //notify all waiting threads -----> this.notify();
        this.notify(); // as soon as deposite is completed then notify

        balance += ammount ;

        Thread.sleep(2000);
        System.out.println("After deposite: " + balance );

        System.out.println("Deposite operation Ended by:" + balance + Thread.currentThread()
                .getName());
    }
//----------------------------------------------------------------------------------------------------------------
    public  void withdraw ( double ammount ) throws InterruptedException {

        Thread.sleep(1000);
        System.out.println("Withdraw operation started by:" + Thread.currentThread()
                .getName());

//        // to make wait
        if (balance < ammount){
            System.out.println("-----waiting for some deposite to occur----");
            this.wait();
        }

        balance -= ammount ;
            Thread.sleep(2000);
        System.out.println("After Withdraw: " + balance);

        System.out.println("Withdraw operation Ended by:" + balance + Thread.currentThread()
                .getName());

    }
//----------------------------------------------------------------------------------------------------------------
}
