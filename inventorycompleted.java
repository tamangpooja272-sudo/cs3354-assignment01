import java.util.Scanner;

class inventorcompleted{
    public static void main(String[] args) {
        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];

        Scanner scanner = new Scanner(System.in);

        itemNames[0] = "Pop Tarts";
        itemPrices[0] = 5.99;
        itemStocks[0] = 25;

        itemNames[1] = "Cheerios";
        itemPrices[1] = 6.25;
        itemStocks[1] = 50;

        itemNames[2] = "Bananas";
        itemPrices[2] = 0.59;
        itemStocks[2] = 30;

        while (true) { 
            System.out.println("| Inventory Menu    |");
            System.out.println("| Options:          |");
            System.out.println("| 1. View Inventory |");
            System.out.println("| 2. Restock Item   |");
            System.out.println("| 3. Exit           |");

            System.out.println("Please Select an Option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    printInventory(itemNames, itemPrices, itemStocks);
                    break;
                case 2:
                    System.out.println("Enter Item Name: ");
                    String target = scanner.nextLine();

                    System.out.println("Enter Amount to Add: ");
                    int amount = scanner.nextInt();
                    restockItem(itemNames, itemStocks, target, amount);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice.");;
            }
        }

    }

    //Task 1: Invetory Display
    public static void printInventory(String[] names, double[] prices, int[] stocks){
        for (int i = 0; i < names.length; i++) {
            if(names[i] != null){
            System.out.println(names[i] + " || Price: " + prices[i] + " || Stock:" + stocks[i]);
            }
        }
    }

    //Task 2: Restock & Search
    public static void restockItem(String[] names, int[] stocks, String target, int amount){
        boolean found = false;
        for (int i = 0; i < names.length; i++){ 
            if(names[i] != null && names[i].equalsIgnoreCase(target)){
                stocks[i] += amount;
                found = true;

                System.out.println(target + "was restocked. New Amount: " + stocks[i]);
                break;
            }

            if(!found){
                System.out.println("Item not found.");
            }
        }
    }

    //Tast 3: The User Menu
    


    
}