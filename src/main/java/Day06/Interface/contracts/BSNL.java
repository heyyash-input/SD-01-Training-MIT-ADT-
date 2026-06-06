package Day06.Interface.contracts;

public class BSNL implements Sim{

    @Override
    public void msging() {
        System.out.println("----BSNL----Msging----");
    }

    @Override
    public void calling() {
        System.out.println("-------BSNL---calling---");
    }
}
