import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Inventory locker = new Inventory();
        Inventory backPack = new Inventory();
        Inventory pencilcase = new Inventory();
        Scanner Scanner = new Scanner(System.in)

        System.out.println("Welcome to my BackPack Assignment!");
        locker.loading("inventory.txt");
        backPack.loading("inventory.txt");
        pencilcase.loading("inventory.txt");

        while(true){
        System.out.println("where would you like to go?\n locker (1) \nbackpack (2) \npencilcase (3)");
        int todo = scanner.nextInt();
        scanner.nextLine();

        switch(todo){

        case 1:
            manager(locker);
        case 2:
            
            manager(backPack);

        case 3:
            manager(pencilcase);
        case 4:
            System.out.println("exiting program");
            break;

        default:
            System.out.println("Invalid option, please try again.");
          //break; may be used if needed
        }
        
        }
  
    }

    public static manager(Inventory location){


        dsplayItems(scanner);
        System.outprintln("what would you like to do?\n moveitem (1) \n remove item (2)\n additem (3)\n quit (4)");
        string todo2 = scanner.nextInt();
        
       
        if(!todo.isnumeric){
            System.outprintln("Invalid.");
            break;
            
        }
        switch(todo2){
            case 1:
                System.out.println("what item would you like to move?")
                string itemtomove = scanner.nextLine();
                System.outprintln("where to move it ");
                string destonationItem = scanner.nextLine();
                
                if(itemtomove=Inventory.getItems){
                    Inventory.moveItem(itemtomove destinationItem);
                    System.outprintln("item has been move to " + destonationItem);
                }else{
                    System.outprintln("Invalid.");
                }
            case 2:
                System.out.println("what item would you like to remove ");
                string removeitem = scanner.nextLine();
                Inventory.removeItem(removeItem);

                
            case 3:
                System.out.println("");

            case 4:
                System.out.println("exiting");
                break;

            default:
                System.out.println("invaild");
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
    
    public displayItems(location items){

    }

}