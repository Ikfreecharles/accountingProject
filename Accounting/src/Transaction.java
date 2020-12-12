import java.util.ArrayList;

public class Transaction  {
    private double accountBalance;
    private final ArrayList<Double> depositAmount = new ArrayList<>();
    private final ArrayList<Double> withdrawAmount = new ArrayList<>();
    private final ArrayList<Transfer> transferOutNew = new ArrayList<>();


    public Transaction() {
    }

    //Getters

    public ArrayList<Double> getDepositAmount() {
        return depositAmount;
    }

    public ArrayList<Double> getWithdrawAmount() {
        return withdrawAmount;
    }

    public double getAccountBalance (){
        return accountBalance;
    }

    public ArrayList<Transfer> getTransferOutNew() { return transferOutNew; }

    //METHODS

    //method to deposit
    public void deposit (double amount){
        accountBalance += amount;
        depositAmount.add(amount);
    }

    //method to withdraw
    public void withdraw (double amount){
        accountBalance -= amount;
        withdrawAmount.add(amount);
    }
    public void transferOut(Transfer transfer){
        transferOutNew.add(transfer);
        accountBalance -= transfer.getAmount();
    }
}