package Day10.MiniProject_Standard.Bank_Client;

import Day10.MiniProject_Standard.Bank_Utils.Connection_Utils;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.Scanner;

public class Test_StoredProcedure {

    public static void main(String[] args) {
        Connection con = Connection_Utils.getDbConnection();
        try{
            //sql


            //Callable
            Scanner sc = new Scanner(System.in);
            CallableStatement stmt = con.prepareCall("{call insertAccount(?,?,?,?,?)}"); // command
            System.out.println("Enter id name email pwd balance");

            stmt.setInt(1,sc.nextInt());
            stmt.setString(2,sc.next());
            stmt.setString(3,sc.next());
            stmt.setString(4,sc.next());
            stmt.setDouble(5,sc.nextDouble());

            int i = stmt.executeUpdate();
            System.out.println(i + "  Row Added....");
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
