package Day07.ExceptionHandling.Bank;

public class Account {
//---------------------------------------------------------------------------------------------------------------
    private int acctId ;
    private String name ;
    private double balance;
//---------------------------------------------------------------------------------------------------------------
    public void withdraw ( double amount) throws BankException {
        if (balance > amount ){
            balance = balance - amount ;
            System.out.println("Balance: " + balance);
        }else{
            throw new BankException("Low Balance....");
        }
    }
//---------------------------------------------------------------------------------------------------------------
    public Account(int acctId, String name, double balance) {
        this.acctId = acctId;
        this.name = name;
        this.balance = balance;
    }
//---------------------------------------------------------------------------------------------------------------
    public Account (){
        System.out.println("---Default Cons Account ----");
    }
//---------------------------------------------------------------------------------------------------------------
}
