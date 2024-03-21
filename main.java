    // import java.io.*;
    // import java.util.Scanner;

    // public class main{

    //     private static final Inventory Location = null;
    //     public static Scanner scanner = new Scanner (System.in);
    //         static Inventory locker = new Inventory();
    //         static Inventory backPack = new Inventory();
    //         static Inventory pencilcase = new Inventory();
    //     public static void main(String[] args){
            
    //         //Scanner scanner = new Scanner(System.in);

    //         System.out.println("Welcome to my BackPack Assignment!");
    //         locker.loading("locker.txt");
    //         backPack.loading("pencilcase.txt");
    //         pencilcase.loading("backpack.txt");

    //         while(true){
    //         System.out.println("Where would you like to go?\nLocker (1) \nPencil Case (2) \nBack Pack (3) \nExit (4)");
    //         int todo = scanner.nextInt();
    //         scanner.nextLine();
    //         //int todo = getUserInput();

    //         switch(todo){

    //         case 1:
    //             manager(locker); // before was manager(locker/backPack/pencilcase);
    //             break;
    //         case 2: 
    //             manager(backPack);
    //             break;
    //         case 3:
    //             manager(pencilcase);
    //             break;
    //         case 4:
    //             System.out.println("Exiting program...");
    //             // locker.storing("locker.txt");
    //             // backPack.storing("pencilcase.txt");
    //             // pencilcase.storing("backpack.txt");
    //             System.exit(0); // Exiting the program
    //             break;

    //         default:
    //             System.out.println("Invalid option, please try again.");
    //         //break; may be used if needed        
    //         }
                
    //         }
    
    //     }

    //     // private static int getUserInput() {
    //     //     int todo = 0;
    //     //     try {
    //     //         todo = scanner.nextInt();
    //     //         scanner.nextLine(); // Consume newline
    //     //     } catch (Exception e) {
    //     //         System.out.println("Invalid input. Please enter a number.");
    //     //         scanner.nextLine(); // Clear the invalid input from scanner
    //     //     }
    //     //     return todo;
    //     // }

    //     private static void manager(Inventory inventory){ // instead of (Inventory locker) {
    //         // TODO Auto-generated method stubb
    //         //throw new UnsupportedOperationException("Unimplemented method 'manager'");
    //         //main mainInstance = new main(Location); // Creating an instance of Main to invoke the constructor
    //         //currentInventory.displayItems();
    //         System.out.println("Items in Inventory ");
    // for (Item item : currentInventory.getItems()) {
    //     System.out.println(item.getItemName());
        
    //         System.out.println("What would you like to do?\n1. Move Item\n2. Remove Item\n3. Add Item\n4. Quit");
    //         int todo2 = scanner.nextInt();
    //         scanner.nextLine();
    //     //}

    //     // public main(Inventory location){


    //     //     Object Scanner;
    //     //     displayItems(scanner);
    //     //     System.out.println("what would you like to do?\n moveitem (1) \n remove item (2)\n additem (3)\n quit (4)");
    //     //     int todo2 = scanner.nextInt();
            
        
    //     //     // if(!todo.isnumeric){
    //     //     //     System.out.println("Invalid.");
    //     //     //        }
    //     //     // break;
        
    //     //     scanner.nextLine(); // Consume newline

    //         switch(todo2){
    //             case 1:
    //                 System.out.println("What item would you like to move?");
    //                 String itemToMove = scanner.nextLine();
    //                 System.out.println("Where to move it? (1 for Locker, 2 for Backpack, 3 for Pencil Case)");
    //                 int destination = scanner.nextInt();
    //                 // instead of String destinationItem = scanner.nextLine();
    //                 scanner.nextLine();

    //                 Inventory destinationInventory = null;
    //                 switch (destination) {
    //                     case 1:
    //                         destinationInventory = locker;
    //                         break;
    //                     case 2:
    //                         destinationInventory = backPack;
    //                         break;
    //                     case 3:
    //                         destinationInventory = pencilcase;
    //                         break;
    //                     default:
    //                         System.out.println("Invalid destination.");
    //                         return;
    //                 }

    //                 if (currentInventory.containsItem(itemToMove)) {
    //                     destinationInventory.moveItem(itemToMove, destinationInventory);
    //                     System.out.println("Item has been moved to " + destinationInventory.getClass().getSimpleName());
    //                 } else {
    //                     System.out.println("Invalid item.");
    //                 }
    //                 break;
    //             case 2:
    //                 System.out.println("what item would you like to remove ?");
    //                 String removeitem = scanner.nextLine();
    //                 currentInventory.removeItem(removeitem); //instead of Inventory.removeItem(removeitem);
    //                 System.out.println( removeitem + "has been removed.");
    //                 break;
    //             case 3:
    //             System.out.println("what item would you like to add ?");
    //             String addItem = scanner.nextLine();
    //             currentInventory.addItem(new Item(addItem)); // new line
    //             //Inventory.removeItem(additem);
    //             System.out.println(addItem + " has been added.");
    //             break;
    //             case 4:
    //                 System.out.println("exiting");
    //                 System.exit(0); // Exiting the program
    //                 break;

    //             default:
    //                 System.out.println("invaild");
    //                 break;

    //         }
    //     }
            
    //         // ask move item, rdisplay items at locationemove item, add item
    //         // scanner for asking
    //         // switch cases
    //         // case 1 moving item, what item to move and where to move it 
    //         //Inventory.moveItem(scanner destination);
    //         // print item has been moved to destination
    //         // case 2: what item to remove
    //         //Inventory.removeItem(scanner)
    //         // print item has been removed
    //         //case 3: whats the name of the item
    //         // Inventory.addItem(item);
    //         // print item has been added to current location
    //         // case 4: go back  break;
    //         // case default: print Invalid try again continue;

    //     }
        
    //     private static void Main() {
    //         // TODO Auto-generated method stub
    //         throw new UnsupportedOperationException("Unimplemented method 'Main'");
    //     }

    //     public void displayItems(Object scanner){

    //     }

    // }


