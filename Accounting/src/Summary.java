import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Summary{
    private double totalDeposit;
    private double totalWithdrawal;
    private Transaction transaction;

    // Constructor

    public Summary(Transaction transaction) {
        this.transaction = transaction;
    }

    // it returns the total of deposits.
    public double totalDeposit(){
        for(double getAmount: transaction.getDepositAmount()){
            totalDeposit += getAmount;
        }
        return totalDeposit;
    }
    // it returns the total of Withdrawals.
    public double totalWithdrawals(){
        for(double getAmount: transaction.getWithdrawAmount()){
            totalWithdrawal += getAmount;
        }
        return totalWithdrawal;
    }
    // it shows the number of deposits.
    public void totalNumberOfDeposits(){
        int size = transaction.getDepositAmount().size();
        System.out.println("You have made " + size + " deposit.");
    }
    // it shows the number of withdrawals.
    public void totalNumberOfWithdrawals(){
        int size = transaction.getWithdrawAmount().size();
        System.out.println("You have made " + size + " withdrawals.");
    }
    public void getTransferOut () {
        System.out.println("the summary of transfer out is " );
        for (Map.Entry<String, Double> entry : transaction.getTransferOut().entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}