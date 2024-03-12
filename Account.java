
public class Account {
    private String id;
    private String name;
    private double balance;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    public String getId() { return id;}

    public String getName() {return name;}

    public double getBalance() {return balance;}

    public void credit(double amount) {balance += amount;}

    public void debit(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
    }

    public static void main(String[] args) {
        Account account1 = new Account("A101", "Tan Ah Teck");
        System.out.println("ID: " + account1.getId());
        System.out.println("Name: " + account1.getName());
        System.out.println("Balance: " + account1.getBalance());

        account1.credit(100);
        account1.debit(200);
    }
}