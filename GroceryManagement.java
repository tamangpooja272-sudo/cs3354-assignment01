import java.util.Scanner;
/**
 * A grocery management program that stores item names, prices, and
 * stock amounts in three parallel arrays, where the same index in each
 * array refers to the same item. A menu lets the user view the
 * inventory, restock an item, or exit.
 *
 * @author Pooja Tamang, Garett Mitchell, Ethan Alcaraz
 * @version 1.0
 */
public class GroceryManagement {

    /**
     * Displays all grocery items that are currently stored.
     *
     * @param names  the names of the grocery items
     * @param prices the prices of the grocery items
     * @param stocks the amount of each item in stock
     */
    public static void printInventory(
            String[] names, double[] prices, int[] stocks) {

        // Go through every position in the arrays.
        for (int i = 0; i < names.length; i++) {

            // Only display positions that contain an item.
            if (names[i] != null) {
                System.out.println(
                        names[i] + " - $" + prices[i]
                        + " - Stock: " + stocks[i]);
            }
        }
    }
    /**
 * Searches for an item and adds more stock to it.
 *
 * @param names the names of the grocery items
 * @param stocks the stock amounts
 * @param target the item to restock
 * @param amount the amount of stock to add
 */
public static void restockItem(
        String[] names, int[] stocks, String target, int amount) {

    // Check each position in the array.
    for (int i = 0; i < names.length; i++) {

        // Check if the item exists and matches the target.
        if (names[i] != null && names[i].equals(target)) {

            // Add the new amount to the current stock.
            stocks[i] = stocks[i] + amount;

            // Show the updated stock.
            System.out.println(
                    target + " restocked. New stock: " + stocks[i]);

            // Stop after finding the item.
            return;
        }
    }

    // This message appears if the item was not found.
    System.out.println("Item not found.");
}

    /**
     * Starts the grocery management program. Sets up the parallel arrays
     * with sample items, then repeatedly shows a menu: 1 to view the
     * inventory, 2 to restock an item, or 3 to exit.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        // Parallel arrays store information about the same grocery items.
        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];

        // Sample grocery items for testing.
        itemNames[0] = "Apple";
        itemPrices[0] = 1.50;
        itemStocks[0] = 10;

        itemNames[1] = "Milk";
        itemPrices[1] = 3.50;
        itemStocks[1] = 5;

        itemNames[2] = "Bread";
        itemPrices[2] = 2.50;
        itemStocks[2] = 8;

       Scanner scanner = new Scanner(System.in);

    while (true) {

        System.out.println("\nInventory Menu");
        System.out.println("1. View Inventory");
        System.out.println("2. Restock Item");
        System.out.println("3. Exit");
        System.out.print("Please select an option: ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {

            printInventory(itemNames, itemPrices, itemStocks);

        } else if (choice == 2) {

            System.out.print("Enter item name: ");
            String target = scanner.nextLine();

            System.out.print("Enter amount to add: ");
            int amount = scanner.nextInt();
            scanner.nextLine();

            restockItem(itemNames, itemStocks, target, amount);

        } else if (choice == 3) {

            System.out.println("Bye Bye!");
            break;

        } else {

            System.out.println("Invalid option.");
        }
    }

    scanner.close();
}
}
