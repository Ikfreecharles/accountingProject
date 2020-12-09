import java.util.Scanner;
public class Activity {

    private Transaction transaction;
    private Summary summary;

    public Activity() {
    }

    // we need a method to let the user to select an activity. 1-> for deposit 2-> for withdrawals 3-> for summary

    public void select(){
        transaction = new Transaction();
        summary = new Summary(transaction);
        Scanner input = new Scanner(System.in);
        boolean isTrue = false;

        while ( !isTrue){
            System.out.println("please choose an operation! 1-> deposit 2-> withdrawals 3-> summary 4-> transfer");
            int option = input.nextInt();
            if (option== 1){
                System.out.println("how much would you like to deposit?");
                double amount = input.nextDouble();
                transaction.deposit(amount);
            } else if (option== 2 ){
                System.out.println("how much money would you like to withdraw?");
                double amount = input.nextDouble();
                if(amount<=transaction.getAccountBalance()){
                    transaction.withdraw(amount);
                } else {
                    System.out.println("You have insufficient balance." +transaction.getAccountBalance());
                }
            } else if (option==3){
                System.out.println("please choose an operation! 1-> deposit summary 2 -> withdrawal summary 3 -> account balance 4-> transfer out summary");
                int select = input.nextInt();
                if (select==1){
                    summary.totalDeposit();
                    summary.totalNumberOfDeposits();
                }else if (select==2){
                    summary.totalWithdrawals();
                    summary.totalNumberOfWithdrawals();
                } else if (select==3) {
                    System.out.println("Your account balance is " + transaction.getAccountBalance());

                } else if (select==4){
                    summary.getTransferOut();
                } else {
                    System.out.println("Invalid option");
                }
            } else if(option==4){
                System.out.println("How much would like to transfer?");
                double amount = input.nextDouble();
                input.nextLine();
                System.out.println("please enter your description");
                String description = input.nextLine();
                if(amount<=transaction.getAccountBalance()) {
                    transaction.transferOut(description,amount);
                } else {
                    System.out.println("You have insufficient balance." + transaction.getAccountBalance());
                }
            } else {
                System.out.println("Invalid option,try again.");
            }
            System.out.println("Would you like to perform an operation or exit?  1-> Continue 2-> Exit");
            int select =input.nextInt();
            if (select==1){

            }else if (select==2){
                isTrue= true;
            }
        }
    }
}