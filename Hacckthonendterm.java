class Account {
    private String name, accNo;
    private double balance;

    Account(String name, String accNo, double balance) {
        this.name = name.trim().toUpperCase();
        this.accNo = accNo;
        this.balance = balance;
    }

    void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited Rs. " + amt + " | Balance: Rs. " + balance);
    }

    void withdraw(double amt) {
        if (amt > balance)
            System.out.println("Withdraw Rs. " + amt + " | Insufficient Balance");
        else {
            balance -= amt;
            System.out.println("Withdrew Rs. " + amt + " | Balance: Rs. " + balance);
        }
    }

    void withdraw(double amt, String reason) {
        System.out.print(reason + ": ");
        withdraw(amt);
    }

    boolean verify(String n) {
        return name.equalsIgnoreCase(n.trim());
    }

    void show() {
        System.out.println(name + " | A/C " + accNo + " | Balance: Rs. " + balance);
    }
}

public class Hacckthonendterm {
    public static void main(String[] args) {
        Account acc = new Account("  ravi kumar ", "1234567890", 10000);
        acc.show();
        acc.deposit(5000);
        acc.withdraw(2000, "ATM Withdrawal");
        acc.withdraw(20000);
        acc.show();
        System.out.println(acc.verify("Ravi Kumar") ? "Names Match" : "Names Do Not Match");
    }
}