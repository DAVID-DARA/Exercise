package com.Four;

public class SavingsAccount
{
    private static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(int savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public void calculateMonthlyInterest()
    {
        double monthlyInterest = (this.savingsBalance * annualInterestRate)/12;
        this.savingsBalance = this.savingsBalance + monthlyInterest;
        System.out.println("Saving Balance: "+this.savingsBalance);
    }

    public static void modifyInterestRate(double newInterestRate) {
        annualInterestRate = newInterestRate;
    }
}
