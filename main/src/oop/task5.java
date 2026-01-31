package oop;

public class task5 {
    public static void main(String[] args) {
        double balance = 1000;
        double interestRate = 0.07; 

        double interestAmount = balance * interestRate;
        double newBalance = balance + interestAmount;

        System.out.println("Initial balance: " + balance);
        System.out.println("Interest rate: " + (interestRate * 100) + "%");
        System.out.println("Interest added: $" + interestAmount);
        System.out.println("New balance: $" + newBalance);
    }
}
