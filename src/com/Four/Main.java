package com.Four;

public class Main
{
    public static void main(String[] args)
    {
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);

        saver1.modifyInterestRate(3);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
    }

}
