package FinalProject.BudgetManager;

public class Purchase {
    private String name;
    private double price;

    public Purchase(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " $" + String.format("%.2f", price);
    }
}

