package FinalProject.BudgetManager;

import java.util.*;

public class PurchaseManager {
    private static Scanner scanner = new Scanner(System.in);
    private List<Purchase> allPurchases = new ArrayList<>();
    private List<Purchase> foodPurchases = new ArrayList<>();
    private List<Purchase> clothesPurchases = new ArrayList<>();
    private List<Purchase> entertainmentPurchases = new ArrayList<>();
    private List<Purchase> otherPurchases = new ArrayList<>();

    public List<Purchase> getAllPurchases() {
        return allPurchases;
    }

    public List<Purchase> getFoodPurchases() {
        return foodPurchases;
    }

    public List<Purchase> getClothesPurchases() {
        return clothesPurchases;
    }

    public List<Purchase> getEntertainmentPurchases() {
        return entertainmentPurchases;
    }

    public List<Purchase> getOtherPurchases() {
        return otherPurchases;
    }

    public void addIncome() {
        Wallet wallet = new Wallet();
        System.out.println("Enter income:");
        double income = Double.parseDouble(scanner.nextLine());
        wallet.addIncome(income);
        System.out.println("Income was added!");
    }

    private void addPurchase(String type, Purchase purchase) {
        allPurchases.add(purchase);
        switch (type) {
            case "Food" -> foodPurchases.add(purchase);
            case "Clothes" -> clothesPurchases.add(purchase);
            case "Entertainment" -> entertainmentPurchases.add(purchase);
            case "Other" -> otherPurchases.add(purchase);
        }
    }

    public void addPurchaseToCategory(Wallet wallet) {
        System.out.println("""
                Choose the type of purchase:
                1) Food
                2) Clothes
                3) Entertainment
                4) Other""");

        String type = switch (Integer.parseInt(scanner.nextLine())) {
            case 1 -> "Food";
            case 2 -> "Clothes";
            case 3 -> "Entertainment";
            case 4 -> "Other";
            default -> throw new IllegalArgumentException("Invalid purchase type");
        };

        System.out.println("Enter purchase name:");
        String name = scanner.nextLine();
        System.out.println("Enter its price:");
        double price = Double.parseDouble(scanner.nextLine().replace(",", "."));

        Purchase purchase = new Purchase(name, price);
        addPurchase(type, purchase);
        wallet.deductExpense(price);
        System.out.println("Purchase was added!");
    }

    public void showPurchases() {
        if (allPurchases.isEmpty()) {
            System.out.println("The purchase list is empty");
            return;
        }
        while (true) {
            System.out.println("""
                    Choose the type of purchase
                    1) Food
                    2) Clothes
                    3) Entertainment
                    4) Other
                    5) All
                    6) Back""");
            int action = Integer.parseInt(scanner.nextLine());
            switch (action) {
                case 1:
                    showListOfPurchases(foodPurchases, "Food");
                    break;
                case 2:
                    showListOfPurchases(clothesPurchases, "Clothes");
                    break;
                case 3:
                    showListOfPurchases(entertainmentPurchases, "Entertainment");
                    break;
                case 4:
                    showListOfPurchases(otherPurchases, "Other");
                    break;
                case 5:
                    showListOfPurchases(allPurchases, "All");
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    public void showListOfPurchases(List<Purchase> list, String listName) {
        System.out.println();
        if (!list.isEmpty()) {
            System.out.println(listName + ":");
            double total = 0.0;
            for (Purchase purchase : list) {
                System.out.println(purchase);
                total += purchase.getPrice();
            }
            System.out.printf("Total sum: $%.2f%n", total);
            System.out.println();
        } else {
            System.out.println(listName + ":");
            System.out.println("The purchase list is empty");
            System.out.println();
        }
    }

    public void analyzePurchases() {
        while (true) {
            System.out.println();
            System.out.println("""
                    How do you want to sort?
                    1) Sort all purchases
                    2) Sort by type
                    3) Sort certain type
                    4) Back""");
            int action = Integer.parseInt(scanner.nextLine());
            switch (action) {
                case 1:
                    sortAllPurchases();
                    break;
                case 2:
                    sortByType();
                    break;
                case 3:
                    sortCertainType();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void sortAllPurchases() {
        System.out.println();
        if (!allPurchases.isEmpty()) {
            List<Purchase> sortedPurchases = new ArrayList<>(allPurchases);
            sortedPurchases.sort((purchase1, purchase2) -> {
                double price1 = purchase1.getPrice();
                double price2 = purchase2.getPrice();
                return Double.compare(price2, price1);
            });
            System.out.println("All:");
            double total = 0.0;
            for (Purchase purchase : sortedPurchases) {
                System.out.println(purchase);
                total += purchase.getPrice();
            }
            System.out.printf("Total: $%.2f%n", total);
        } else {
            System.out.println("The purchase list is empty");
            System.out.println();
        }
    }

    private void sortByType() {
        Map<String, Double> typeTotals = new LinkedHashMap<>();
        typeTotals.put("FOOD", foodPurchases.stream().mapToDouble(Purchase::getPrice).sum());
        typeTotals.put("CLOTHES", clothesPurchases.stream().mapToDouble(Purchase::getPrice).sum());
        typeTotals.put("ENTERTAINMENT", entertainmentPurchases.stream().mapToDouble(Purchase::getPrice).sum());
        typeTotals.put("OTHER", otherPurchases.stream().mapToDouble(Purchase::getPrice).sum());

        typeTotals.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .forEach(entry -> System.out.printf("%s - $%.2f%n", entry.getKey(), entry.getValue()));
    }

    private void sortCertainType() {
        List<Purchase> purchases;
        System.out.println("""
                Choose the type of purchase
                1) Food
                2) Clothes
                3) Entertainment
                4) Other""");
        int action = Integer.parseInt(scanner.nextLine());
        switch (action) {
            case 1:
                purchases = foodPurchases;
                break;
            case 2:
                purchases = clothesPurchases;
                break;
            case 3:
                purchases = entertainmentPurchases;
                break;
            case 4:
                purchases = otherPurchases;
                break;
            default:
                System.out.println("Invalid type.");
                return;
        }

        purchases.sort(Comparator.comparingDouble(Purchase::getPrice).reversed());
        purchases.forEach(System.out::println);
    }
}
