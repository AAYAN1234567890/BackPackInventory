import java.util.*;

class InventoryItem {
    private String name;

    public InventoryItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Location {
    private String name;
    private List<InventoryItem> items;

    public Location(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    public void addItem(InventoryItem item) {
        items.add(item);
    }

    public void removeItem(InventoryItem item) {
        items.remove(item);
    }

    public void listItems() {
        System.out.println("Items in " + name + ":");
        for (InventoryItem item : items) {
            System.out.println(item.getName());
        }
    }

    public String getName() {
        return name;
    }

    public List<InventoryItem> getItems() {
        return items;
    }
}

class InventoryManager {
    private List<Location> locations;

    public InventoryManager() {
        locations = new ArrayList<>();
    }

    public void addLocation(Location location) {
        locations.add(location);
    }

    public Location getLocation(int locationNumber) {
        if (locationNumber > 0 && locationNumber <= locations.size()) {
            return locations.get(locationNumber - 1);
        }
        return null;
    }

    public void moveItem(String itemName, int sourceLocationNumber, int destinationLocationNumber) {
        Location sourceLocation = getLocation(sourceLocationNumber);
        Location destinationLocation = getLocation(destinationLocationNumber);

        if (sourceLocation != null && destinationLocation != null) {
            InventoryItem item = findItem(itemName, sourceLocation);
            if (item != null) {
                sourceLocation.removeItem(item);
                destinationLocation.addItem(item);
                System.out.println(itemName + " moved from " + sourceLocation.getName() + " to " + destinationLocation.getName());
            } else {
                System.out.println(itemName + " not found in " + sourceLocation.getName());
            }
        } else {
            System.out.println("Invalid source or destination location.");
        }
    }

    InventoryItem findItem(String itemName, Location location) {
        for (InventoryItem item : location.getItems()) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                return item;
            }
        }
        return null;
    }

    public void listLocations() {
        System.out.println("Available locations:");
        for (int i = 0; i < locations.size(); i++) {
            Location location = locations.get(i);
            System.out.println((i + 1) + ". " + location.getName());
            location.listItems(); // Print items in the location
            System.out.println(); // Add a new line for readability
        }
    }
}

public class main {
    public static void main(String[] args) throws InterruptedException {
        try (Scanner scanner = new Scanner(System.in)) {
            InventoryManager manager = new InventoryManager();

            Location locker = new Location("Locker");
            Location backpack = new Location("Backpack");
            Location pencilCase = new Location("Pencil Case");

            manager.addLocation(locker);
            manager.addLocation(backpack);
            manager.addLocation(pencilCase);

            int option = 0; // Initialize option outside the loop

            while (true) {
                System.out.println("\nOptions:");
                System.out.println("1. Add item");
                System.out.println("2. Remove item");
                System.out.println("3. Move item");
                System.out.println("4. List locations");
                System.out.println("5. Exit");
                System.out.print("Enter option: ");

                String optionInput = scanner.nextLine();

                // Validate input to check if it's a number
                if (!optionInput.matches("\\d+")) {
                    System.out.println("Invalid option. Please enter a number.");
                    continue;
                }

                option = Integer.parseInt(optionInput);

                switch (option) {
                    case 1:
                        System.out.print("Enter item name: ");
                        String addItemName = scanner.nextLine();
                        System.out.print("Choose location (1, 2, 3): ");
                        int addLocationNumber = scanner.nextInt();
                        Location addLocation = manager.getLocation(addLocationNumber);
                        if (addLocation != null) {
                            addLocation.addItem(new InventoryItem(addItemName));
                            System.out.println(addItemName + " added to " + addLocation.getName());
                        } else {
                            System.out.println("Invalid location number.");
                        }
                        break;
                    case 2:
                        System.out.print("Enter item name: ");
                        String removeItemName = scanner.nextLine();
                        System.out.print("Choose location (1, 2, 3): ");
                        int removeLocationNumber = scanner.nextInt();
                        Location removeLocation = manager.getLocation(removeLocationNumber);
                        if (removeLocation != null) {
                            InventoryItem removeItem = manager.findItem(removeItemName, removeLocation);
                            if (removeItem != null) {
                                removeLocation.removeItem(removeItem);
                                System.out.println(removeItemName + " removed from " + removeLocation.getName());
                            } else {
                                System.out.println(removeItemName + " not found in " + removeLocation.getName());
                            }
                        } else {
                            System.out.println("Invalid location number.");
                        }
                        break;
                    case 3:
                        System.out.print("Enter item name: ");
                        String moveItemName = scanner.nextLine();
                        System.out.print("Choose source location (1, 2, 3): ");
                        int sourceLocationNumber = scanner.nextInt();
                        System.out.print("Choose destination location (1, 2, 3): ");
                        int destinationLocationNumber = scanner.nextInt();
                        manager.moveItem(moveItemName, sourceLocationNumber, destinationLocationNumber);
                        break;
                    case 4:
                    Thread.sleep(2000);
                        manager.listLocations();
                        Thread.sleep(2000);
                        System.out.println("Press Enter to Continue to menu.");
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        System.exit(0);
                    default:
                        System.out.println("Invalid option. Press Enter to Continue.");
                }
                // Consume the newline character
                     scanner.nextLine();
            }
        }
    }
}