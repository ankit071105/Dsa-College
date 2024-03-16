import java.util.ArrayList;
import java.util.Scanner;

class demo {
    private String bankName;
    private double depositAmount;
    private static double totalAmount = 0;

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setAmount(double depositAmount) {
        if (depositAmount >= 1000) {
            this.depositAmount = depositAmount;
            totalAmount += depositAmount;
        } else {
            System.out.println("Minimum deposit amount is 1000.");
        }
    }

    public void showData() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Deposit Amount: " + depositAmount);
    }

    public static double getTotalAmount() {
        return totalAmount;
    }

    public static void displayMinDepositBank(demo[] banks) {
        double minDeposit = Double.MAX_VALUE;
        String minDepositBank = "";

        for (demo bank : banks) {
            if (bank.depositAmount < minDeposit) {
                minDeposit = bank.depositAmount;
                minDepositBank = bank.bankName;
            }
        }

        System.out.println("Bank with minimum deposit: " + minDepositBank);
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        demo[] banks = new demo[5];

        for (int i = 0; i < 5; i++) {
            banks[i] = new demo();
            System.out.println("Enter the Bank Amount "+(i+1));
            banks[i].setBankName("Bank "+(i+1));
            banks[i].setAmount(sc.nextInt());
        }
        for (demo bank : banks) {
            bank.showData();
            System.out.println();
        }

        System.out.println("Total Amount Deposited: " + demo.getTotalAmount());

        demo.displayMinDepositBank(banks);
    }
}
