package bai_thi_ex1;

import bai_thi_ex2.Flight;

public class bank {
    private double balance;
    private double rate;

    public bank(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
    }

    public double calculateInterest() {
        double interest = balance * (rate / 1200);
        return interest;
    }
}


