import com.codedifferently.bankaccountlab.BankAccount;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
    private static int currentAccountIndex;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int expectedAccountNumber = 200;
        double expectedFees = 10.0;
        String expectedName = "Sarah";
        double expectedBalance = 1000.00;
        CheckingAccount checkingAccount = new CheckingAccount(expectedAccountNumber, expectedFees, expectedName, expectedBalance);

        int expectedAccountNumber02 = 500;
        double expectedFees2 = 10.0;
        String expectedCompany = "Bank Teller";
        int expectedTaxId = 10;
        double expectedBalance2 = 2000.0;
        BusinessAccount businessAccount = new BusinessAccount(expectedAccountNumber02, expectedFees2, expectedCompany, expectedTaxId, expectedBalance2);

        int expectedAccountNumber03 = 7000;
        double expectedFees3 = 10.0;
        String expectedName2 = "Sarah";
        double expectedRates = 5.0;
        double expectedBalance3 = 3000.0;
        SavingsAccount savingsAccount = new SavingsAccount(expectedAccountNumber03, expectedFees3, expectedName2, expectedRates, expectedBalance3);

        double savingAccountBalance = 3000.0, withdraw, deposit;
        double checkingAccountBalance = 1000.0, withdraw2, deposit2;
        double businessAccountBalance = 2000.0, withdraw3, deposit3;

        //finish methods

    }
}

