package Day08.Serialize;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test_PrdSerialize {
    public static void main(String[] args) {

         // object ----> byte stream
        //write into file
        try ( ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream("ProductStore.dat"));){
            //create product
            Product prd = new Product(101 , "TV" , 100 );
            //serialize prd into file
            writer.writeObject(prd); // java.io.NotSerializableException: Day08.Serialize.Product
            System.out.println("---Prd get store successfully---");
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
//-----------------------------------------------------------------------------------------------------------------
    }
}
