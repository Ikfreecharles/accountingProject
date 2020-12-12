public class Transfer {
    private final double amount;
    private final String description;
    private final String time;

    public Transfer(double amount, String description, String time){
        this.amount = amount;
        this.description = description;
        this.time = time;
    }

    //GETTERS
    public double getAmount() { return amount; }

    public String getDescription() { return description; }

    public String getTime() { return time; }
}
