public class Main {
    //We have the main class here.
    public static void main(String[] args) {
        User omran = new User("Omran", "Rashidy","DE39847732992838", 5000);
        Transaction customer = new Transaction();
        customer.deposit(50);
        customer.deposit(100);
        customer.deposit(200);
        customer.withdraw(25);

        Summary myTransactions = new Summary(customer);
        System.out.println(myTransactions.totalDeposit());
        System.out.println(myTransactions.totalWithdrawals());
        myTransactions.totalNumberOfDeposits();
        myTransactions.totalNumberOfWithdrawals();
    }
}
