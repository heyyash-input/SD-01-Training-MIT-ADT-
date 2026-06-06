package Day06.Containment_Enum;

import java.util.Scanner;

public class TestEnum {
    public static void main(String[] args) {
//----------------------------------------------------------------------------------------------------------------
        Scanner sc = new Scanner(System.in);
//----------------------------------------------------------------------------------------------------------------
        System.out.println("Please Enter Category:  oils , grains , other ;");
        String cate = sc.next();
//----------------------------------------------------------------------------------------------------------------
        Category prdCate = Category.oils;
        System.out.println(prdCate);
//----------------------------------------------------------------------------------------------------------------
        //Assign String value to ENUM type
        //use valueof method given by enum
        Category productCategory = Category.valueOf(cate.toUpperCase()); // ---> easeist way to convert string to enum
        System.out.println("Category:" + productCategory);
//----------------------------------------------------------------------------------------------------------------
        sc.close();
//----------------------------------------------------------------------------------------------------------------
    }
}
