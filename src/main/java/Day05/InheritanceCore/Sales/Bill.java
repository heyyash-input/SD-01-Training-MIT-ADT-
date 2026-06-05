package Day05.InheritanceCore.Sales;

public class Bill {
//-----------------------------------------------------------------------------------------------------------------

    private int billId ;
    private String name ;
    private double amount;

//-----------------------------------------------------------------------------------------------------------------


    public Bill(int billId, String name, double amount) {
        this.billId = billId;
        this.name = name;
        this.amount = amount;
    }

//-----------------------------------------------------------------------------------------------------------------

    public Bill(){
        super();
        System.out.println("---Default Construtor for Bill----");
    }

//-----------------------------------------------------------------------------------------------------------------

    @Override
    public String toString() {
        return "Bill{" +
                "billId=" + billId +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }

//-----------------------------------------------------------------------------------------------------------------

    public void displayBill(){
        System.out.println("User bill is: " + billId + " " + name + " " + amount);
    }

//-----------------------------------------------------------------------------------------------------------------
}
