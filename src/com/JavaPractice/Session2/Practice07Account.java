package com.JavaPractice.Session2;

public class Practice07Account {
    private int nationalID;
    private int accountNumber;
    private int AccountTypeID;

    public Practice07Account(int nationalID, int accountNumber, int accountTypeID) {
        this.nationalID = nationalID;
        this.accountNumber = accountNumber;
        AccountTypeID = accountTypeID;
    }

    public int getNationalID() {
        return nationalID;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getAccountTypeID() {
        return AccountTypeID;
    }

    public void setNationalID(int nationalID) {
        this.nationalID = nationalID;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountTypeID(int accountTypeID) {
        AccountTypeID = accountTypeID;
    }

    public String toString()
    {
        return "ACCOUNT:"+this.accountNumber+" | "+this.AccountTypeID+" | "+ this.nationalID;
    }
}
