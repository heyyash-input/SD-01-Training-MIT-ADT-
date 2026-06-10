package Day08.Syncronization;

import Day08.Threads.NeedOfThread.Methods.ByExtend.Thread1;

public class Account {
//-----------------------------------------------------------------------------------------------------------------
    private int accId ;
    private String name ;
    private double balance ;
//-----------------------------------------------------------------------------------------------------------------
    public Account(int accId, String name, double balance) {
        this.accId = accId;
        this.name = name;
        this.balance = balance;
    }
//-----------------------------------------------------------------------------------------------------------------
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
//-----------------------------------------------------------------------------------------------------------------
    public synchronized void deposite ( double ammount ){
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
//-----------------------------------------------------------------------------------------------------------------
    public int getAccId() {
        return accId;
    }

    public void setAccId(int accId) {
        this.accId = accId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
//-----------------------------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "Account{" +
                "accId=" + accId +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
//-----------------------------------------------------------------------------------------------------------------
}
