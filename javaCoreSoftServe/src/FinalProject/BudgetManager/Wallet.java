package FinalProject.BudgetManager;

public class Wallet {
    private double balance = 0.0;

    public void addIncome(double income) {
        balance += income;
    }

    public void deductExpense(double expense) {
        balance -= expense;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void showBalance() {
        System.out.printf("Balance: $%.2f%n", getBalance());
    }
}
