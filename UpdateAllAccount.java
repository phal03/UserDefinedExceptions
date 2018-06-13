package com.hackercode.controller;

import com.hackercode.UserDefinedExceptions.InsufficientFundsException;
import com.hackercode.utilities.CheckingAccount;

public class UpdateAllAccount {
    public static void main(String args[]){
        CheckingAccount c =new CheckingAccount(101);
        System.out.println("Depositing Rs.5000");
        c.deposit(5000);
        try{
            System.out.println("Withdrawing Rs.1000");
            c.withdraw(1000);
            System.out.println("Completed!");
            System.out.println("Withdrawing Rs.5000");
            c.withdraw(5000);
            System.out.println("Completed!");
        } catch (InsufficientFundsException e){
            System.out.println("Sorry Insufficient Balance.\nYou are short of Rs."+e.getAmount());
        }
    }
}
