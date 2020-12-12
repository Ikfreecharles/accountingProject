public class Summary{
    private double totalDeposit;
    private double totalWithdrawal;
    private final Transaction transaction;

    // Constructor

    public Summary(Transaction transaction) {
        this.transaction = transaction;
    }

    // it returns the total of deposits.
    public void totalDeposit(){
        for(double getAmount: transaction.getDepositAmount()){
            totalDeposit += getAmount;
        }
        System.out.println("Your total deposit is: €" + totalDeposit);
    }
    // it returns the total of Withdrawals.
    public void totalWithdrawals(){
        for(double getAmount: transaction.getWithdrawAmount()){
            totalWithdrawal += getAmount;
        }
        System.out.println("Your total withdrawal is: €" + totalWithdrawal);
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
        for (int i = 0; i < transaction.getTransferOutNew().size(); i++){
            Transfer transfer = transaction.getTransferOutNew().get(i);
            System.out.println("Amount: €" + transfer.getAmount() + " Description: " + transfer.getDescription() + " Date and Time: " + transfer.getTime());
        }
    }
}