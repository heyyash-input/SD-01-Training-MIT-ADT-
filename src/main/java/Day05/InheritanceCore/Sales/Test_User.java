package Day05.InheritanceCore.Sales;

public class Test_User {
    public static void main(String[] args) {

        User user1 = new User(89,"Yash",89990,"KeyChain");
        user1.displayBill();
        System.out.println(user1.getAddItem());
        System.out.println("Enter");
    }
}
