package Day09.Revision_Threads;

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
    public  synchronized void deposite (double ammount ){
        System.out.println("Deposite operation started by:" + Thread.currentThread()
                .getName());
        balance += ammount ;
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Deposite operation started by:" + balance + Thread.currentThread()
                .getName());
    }
//----------------------------------------------------------------------------------------------------------------
    public synchronized void withdraw ( double ammount ){
        System.out.println("Withdraw operation started by:" + Thread.currentThread()
                .getName());
        balance -= ammount ;
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Withdraw operation started by:" + balance + Thread.currentThread()
                .getName());

    }
//----------------------------------------------------------------------------------------------------------------
}
