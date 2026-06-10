package Day08.SerializeAndDeserialize;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test_Deserialize {
    public static void main(String[] args) {
//----------------------------------------------------------------------------------------------------------------
        try (ObjectInputStream read = new ObjectInputStream(new FileInputStream("ProductStore.dat"))) {

            // create product
            Product prd = new Product(101 , "Book" , 89) ;
            // This will now work perfectly because ObjectInputStream has .readObject()
            Product p = (Product) read.readObject();
            System.out.println(p);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
//----------------------------------------------------------------------------------------------------------------
    }
}
