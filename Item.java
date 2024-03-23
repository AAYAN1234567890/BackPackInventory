// BackPack Inventory Assignment



/*

 * Title: Item Class

 * Author: Aayan Samdani

 * Date: March 24, 2024

 */

// Abstraction: The Item class abstracts away the details of individual items in the inventory. 
// It provides a simple representation of an item with a single property, itemName.

// Encapsulation: The Item class encapsulates the state of an individual item 
// by keeping its itemName property private and providing access through a getter method.


public class Item {
    private String itemName;

    public Item(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }
}