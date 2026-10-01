# cs3354-assignment01
CS3354 Assignment 1 - Grocery Management System using Java and parallel arrays.

HOW IT WORKS:
  This program uses parallel arrays to store information about the same grocery items. In this project, we have 3 parallel arrays. These are for the item names, prices, and total stock.
  We used a menu system to prompt the user to choose an action. Viewing the inventory calls printInventory(), which  prints all items(including name, price, and stock) that are not null. Restocking Items asks the user for an item name and the amount to add. 
  The restockItem() method searches through the item name array for the matching item. If it is found, the given amount is added to the stock. If there is no match, the program prints "Item not found."

WHO DID WHAT:
  Pooja Tamang: Wrote the majority of the program.

  Ethan Charles Alcaraz: Created javadoc comments and generated the subsequent documentation.

  Garrett Mitchell: Wrote the README.md, UML diagram, and captured screenshots of the program running successfully.

  HOW TO RUN:
    The program should compile and run on any IDE that supports Java

  UML Class Diagram:
  ------------------------------------------------------------------------------------------
  |                                  GroceryManagement                                     |
  ------------------------------------------------------------------------------------------
  |  no attributes                                                                         |
  ------------------------------------------------------------------------------------------
  | + printInventory(names : String[], prices : double[], stocks : int[] ) : void          |
  |                                                                                        |
  |                                                                                        |  
  | + restockItem(names : String[], stocks : int[], target : String, amount : int ) : void |
  |                                                                                        |
  |                                                                                        |
  | + main(args : String[]) : void                                                         |
  |                                                                                        |
  ------------------------------------------------------------------------------------------
