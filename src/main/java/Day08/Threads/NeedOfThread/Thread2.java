package Day08.Threads.NeedOfThread;

public class Thread2 extends Thread{

//-----------------------------------------------------------------------------------------------------------------
    public void run (){
        System.out.println("----Thread2 is started------");

        for (int i = 10; i >= 0 ; i--) {
            System.out.println(i);
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("----Thread2 is Ended------");
    }
//-----------------------------------------------------------------------------------------------------------------
}
