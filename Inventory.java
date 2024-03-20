// // import java.io.BufferedReader;
// // import java.io.FileReader;
// // import java.io.FileWriter;
// // import java.io.IOException;
// // import java.util.ArrayList;
// // import java.io.PrintWriter;
// import java.io.*;
// import java.util.ArrayList;

// public class Inventory {

//     //public static String getItems;
//     //private String Inventory.inventory();
//     private ArrayList<Item> inventory = new ArrayList<>();
//     private String inventory1;

//     String filename;// = "inventory.txt"; --> // Assuming filename is a class member
    
//     public Inventory(){
//         this.inventory = inventory;

//     }
    
//     public void addItem(Item item){
//         inventory.add(item);

//     }

//     public void removeItem(String removeitem){
//         inventory.remove(removeitem);
//         // ???inventory.removeIf(item -> item.getItemName().equalsIgnoreCase(itemName));???
//     }

//     //new
//     public boolean containsitem(String itemName) {
//         for (Item item : inventory) {
//             if (item.getItemName().equalsIgnoreCase(itemName)) {
//                 return true;
//             }
//         }
//         return false;
//     }

//     public void moveItem(String itemName, Inventory destinationInventory){// instead of Object destinationItem, Object destinationItem2){
//         for (Item item : inventory) {
//             if (item.getItemName().equalsIgnoreCase(itemName)) {
//                 destinationInventory.addItem(item);
//                 inventory.remove(item);
//                 return;
//             }
//         }
//     }

//     public void storing() {
//         // Writing items from the inventory to a text file
//         // if (inventory != null) { // Null check
//         //     try (PrintWriter file = new PrintWriter(new FileWriter(filename))) {
//         //         for (Item item : inventory) {
//         //             file.println(item.getItemName()); // Assuming there's a method to get the item name
//         //         }
//         //     } catch (IOException ex) {
//         //         // Better handling of exceptions, logging or displaying appropriate message
//         //         ex.printStackTrace();
//         //     }
//         // } else {
//         //     System.out.println("Inventory is null."); // Handling null inventory
//         // }
//         try (PrintWriter file = new PrintWriter(new FileWriter(filename))) {
//             for (Item item : inventory) {
//                 file.println(item.getItemName());
//             }
//         } catch (IOException ex) {
//             ex.printStackTrace();
//         }
//     }//end saveStringArray to a text file  
        

//     public void loading(String filename) {
//         // ArrayList<String> temp = new ArrayList<>();
//         // try (BufferedReader file = new BufferedReader(new FileReader(filename))) {
//         //     String line = file.readLine(); // Read the first line
//         //     while (line != null) {
//         //         temp.add(line);
//         //         line = file.readLine(); // Read the next line
//         //     }
//         // } catch (IOException e) {
//         //     System.out.println(e);
//         // }
//         this.filename = filename;
//         try (BufferedReader file = new BufferedReader(new FileReader(filename))) {
//             String line = file.readLine();
//             while (line != null) {
//                 inventory.add(new Item(line));
//                 line = file.readLine();
//             }
//         } catch (IOException e) {
//             System.out.println(e);
//         }
//     }
    
//     public ArrayList<Item> inventoryName(){
//         return inventory;
//     }    
    
//     // getter below
//     public ArrayList<Item> getItem(){
//         return inventory;
//     }

//     public void removeItem(String removeitem) {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'removeItem'");
//     }

//     public static boolean containsItem(String itemtomove) {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'containsItem'");
//     }

//     public static void moveItem(String itemtomove, Object destinationItem) {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'moveItem'");
//     }

//     public void displayItems() {
//         // TODO Auto-generated method stub
//         //throw new UnsupportedOperationException("Unimplemented method 'displayItems'");
//         System.out.println("Items in Inventory (" + filename + "):");
//         for (Item item : inventory) {
//             System.out.println(item.getItemName());
//         }
//     }

//     public static boolean containsItem(String itemToMove) {
//        //make this 
//     }

//     public String getItems() {
//         return inventory1;
//     }


// }

import java.io.BufferedReader;
import java.io.FileReader;
//import java.io.FileWriter;
import java.io.IOException;
//import java.io.PrintWriter;
import java.util.ArrayList;

public class Inventory {
    // private ArrayList<Item> items = new ArrayList<>();

    // public void addItem(Item item) {
    //     items.add(item);
    // }

    // public void removeItem(Item item) {
    //     items.remove(item);
    // }

    // public boolean containsItem(String itemName) {
    //     for (Item item : items) {
    //         if (item.getItemName().equalsIgnoreCase(itemName)) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    // public void moveItem(Item item, Inventory destinationInventory) {
    //     if (items.contains(item)) {
    //         items.remove(item);
    //         destinationInventory.addItem(item);
    //     }
    // }

    // public void storing(String filename) {
    //     try (PrintWriter file = new PrintWriter(new FileWriter(filename))) {
    //         for (Item item : items) {
    //             file.println(item.getItemName());
    //         }
    //     } catch (IOException ex) {
    //         ex.printStackTrace();
    //     }
    // }

    // public void loading(String filename) {
    //     try (BufferedReader file = new BufferedReader(new FileReader(filename))) {
    //         String line = file.readLine();
    //         while (line != null) {
    //             items.add(new Item(line));
    //             line = file.readLine();
    //         }
    //     } catch (IOException e) {
    //         e.printStackTrace();
    //     }
    // }

    // public ArrayList<Item> getItems() {
    //     return items;
    // }

    // public void addLocation(String locker) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'addLocation'");
    // }

    private ArrayList<Item> inventory = new ArrayList<>();

    public void addItem(Item item) {
        inventory.add(item);
    }

    public void removeItem(String itemName) {
        Item itemToRemove = null;
        for (Item item : inventory) {
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                itemToRemove = item;
                break;
            }
        }
        if (itemToRemove != null) {
            inventory.remove(itemToRemove);
        } else {
            System.out.println("Item not found in inventory.");
        }
    }

    public void moveItem(String itemName, String destinationInventoryName) {
        Inventory destinationInventory = findInventoryByName(destinationInventoryName);
        if (destinationInventory != null) {
            Item itemToMove = null;
            for (Item item : inventory) {
                if (item.getItemName().equalsIgnoreCase(itemName)) {
                    itemToMove = item;
                    break;
                }
            }
            if (itemToMove != null) {
                destinationInventory.addItem(itemToMove);
                inventory.remove(itemToMove);
                System.out.println("Item has been moved to " + destinationInventoryName);
            } else {
                System.out.println("Item not found in inventory.");
            }
        } else {
            System.out.println("Destination inventory not found.");
        }
    }

    public ArrayList<Item> getItems() {
        return inventory;
    }

    public void loading(String filename) {
        try (BufferedReader file = new BufferedReader(new FileReader(filename))) {
            String line = file.readLine();
            while (line != null) {
                inventory.add(new Item(line));
                line = file.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private Inventory findInventoryByName(String name) {
        switch (name.toLowerCase()) {
            case "locker":
                return new Inventory();
            case "backpack":
                return new Inventory();
            case "pencil case":
                return new Inventory();
            default:
                return null;
        }
    }
}
