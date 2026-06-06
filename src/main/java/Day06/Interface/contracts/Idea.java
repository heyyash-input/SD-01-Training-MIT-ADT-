package Day06.Interface.contracts;

public class Idea  implements Sim{

    @Override
    public void calling() {
        System.out.println("---Calling------Idea----");
    }

    @Override
    public void msging() {
        System.out.println("----msging-----");
    }
}

class Mobile {
    Idea sim ;
}
