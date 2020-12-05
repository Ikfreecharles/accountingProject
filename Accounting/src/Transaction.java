import java.util.ArrayList;

public class Transaction {
    private double accountBalance;
    private ArrayList<Double> depositAmount = new ArrayList<>();
    private ArrayList<Double> withdrawAmount = new ArrayList<>();

    public Transaction() {
    }

    //method to deposit
    public double deposit (double amount){
        accountBalance += amount;
        depositAmount.add(amount);
        return accountBalance;
    }

    //method to withdraw
    public double withdraw (double amount){
        accountBalance -= amount;
        withdrawAmount.add(amount);
        return accountBalance;
    }

    public ArrayList<Double> getDepositAmount() {
        return depositAmount;
    }

    public ArrayList<Double> getWithdrawAmount() {
        return withdrawAmount;
    }
}