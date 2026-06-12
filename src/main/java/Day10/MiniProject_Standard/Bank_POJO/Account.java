package Day10.MiniProject_Standard.Bank_POJO;
//POJO class:-
public class Account {
//------------------------------------------------------------------------------------------------------------------
    private int actId ;
    private String name , email , pass ;
    private double balance;
//------------------------------------------------------------------------------------------------------------------
    public Account(int actId, String name, String email, String pass, double balance) {
        this.actId = actId;
        this.name = name;
        this.email = email;
        this.pass = pass;
        this.balance = balance;
    }
//----------------------------------------------------------------------------------------------------------------
    public Account(){
        System.out.println("-------Default------");
    }
//------------------------------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "Account_POJO{" +
                "actId=" + actId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", pass='" + pass + '\'' +
                ", balance=" + balance +
                '}';
    }
//------------------------------------------------------------------------------------------------------------------
    public int getActId() {
        return actId;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }

    public double getBalance() {
        return balance;
    }

    public void setActId(int actId) {
        this.actId = actId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
//------------------------------------------------------------------------------------------------------------------
}
