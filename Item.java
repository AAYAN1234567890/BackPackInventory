// BackPack Inventory Assignment



/*

 * Title: Item Class

 * Author: Aayan Samdani

 * Date: March 24, 2024

 */

// Abstraction: The Item class simplifies the representation of individual inventory items 
// by focusing on a single property, itemName, abstracting away unnecessary details.

// Encapsulation: The Item class encapsulates the state of an item by maintaining its itemName property privately. 
// Access to this property is provided through a getter method, ensuring controlled access to item details.

public class Item {
    private String itemName;

    public Item(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }
}