//     import java.io.BufferedReader;
// import java.io.FileReader;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.io.PrintWriter;
// import java.util.ArrayList;
import java.util.Scanner;

public class main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Inventory locker = new Inventory();
        Inventory backpack = new Inventory();
        Inventory pencilcase = new Inventory();

        System.out.println("Welcome to my Backpack Assignment!");
        locker.loading("locker.txt");
        backpack.loading("backpack.txt");
        pencilcase.loading("pencilcase.txt");

        while (true) {
            System.out.println("Where would you like to go?");
            System.out.println("Locker (1)\nBackpack (2)\nPencil Case (3)\nExit (4)");
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
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
                    break;
            }
        }
    }

    private static void manager(Inventory inventory) {
        System.out.println("Items in Selected Inventory:");
        for (Item item : inventory.getItems()) {
            System.out.println(item.getItemName());
        }
        System.out.println("What would you like to do?\n1. Move Item\n2. Remove Item\n3. Add Item\n4. Quit");
        int todo2 = scanner.nextInt();
        scanner.nextLine();

        switch (todo2) {
            case 1:
                System.out.println("What item would you like to move?");
                String itemToMove = scanner.nextLine();
                System.out.println("Where to move it?");
                String destinationItem = scanner.nextLine();
                inventory.moveItem(itemToMove, destinationItem);
                //update txt files
                break;
                // Assuming moveItem and containsItem methods are implemented in Inventory
                // inventory.moveItem(itemToMove, destinationItem);

            case 2:
                System.out.println("What item would you like to remove?");
                String removeItem = scanner.nextLine();
                inventory.removeItem(removeItem);
                System.out.println(removeItem + " has been removed.");
                break;
            case 3:
                System.out.println("What item would you like to add?");
                String addItem = scanner.nextLine();
                inventory.addItem(new Item(addItem));
                System.out.println(addItem + " has been added.");
                break;
            case 4:
                System.out.println("Exiting");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}

// class Inventory {
//     private ArrayList<Item> inventory = new ArrayList<>();

//     public void addItem(Item item) {
//         inventory.add(item);
//     }

//     public void removeItem(String itemName) {
//         Item itemToRemove = null;
//         for (Item item : inventory) {
//             if (item.getItemName().equalsIgnoreCase(itemName)) {
//                 itemToRemove = item;
//                 break;
//             }
//         }
//         if (itemToRemove != null) {
//             inventory.remove(itemToRemove);
//         } else {
//             System.out.println("Item not found in inventory.");
//         }
//     }

//     public void moveItem(String itemName, String destinationInventoryName) {
//         Inventory destinationInventory = findInventoryByName(destinationInventoryName);
//         if (destinationInventory != null) {
//             Item itemToMove = null;
//             for (Item item : inventory) {
//                 if (item.getItemName().equalsIgnoreCase(itemName)) {
//                     itemToMove = item;
//                     break;
//                 }
//             }
//             if (itemToMove != null) {
//                 destinationInventory.addItem(itemToMove);
//                 inventory.remove(itemToMove);
//                 System.out.println("Item has been moved to " + destinationInventoryName);
//             } else {
//                 System.out.println("Item not found in inventory.");
//             }
//         } else {
//             System.out.println("Destination inventory not found.");
//         }
//     }

//     public ArrayList<Item> getItems() {
//         return inventory;
//     }

//     public void loading(String filename) {
//         try (BufferedReader file = new BufferedReader(new FileReader(filename))) {
//             String line = file.readLine();
//             while (line != null) {
//                 inventory.add(new Item(line));
//                 line = file.readLine();
//             }
//         } catch (IOException e) {
//             System.out.println(e.getMessage());
//         }
//     }

//     private Inventory findInventoryByName(String name) {
//         switch (name.toLowerCase()) {
//             case "locker":
//                 return new Inventory();
//             case "backpack":
//                 return new Inventory();
//             case "pencil case":
//                 return new Inventory();
//             default:
//                 return null;
//         }
//     }


    