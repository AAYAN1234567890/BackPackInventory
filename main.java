import java.util.Scanner;

public class Main{

    private static final Inventory Location = null;
    public static Scanner scanner = new Scanner (System.in);

    public static void main(String[] args) {
        Inventory locker = new Inventory();
        Inventory backPack = new Inventory();
        Inventory pencilcase = new Inventory();
        //Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to my BackPack Assignment!");
        locker.loading("locker.txt");
        backPack.loading("pencilcase.txt");
        pencilcase.loading("backpack.txt");

        while(true){
        System.out.println("Where would you like to go?\nLocker (1) \nBackpack (2) \nPencil Case (3) \nExit (4)");
        int todo = scanner.nextInt();
        scanner.nextLine();

        switch(todo){

        case 1:
            manager(locker);
            break;
        case 2: 
            manager(backPack);
            break;
        case 3:
            manager(pencilcase);
            break;
        case 4:
            System.out.println("Exiting program...");
            System.exit(0); // Exiting the program
            break;

        default:
            System.out.println("Invalid option, please try again.");
          //break; may be used if needed        
        }
            
        }
  
    }

    private static void manager(Inventory locker) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'manager'");
        Main mainInstance = new Main(Location); // Creating an instance of Main to invoke the constructor
    }

    public Main(Inventory location){


        Object Scanner;
        displayItems(scanner);
        System.out.println("what would you like to do?\n moveitem (1) \n remove item (2)\n additem (3)\n quit (4)");
        int todo2 = scanner.nextInt();
        
       
        // if(!todo.isnumeric){
        //     System.out.println("Invalid.");
        //        }
        // break;
    
        scanner.nextLine(); // Consume newline

        switch(todo2){
            case 1:
                System.out.println("Locker:");
                System.out.println("What item would you like to move?");
                String itemToMove = scanner.nextLine();
                System.out.println("Where to move it?");
                String destinationItem = scanner.nextLine();

                if (Inventory.containsItem(itemToMove)) {
                    Inventory.moveItem(itemToMove, destinationItem);
                    System.out.println("Item has been moved to " + destinationItem);
                } else {
                    System.out.println("Invalid item.");
                }
                break;
            case 2:
                System.out.println("what item would you like to remove ?");
                String removeitem = scanner.nextLine();
                Inventory.removeItem(removeitem);
                System.out.println( removeitem + "has been removed.");
                break;
            case 3:
            System.out.println("what item would you like to add ?");
            String additem = scanner.nextLine();
            Inventory.removeItem(additem);
            System.out.println(additem + "has been added.");
            break;
            case 4:
                System.out.println("exiting");
                System.exit(0); // Exiting the program
                break;

            default:
                System.out.println("invaild");
                break;

        }
        
        // ask move item, rdisplay items at locationemove item, add item
        // scanner for asking
        // switch cases
        // case 1 moving item, what item to move and where to move it 
        //Inventory.moveItem(scanner destination);
        // print item has been moved to destination
        // case 2: what item to remove
        //Inventory.removeItem(scanner)
        // print item has been removed
        //case 3: whats the name of the item
        // Inventory.addItem(item);
        // print item has been added to current location
        // case 4: go back  break;
        // case default: print Invalid try again continue;

    }
    
    public void displayItems(Object scanner){

    }

}