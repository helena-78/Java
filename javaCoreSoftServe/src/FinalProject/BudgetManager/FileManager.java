package FinalProject.BudgetManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

public class FileManager {
    public void savePurchases(PurchaseManager purchaseManager, Wallet wallet) throws IOException {
        File file = new File("purchases.txt");
        try (PrintWriter printWriter = new PrintWriter(file)) {
            if (!purchaseManager.getFoodPurchases().isEmpty()) {
                printWriter.println("FOOD");
                for (Purchase purchase : purchaseManager.getFoodPurchases()) {
                    printWriter.println(purchase);
                }
            }
            if (!purchaseManager.getClothesPurchases().isEmpty()) {
                printWriter.println("CLOTHES");
                for (Purchase purchase : purchaseManager.getClothesPurchases()) {
                    printWriter.println(purchase);
                }
            }
            if (!purchaseManager.getEntertainmentPurchases().isEmpty()) {
                printWriter.println("ENTERTAINMENT");
                for (Purchase purchase : purchaseManager.getEntertainmentPurchases()) {
                    printWriter.println(purchase);
                }
            }
            if (!purchaseManager.getOtherPurchases().isEmpty()) {
                printWriter.println("OTHER");
                for (Purchase purchase : purchaseManager.getOtherPurchases()) {
                    printWriter.println(purchase);
                }
            }
            printWriter.printf("BALANCE $%.2f%n", wallet.getBalance());

            System.out.println();
            System.out.println("Purchases were saved!");
        }
    }

    public void loadPurchases(PurchaseManager purchaseManager, Wallet wallet) throws FileNotFoundException {
        File file = new File("purchases.txt");
        if (!file.exists()) {
            System.out.println("No file found");
            return;
        }

        try (Scanner scanner = new Scanner(file)) {
            List<Purchase> currentList = null;
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                switch (line) {
                    case "FOOD" -> currentList = purchaseManager.getFoodPurchases();
                    case "CLOTHES" -> currentList = purchaseManager.getClothesPurchases();
                    case "ENTERTAINMENT" -> currentList = purchaseManager.getEntertainmentPurchases();
                    case "OTHER" -> currentList = purchaseManager.getOtherPurchases();
                    case "BALANCE" -> {
                        if (scanner.hasNextLine()) {
                            String balanceLine = scanner.nextLine().trim();
                            balanceLine = balanceLine.replaceAll("[^\\d.]", "");
                            double balance = Double.parseDouble(balanceLine);
                            wallet.setBalance(balance);
                        }
                    }
                    default -> {
                        if (currentList != null) {
                            int dollarSign = line.lastIndexOf(" $");
                            if (dollarSign != -1) {
                                String name = line.substring(0, dollarSign).trim();
                                String priceString = line.substring(dollarSign + 2).replace(",", ".");
                                double price = Double.parseDouble(priceString);
                                Purchase purchase = new Purchase(name, price);
                                currentList.add(purchase);
                                purchaseManager.getAllPurchases().add(purchase);
                            }
                        }
                    }
                }
            }
            System.out.println();
            System.out.println("Purchases were loaded!");
        }
    }
}