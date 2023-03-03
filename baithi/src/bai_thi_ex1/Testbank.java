package bai_thi_ex1;

public class Testbank {
    public static void main(String[] args) {
        bank mybank = new bank(1000, 10);
        double monthlyInterest = mybank.calculateInterest();
        System.out.println("Monthly interest: $" + monthlyInterest);
    }
}
