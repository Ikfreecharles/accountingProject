import java.util.ArrayList;

public class Summary{
    private double totalDeposit;
    private double totalWithdrawal;
    private Transaction transaction;

    public Summary(Transaction transaction) {
        this.transaction = transaction;
    }

    public double totalDeposit(){
        for(double getAmount: transaction.getDepositAmount()){
            totalDeposit += getAmount;
        }
        return totalDeposit;
    }

    public double totalWithdrawals(){
        for(double getAmount: transaction.getWithdrawAmount()){
            totalWithdrawal += getAmount;
        }
        return totalWithdrawal;
    }

    public void totalNumberOfDeposits(){
        int size = transaction.getDepositAmount().size();
        System.out.println("You have made " + size + " deposit.");
    }

    public void totalNumberOfWithdrawals(){
        int size = transaction.getWithdrawAmount().size();
        System.out.println("You have made " + size + " withdrawals.");
    }
}
