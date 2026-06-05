package Day05.InheritanceCore.Sales;

public class User extends Bill{
//-----------------------------------------------------------------------------------------------------------------

    private String addItem ;

//-----------------------------------------------------------------------------------------------------------------

    public User(){
        System.out.println("--Default Construtor of User---");
    }

//-----------------------------------------------------------------------------------------------------------------

    public User(int id , String name , double amount,String addItem){
        super(id,name,amount);
        System.out.println("");
        this.addItem= addItem ;
    }

    public String getAddItem() {
        return addItem;
    }

    public void setAddItem(String addItem) {
        this.addItem = addItem;
    }
//-----------------------------------------------------------------------------------------------------------------
}
