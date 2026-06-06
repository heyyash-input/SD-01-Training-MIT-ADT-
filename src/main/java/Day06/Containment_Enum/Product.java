package Day06.Containment_Enum;

public class Product {
//----------------------------------------------------------------------------------------------------------------
    private int prdid ;
    private String pName ;
    private Date dom ; //d / m / y ----> has a
//    private Date doe; //d / m / y ----->
//    private Date dop; //d / m / y
    private String category ;

//----------------------------------------------------------------------------------------------------------------
    //ENUM:-  Enumerated categary (collection of fixed constant)
    private Category prdCate;

//----------------------------------------------------------------------------------------------------------------
    public Product(int prdid, String pName, Date dom, String prdCate) {
        super();
        this.prdid = prdid;
        this.pName = pName;
        this.dom = dom;
        this.prdCate = Category.valueOf(prdCate);

        System.out.println("prd---Created successfully----");
    }
//----------------------------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "Product{" +
                "prdid=" + prdid +
                ", pName='" + pName + '\'' +
                ", dom=" + dom +
                '}';
    }
//----------------------------------------------------------------------------------------------------------------
    public void display(){
        System.out.println("Product details are:" + prdid + pName + dom );
    }
//----------------------------------------------------------------------------------------------------------------
}
