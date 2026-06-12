package Day10.MiniProject_Standard.Bank_DAL;

import Day10.MiniProject_Standard.Bank_POJO.Account;
import Day10.MiniProject_Standard.Bank_Utils.Connection_Utils;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Account_DAO {
    //-------------------------------------------------------------------------------------------------------------------
    private Connection con = Connection_Utils.getDbConnection();// to get access to all
    Scanner sc = new Scanner(System.in);

    public ArrayList<Account> getAllEmployee() throws SQLException {

        // For showing details:-
        String sql = "select * from Account";
        Statement stmt = con.createStatement(); // handle statement too
        ResultSet rset = stmt.executeQuery(sql);

        ArrayList<Account> allAct = new ArrayList<Account>();
        // size=0 , isEmpty = true ,

        while (rset.next()) {
            Account act = new Account(
                    rset.getInt("actid"),
                    rset.getString("name"),
                    rset.getString("email"),
                    rset.getString("pwd"),
                    rset.getDouble("balance")
            );
            allAct.add(act);
        }
        rset.close();
        return allAct;
    }
//----------------------------------------------------------------------------------------------------------------

    public int createNewAcc(Account act) throws SQLException {

        System.out.println(" actid  , name ,  email  , pass , balance");

        String sqlInsert = "insert into Account values(?, ? , ? , ? , ?)";

        PreparedStatement pstmt = con.prepareStatement(sqlInsert);
        pstmt.setInt(1, act.getActId());
        pstmt.setString(2, act.getName());
        pstmt.setString(3, act.getEmail());
        pstmt.setString(4, act.getPass());
        pstmt.setDouble(5, act.getBalance());

        int i = pstmt.executeUpdate();
        System.out.println("------------Account Created----------");
        return i;

    }

    //---------------------------------------------------------------------------------------------------------------
    public int editAcc(Account act) throws SQLException {

        System.out.println(" actid  , name ,  email  , pass , balance");

        String sqlInsert = "insert into Account values(?, ? , ? , ? , ?)";

        PreparedStatement pstmt = con.prepareStatement(sqlInsert);
        pstmt.setInt(1, act.getActId());
        pstmt.setString(2, act.getName());
        pstmt.setString(3, act.getEmail());
        pstmt.setString(4, act.getPass());
        pstmt.setDouble(5, act.getBalance());

        int i = pstmt.executeUpdate();
        System.out.println("Inserted");
        return i;

    }

    //-------------------------------------------------------------------------------------------------------------
    public void getActDtls(Account act) throws SQLException {

        System.out.println("Enter acc id  to fetch");
        int actId = sc.nextInt();

        // Write - Prepared statemnt:-
        String sqlUpdate = "SELECT * FROM Account WHERE actid = ?"; // not password

        PreparedStatement stmt = con.prepareStatement(sqlUpdate);
        stmt.setInt(1, actId);

        ResultSet rs = stmt.executeQuery();


        if (rs.next()) {
            System.out.println(
                    rs.getInt("actid") + " | " +
                            rs.getString("name") + " | " +
                            rs.getString("email") + " | " +
                            rs.getString("pwd") + " | " +
                            rs.getString("balance")
            );
        } else {
            System.out.println("Account not found");
        }
        rs.close();
    }
//-------------------------------------------------------------------------------------------------------------

    public int deleteAct(Account act) throws SQLException {

        String sql = "DELETE FROM Account WHERE actid=?";

        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, act.getActId());

        int rows = stmt.executeUpdate();

        return rows;
    }
//-------------------------------------------------------------------------------------------------------------

    public boolean getLogin() throws SQLException {

        System.out.println("Enter email and password");

        String accEmail = sc.next();
        String accPwd = sc.next();

        String sql = "SELECT * FROM Account WHERE email=? AND pwd=?";

        PreparedStatement stmt = con.prepareStatement(sql);

        stmt.setString(1, accEmail);
        stmt.setString(2, accPwd);

        ResultSet rs = stmt.executeQuery();

        boolean success = rs.next();

        rs.close();
        return success;
    }

    //---------------------------------------------------------------------------------------------------------------
    public Account loginCore(String email, String pwd) throws SQLException {

        System.out.println("---------Inside login------" + email + " " + pwd);

        String sql = "select * from Account where email = ? and pwd = ?";

        PreparedStatement pstmt = con.prepareStatement(sql);

        pstmt.setString(1, email);
        pstmt.setString(2, pwd);

        ResultSet rset = pstmt.executeQuery();

        if (rset.next()) {
            System.out.println("Valid");
            System.out.println("Account:" + rset.getInt("actid") + " " + rset.getString("name") + " "
                    + rset.getString("email") + " "
                    + rset.getString("pwd") + " "
                    + rset.getDouble("balance") + " ");

            return new Account(rset.getInt("actid"), rset.getString("name"),
                    rset.getString("email"),
                    rset.getString("pwd"),
                    rset.getDouble("balance"));

        } else {
            System.out.println("Invalid");
            return null;
        }
    }

    public void getWithdraw(Account act, double amount) throws SQLException {
        System.out.println("-----Inside withdraw----");

            double oldBalance = act.getBalance() ;
            double newBalance = oldBalance - amount ;

            String sql = "UPDATE Account SET balance=? WHERE actid=?";

            PreparedStatement pstmt = con.prepareStatement(sql);

            pstmt.setDouble(1, newBalance);
            pstmt.setInt(2, act.getActId());

            int i = pstmt.executeUpdate();
            if (i > 0) {
                System.out.println("Withdrawal Successful");
                System.out.println("Remaining Balance = " + newBalance);
            }
    }

    public void getDeposite(Account act, double amount) throws SQLException {
        System.out.println("-----Inside Deposite----");

        double oldBalance = act.getBalance() ;
        double newBalance = oldBalance + amount  ;

        String sql = "update Account SET balance=? WHERE actid=?";

        PreparedStatement pstmt = con.prepareStatement(sql);

        pstmt.setDouble(1, newBalance);
        pstmt.setInt(2, act.getActId());

        int i = pstmt.executeUpdate();

        if (i > 0) {
            System.out.println("Deposite Successful");
            System.out.println("Remaining Balance = " + newBalance);
        }
    }
//-------------------------------------------------------------------------------------------------------------
}
