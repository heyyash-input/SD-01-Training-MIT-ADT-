package Day10.MiniProject_Standard.Bank_Client;

import Day10.MiniProject_Standard.Bank_Utils.Connection_Utils;

import java.sql.Connection;
import java.sql.Statement;

public class Test_Transaction {
    public static void main(String[] args) throws Exception {
//--------------------------------------------------------------------------------------------------------------
        Connection con = Connection_Utils.getDbConnection();
        try{
            con.setAutoCommit(false); // true by default
            String str1 =  "insert into account values(107 ,'xyz', 'xyz' , 'xyz' , 9000)";
            String str2 =  "insert into account values(108,'xyz1' , 'xyz1' ,'xyz1' ,9000 )";

            Statement stmt = con.createStatement();
            int i = stmt.executeUpdate(str1);
            System.out.println("-----1 act inserted-----");

            i = stmt.executeUpdate(str2) ;
            System.out.println("-----2 act inserted----");
            con.commit(); // as soon insert
            System.out.println("-----Commit-----");

        }catch (Exception ex){
            System.out.println("-----Transaction rollback-----");
            con.rollback();
            ex.printStackTrace();
        }
    }
//--------------------------------------------------------------------------------------------------------------
}
