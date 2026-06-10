package Day08.Syncronization;

public class Thread2 extends Thread {
//-----------------------------------------------------------------------------------------------------------------
    private Account act ; // has - a relationship
//-----------------------------------------------------------------------------------------------------------------
    public Thread2(Account act){
        this.act = act;
    }
//-----------------------------------------------------------------------------------------------------------------
    public void run (){
        System.out.println("------Thread 2 started--------" +Thread.currentThread().getName());

        act.deposite(1000);

        System.out.println("------Thread 2 started--------" +Thread.currentThread().getName());
    }
//-----------------------------------------------------------------------------------------------------------------
}
