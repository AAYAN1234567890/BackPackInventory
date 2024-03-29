// BackPack Inventory Assignment



/*

 * Title: Main Class

 * Author: Aayan Samdani

 * Date: March 24, 2024

 */

// Abstraction: The main class hides the complex details of managing inventories from the user. 
// It offers a simple and easy-to-use interface for handling items in various inventories.

// Aggregation: The main class brings together instances of the Inventory class (locker, backpack, and pencilcase) to handle multiple inventories effectively in the program.

// Encapsulation: The main class encapsulates inventory management functionalities. 
// It contains methods like manager() to handle interactions with inventories. 
// Similarly, Inventory objects encapsulate inventory management behavior 
// through methods like addItem(), removeItem(), moveItem(), loading(), and updating().



// BackPack Inventory Assignment

/*

 * Title: Main Class

 * Author: Aayan Samdani

 * Date: March 24, 2024

 */


 import java.util.Scanner;

 public class main {
     // IPO: No specific input or output for this class
     
     // Getter and Setter: No specific getters or setters in this class
 
     private static final Scanner scanner = new Scanner(System.in);
     static Inventory locker = new Inventory("Locker");
     static Inventory backpack = new Inventory("Backpack");
     static Inventory pencilcase = new Inventory("Pencilcase");
 
     public static void main(String[] args) {
 
         System.out.println("Welcome to my Backpack Assignment!\n");
         locker.loading("locker.txt");
         backpack.loading("backpack.txt");
         pencilcase.loading("pencilcase.txt");
 
         while (true) {
             System.out.println("Where would you like to go?\n-----");
             System.out.println(" (1) Locker \n (2) Backpack \n (3) Pencil Case \n (4) Exit ");
             int todo = scanner.nextInt();
             scanner.nextLine();
 
             switch (todo) {
                 case 1:
                     manager(locker);
                     break;
                 case 2:
                     manager(backpack);
                     break;
                 case 3:
                     manager(pencilcase);
                     break;
                 case 4:
                     System.out.println("\n Saving and Exiting program...");
                     locker.updating("locker.txt");
                     backpack.updating("backpack.txt");
                     pencilcase.updating("pencilcase.txt");
                     System.exit(0);
 
                     break;
                 default:
                     System.out.println("\nInvalid option, please try again.");
                     break;
             }
         }
     }
 
     private static void manager(Inventory inventory) {
         // IPO:
         // Input: User input for managing items in the selected inventory.
         // Process: Managing inventory items based on user input.
         // Output: Displaying inventory items and messages to the console.
 
         // Getter and Setter: No specific getters or setters in this method
 
         System.out.println("Items in Selected Inventory:\n-----");
         for (Item item : inventory.getItems()) {
             System.out.println("~ " + item.getItemName());
         }
         System.out.println("\nWhat would you like to do?\n-----\n1. Move Item\n2. Remove Item\n3. Add Item\n4. Quit");
         int todo2 = scanner.nextInt();
         scanner.nextLine();
 
         switch (todo2) {
             case 1:
                 System.out.println("What item would you like to move?");
                 String itemToMove = scanner.nextLine();
                 System.out.println("Where to move it?");
                 String destinationItem = scanner.nextLine();
                 Inventory destination = null;
                 switch (destinationItem) {
                     case "backpack":
                         destination = backpack;
                         break;
                     case "locker":
                         destination = locker;
                         break;
                     case "pencil case":
                         destination = pencilcase;
                         break;
 
                     default:
                         break;
                 }
                 inventory.moveItem(itemToMove, destination);
                 break;
 
             case 2:
                 System.out.println("What item would you like to remove?");
                 String removeItem = scanner.nextLine();
                 inventory.removeItem(removeItem);
                 System.out.println("\n" + removeItem + " has been removed.");
                 break;
             case 3:
                 System.out.println("What item would you like to add?");
                 String addItem = scanner.nextLine();
                 inventory.addItem(new Item(addItem));
                 System.out.println("\n" + addItem + " has been added.");
                 break;
             case 4:
             System.out.println("\nSaving and Exiting program...");
             locker.updating("locker.txt");
             backpack.updating("backpack.txt");
             pencilcase.updating("pencilcase.txt");
             break;
             default:
                 System.out.println("Invalid choice");
                 break;
         }
     }
 }
 