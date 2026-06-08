package Day07.ExceptionHandling.Bank;

import java.util.Scanner;

public class Test_BankException {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)){
            Account act = new Account(101,"Yash",2000);
            System.out.println("Enter ammount to withdraw :");
            act.withdraw(sc.nextInt());
        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Error: "+ ex.getMessage());
        }

    }
}
