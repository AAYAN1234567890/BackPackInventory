
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Inventory {
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