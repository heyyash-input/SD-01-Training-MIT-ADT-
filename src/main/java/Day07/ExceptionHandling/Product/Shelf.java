package Day07.ExceptionHandling.Product;

public class Shelf {
//-----------------------------------------------------------------------------------------------------------------

    private int prdId;
    private String name ;
    private double amount ;
//-----------------------------------------------------------------------------------------------------------------

    public Shelf(){
        System.out.println("-----Default Cons-----");
    }

//-----------------------------------------------------------------------------------------------------------------

    public  void limitedPrd(double price) throws ProductException {
        if(  amount > price ){
            amount -= price ;
            System.out.println("Amount: " + amount);
        }else{
            throw new ProductException("Please enter correct price");
        }
    }

//-----------------------------------------------------------------------------------------------------------------


    public Shelf(int prdId, String name, double amount) {
        this.prdId = prdId;
        this.name = name;
        this.amount = amount;
    }

//-----------------------------------------------------------------------------------------------------------------

    public int getPrdId() {
        return prdId;
    }

    public void setPrdId(int prdId) {
        this.prdId = prdId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

//-----------------------------------------------------------------------------------------------------------------


}
