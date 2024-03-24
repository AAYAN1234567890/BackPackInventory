// BackPack Inventory Assignment



/*

 * Title: Inventory Class

 * Author: Aayan Samdani

 * Date: March 24, 2024

 */

// Abstraction: The Inventory class simplifies item management by providing methods 
// for adding, removing, moving, loading, and updating items in an inventory. 
// It hides the complexities of internal implementation details from the user.

// Aggregation: The Inventory class gathers instances of the Item class, organizing them 
// within an ArrayList to represent the items in the inventory effectively.

// Encapsulation: The Inventory class encapsulates item management functionalities 
// with methods like addItem(), removeItem(), moveItem(), loading(), and updating(). 
// These methods encapsulate the internal logic of inventory management. 
// Additionally, it protects the state of each inventory (e.g., inventory name and items) 
// by keeping them private and providing access through getter methods.


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Inventory {
    // IPO: No specific input/output for this class

    // Getter and Setter: 
    // Getters: getInventoryName(), getItems()
    // Setters: None since items are managed through addItem(), removeItem(), and moveItem() methods.

    private ArrayList<Item> inventory = new ArrayList<>();
    private String inventoryName;

    public Inventory(String inventoryName) {
        this.inventoryName = inventoryName;
    }

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

    public void moveItem(String itemName, Inventory destination) {
        if (destination != null) {
            Item itemToMove = null;
            for (Item item : inventory) {
                if (item.getItemName().equalsIgnoreCase(itemName)) {
                    itemToMove = item;
                    break;
                }
            }
    
            if (itemToMove != null) {
                inventory.remove(itemToMove);
                destination.addItem(itemToMove);
                System.out.println("\nItem has been moved to " + destination.getInventoryName());
            } else {
                System.out.println("\nItem not found in inventory.");
            }
        } else {
            System.out.println("Destination inventory not found.");
        }
    }

    public String getInventoryName() {
        return inventoryName;
    }

    public ArrayList<Item> getItems() {
        return inventory;
    }

    public void loading(String filename) {
        // IPO:
        // Input: File input for loading inventory items.
        // Process: Reading items from a file and populating the inventory.
        // Output: No specific output

        // Getter and Setter: No specific getters or setters in this method

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

    public void updating(String filename) {
        // IPO:
        // Input: No specific input
        // Process: Updating inventory items to a file.
        // Output: File output for updating inventory items.

        // Getter and Setter: No specific getters or setters in this method

        try (PrintWriter file = new PrintWriter(new FileWriter(filename))) {
            for (Item item : inventory) {
                file.println(item.getItemName());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private Inventory findInventoryByName(String name) {
        switch (name.toLowerCase()) {
            case "locker":
                return new Inventory(name);
            case "backpack":
                return new Inventory(name);
            case "pencil case":
                return new Inventory(name);
            default:
                return null;
        }
    }
}