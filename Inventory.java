import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.PrintWriter;


public class Inventory {

    public static String getItems;
    //private String Inventory.inventory();
    private ArrayList<Item> inventory = new ArrayList<>();
    private String filename = "inventory.txt"; // Assuming filename is a class member
    
    public Inventory(){
        this.inventory = inventory;

    }
    
    public void addItem(Item item){
        inventory.add(item);

    }

    public void removeItem(Item item){
        inventory.remove(item);
    }

    public void moveItem(Object destinationItem, Object destinationItem2){
        
    }

    public void storing() {
        // Writing items from the inventory to a text file
        if (inventory != null) { // Null check
            try (PrintWriter file = new PrintWriter(new FileWriter(filename))) {
                for (Item item : inventory) {
                    file.println(item.getItemName()); // Assuming there's a method to get the item name
                }
            } catch (IOException ex) {
                // Better handling of exceptions, logging or displaying appropriate message
                ex.printStackTrace();
            }
        } else {
            System.out.println("Inventory is null."); // Handling null inventory
        }
    }//end saveStringArray to a text file  
        

    public void loading(String filename) {
        ArrayList<String> temp = new ArrayList<>();
        try (BufferedReader file = new BufferedReader(new FileReader(filename))) {
            String line = file.readLine(); // Read the first line
            while (line != null) {
                temp.add(line);
                line = file.readLine(); // Read the next line
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    public ArrayList<Item> inventoryName(){
        return inventory;
    }    
    
    //getter below
    public ArrayList<Item> getItems(){
        return inventory;
    }

    public static void removeItem(String removeitem) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeItem'");
    }

    public static boolean containsItem(String itemtomove) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'containsItem'");
    }

    public static void moveItem(String itemtomove, Object destinationItem) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'moveItem'");
    }


}