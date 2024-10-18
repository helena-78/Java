package FinalProject.BudgetManager;

import java.io.*;
import java.util.*;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Wallet wallet = new Wallet();
    private static final PurchaseManager purchaseManager = new PurchaseManager();
    private static final FileManager fileManager = new FileManager();

    public static void main(String[] args) throws IOException {
        while (true) {
            System.out.println("""
                    Choose your action:
                    1) Add income
                    2) Add purchase
                    3) Show list of purchases
                    4) Balance
                    5) Save
                    6) Load
                    7) Analyze (Sort)
                    0) Exit""");

            int action = Integer.parseInt(scanner.nextLine());
            switch (action) {
                case 1 -> purchaseManager.addIncome();
                case 2 -> purchaseManager.addPurchaseToCategory(wallet);
                case 3 -> purchaseManager.showPurchases();
                case 4 -> wallet.showBalance();
                case 5 -> fileManager.savePurchases(purchaseManager, wallet);
                case 6 -> fileManager.loadPurchases(purchaseManager, wallet);
                case 7 -> purchaseManager.analyzePurchases();
                case 0 -> {
                    System.out.println("Bye!");
                    return;
                }
                default -> System.out.println("Invalid option.");
            }
        }
    }
}
