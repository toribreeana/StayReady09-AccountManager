package com.codedifferently.bankaccountlab;

import org.junit.Assert;
import org.junit.Test;

public class CheckingAccountTest {

    //    make constructor test
    //    private int accountNumber;
    //    private double fees;
    //    private String name;
    //    private double balance;

    @Test
    public void findAccountNumberTest(){
        //Given
        int expectedAccountNumber = 200;
        double expectedFees = 10.0;
        String expectedName = "Sarah";
        double expectedBalance = 1000.0;
        CheckingAccount.CheckingAccount checkingAccount = new CheckingAccount.CheckingAccount(expectedAccountNumber, expectedFees, expectedName, expectedBalance);

        //When
        int actualAccountNumber = checkingAccount.findAccountNumber();


        //Then
        Assert.assertEquals(expectedAccountNumber, actualAccountNumber);
    }

    @Test
    public void feesTest(){
        //Given
        int expectedAccountNumber = 500;
        double expectedFees = 10.0;
        String expectedName = "Sarah";
        double expectedBalance = 2000.0;
        CheckingAccount.CheckingAccount checkingAccount = new CheckingAccount.CheckingAccount(expectedAccountNumber, expectedFees, expectedName, expectedBalance);

        //When
        int actualAccountNumber = checkingAccount.findAccountNumber();


        //Then
        Assert.assertEquals(expectedAccountNumber, actualAccountNumber);
    }

    @Test
    public void getNameTest(){
        //Given
        int expectedAccountNumber = 3000;
        double expectedFees = 7.0;
        String expectedName = "Sarah";
        double expectedBalance = 10000.0;
        CheckingAccount.CheckingAccount checkingAccount = new CheckingAccount.CheckingAccount(expectedAccountNumber, expectedFees, expectedName, expectedBalance);

        //When
        String actualName = checkingAccount.getName();


        //Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void getBalanceTest(){
        //Given
        int expectedAccountNumber = 4000;
        double expectedFees = 10.0;
        String expectedName = "Sarah";
        double expectedBalance = 1000.0;
        CheckingAccount.CheckingAccount checkingAccount = new CheckingAccount.CheckingAccount(expectedAccountNumber, expectedFees, expectedName, expectedBalance);

        //When
        double actualBalance = checkingAccount.getBalance();


        //Then
        Assert.assertEquals(expectedBalance, actualBalance, 0.0);
    }


}

