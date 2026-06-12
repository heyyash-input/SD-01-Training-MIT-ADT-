package Day10.MiniProject_Standard.Bank_Client;

import Day10.MiniProject_Standard.Bank_DAL.Account_DAO;
import Day10.MiniProject_Standard.Bank_POJO.Account;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Test_Account {

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);

        Account_DAO actDao = new Account_DAO();
        ArrayList<Account> bankActs;
//
//        if (!actDao.getLogin()) {
//            System.out.println("Login Failed");
//            return;
//        }

        int ch;
        do {

            System.out.println("1:Show Details");
            System.out.println("2:Create Account");
            System.out.println("3:Update Account");
            System.out.println("4:Delete Account");
            System.out.println("5:Get Account by actId");
            System.out.println("6:login ");
            System.out.println("7:Withdraw");
            System.out.println("8:Deposite");


            System.out.println("Enter your choice");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("--------Show all Account-------");
                    bankActs = actDao.getAllEmployee();

                    for (Account act : bankActs) {
                        System.out.println(act);
                    }
                    break;

                case 2:
                    System.out.println("--------Create Account --------");
                    int i = actDao.createNewAcc(new Account(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.nextDouble()));

                    if (i > 0) System.out.println("............Inserted............");
                    break;
                case 3:
                    System.out.println("--------Update Account Details--------");

                    break;
                case 4:
                    System.out.println("-------Delete Account--------");
                    int actId = sc.nextInt();
                    Account act1 = new Account();
                    act1.setActId(actId);
                    actDao.deleteAct(act1);
                    break;

                case 5:
                    System.out.println("-------Get Account by id--------");
                    int getactId = sc.nextInt();
                    Account act2 = new Account();
                    act2.getActId();
                    actDao.getActDtls(act2);
                    break;
                case 6:
                    System.out.println("-----login-----");
                    break;
                case 7:
                    System.out.println("Enter Account ID:");
                    int actId4 = sc.nextInt();

                    System.out.println("Enter Amount to Withdraw:");
                    int amount = sc.nextInt();

//                    actDao.getWithdraw(actId3, amount);
                    break;

                case 8:
                    System.out.println("Enter account id");
                    int actId5 = sc.nextInt();

                    System.out.println("Enter current balance");
                    double balance = sc.nextDouble();

                    System.out.println("Enter amount to withdraw");
                    double amount2 = sc.nextDouble();

                    Account act = new Account();
                    act.setActId(actId5);
                    act.setBalance(balance);

                    actDao.getWithdraw(act, amount2);

                default:
                    System.out.println("Enter valid details");
            }
        } while (ch != 5);
        System.out.println("------------Visit again------------");

    }
}
