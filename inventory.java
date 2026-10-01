import java.util.Scanner;

class inventory{
    public static void main(String[] args) {
        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];

        Scanner scanner = new Scanner(System.in);

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
                    System.out.println("placeholder2");
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
            System.out.println(names[i] + "|| Price: " + prices[i] + "|| Stock:" + stocks[i]);
        }
    }

    //Task 2: Restock & Search
    public static void restockItem(String[] names, int[] stocks, String target, int amount){

    }

    //Tast 3: The User Menu
    


    
}