package Day08.Serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test_Deserialize {
    public static void main(String[] args) {
//----------------------------------------------------------------------------------------------------------------
        try(ObjectOutputStream read = new ObjectOutputStream(new FileOutputStream("ProductStore.dat"));){
//            Product p = (Product) read.readObject() ; // return object type
//            System.out.println(p);
        }
        catch (Exception ex ){
            ex.printStackTrace();
        }
//----------------------------------------------------------------------------------------------------------------
    }
}
