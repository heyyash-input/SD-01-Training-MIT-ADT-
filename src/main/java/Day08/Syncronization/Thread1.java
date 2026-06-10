package Day08.Syncronization;

public class Thread1 extends Thread {
//-----------------------------------------------------------------------------------------------------------------
    private Account act ; // has - a relationship
//-----------------------------------------------------------------------------------------------------------------
    public Thread1(Account act){
        this.act = act;
    }
//-----------------------------------------------------------------------------------------------------------------
    public void run (){
        System.out.println("------Thread 1 started--------" +Thread.currentThread().getName());

        act.withdraw(1000);

        System.out.println("------Thread 1 started--------" +Thread.currentThread().getName());
    }
//-----------------------------------------------------------------------------------------------------------------
}
