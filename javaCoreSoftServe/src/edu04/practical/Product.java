package edu04.practical;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public static void main(String[] args) {
        Product product = new Product("laptop", 3000, 50);
        Product product1 = new Product("phone", 350, 7);
        Product product2 = new Product("cable", 10, 40);
        Product product3 = new Product("charger", 90, 40);
        Object[] products = {product, product1, product2, product3};
        double cheapest = Double.MAX_VALUE;
        double biggestQuantity = Double.MIN_VALUE;
        String nameExpensive = null;
        String nameQuantity = null;
        int quantity = 0;
        for (Object o : products) {
            Product p = (Product) o;
            if (cheapest > p.getPrice()) {
                cheapest = p.getPrice();
                nameExpensive = p.getName();
                quantity = p.getQuantity();
            }
            if (biggestQuantity < p.getQuantity()) {
                biggestQuantity = p.getQuantity();
                nameQuantity = p.getName();
            }
        }
        System.out.println("name and quantity of the cheapest product are: " + nameExpensive + ", " + quantity);
        System.out.println("name of the items, which has the biggest quantity: " + nameQuantity);
    }
}
