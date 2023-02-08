import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Menu {

    private Scanner scnr = new Scanner(System.in);

    // Initilization used for while loops 
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public int d = 0;

    // initilization of order and declaration of the bookstore
    private Order2 order;

    private BookStore2 hellsHeadbangers = new BookStore2();

    // menu constructor
    // The point of this is to be able to call this.(method) and have multiple menu interfaces bounce off of eachother from a call in one line to 
    // streamline the test harness and organize the menu
    public Menu(){}

    // This is the menu section method for orders. It takes in a member, and adds an order to their profile. 
    public void menuOrder(Member2 member){

        order = new Order2();
        d = 0;
        while (d==0){
            System.out.println("Please enter the menu option you would like to choose \n1) View Book Inventory\n2) View CD Inventory\n3) View DVD Inventory\n4) View Account Information\n5) Complete Order\n6) Exit.");
            int option;
            try{
                option = scnr.nextInt();
                if(option >6 || option<1){
                    System.out.println("Try again");
                    option = scnr.nextInt();
                }
            }
            catch(InputMismatchException ex){
                System.out.println("You didnt enter a number, try aain");
                option = scnr.nextInt();
                if(option >6 || option<1){
                    System.out.println("Try again");
                    option = scnr.nextInt();
                }
            }
            catch(Exception ex){
                System.out.println("Something went wrong, try again");
                option = scnr.nextInt();
                if(option >6 || option<1){
                    System.out.println("Try again");
                    option = scnr.nextInt();
                }
            }

            switch(option){
                case 1:
// View Book Inventory
                    a = 0;
                    while(a == 0){
                        hellsHeadbangers.printBooks();
                        scnr.reset();
                        int bookItemNum;
                        try {
                            bookItemNum = scnr.nextInt();
                            if(bookItemNum >6 || bookItemNum<1){
                                System.out.println("Try again");
                                bookItemNum = scnr.nextInt();
                            }
                        }
                        catch(InputMismatchException ex){
                            System.out.println("You didnt enter a number, try again");
                            bookItemNum = scnr.nextInt();
                            if(bookItemNum >6 || bookItemNum<1){
                                System.out.println("Try again");
                                bookItemNum = scnr.nextInt();
                            }
                        }
                        catch(Exception ex){
                            System.out.println("Something went wrong, try again");
                            bookItemNum = scnr.nextInt();
                            if(bookItemNum >6 || bookItemNum<1){
                                System.out.println("Try again");
                                bookItemNum = scnr.nextInt();
                            }
                        }

                            switch(bookItemNum){
                                case 1:
                                    order.add(1, hellsHeadbangers, order);
                                    break;
                                case 2:
                                    order.add(2, hellsHeadbangers, order);
                                    break;
                                case 3:
                                    order.add(3, hellsHeadbangers, order);
                                    break;
                                case 4:
                                    order.add(4, hellsHeadbangers, order);
                                    break;
                                case 5:
                                    order.add(5, hellsHeadbangers, order);
                                    break;
                                case 6:
                                    a = 1;
                                    break;
                        }           
                    }
                    break;
                case 2:
// View CD Inventory
                    b = 0;
                    while(b == 0){
                        hellsHeadbangers.printCDs();
                            scnr.reset();
                            int CDItemNum;
                            try{    
                                CDItemNum = scnr.nextInt();
                                if(CDItemNum >6 || CDItemNum<1){
                                    System.out.println("Try again");
                                    CDItemNum = scnr.nextInt();
                                }
                            }
                            catch(InputMismatchException ex){
                                System.out.println("You didnt enter a number, try again");
                                CDItemNum = scnr.nextInt();
                                if(CDItemNum >6 || CDItemNum<1){
                                    System.out.println("Try again");
                                    CDItemNum = scnr.nextInt();
                                }
                            }
                            catch(Exception ex){
                                System.out.println("Something went wrong, try again");
                                CDItemNum = scnr.nextInt();
                                if(CDItemNum >6 || CDItemNum<1){
                                    System.out.println("Try again");
                                    CDItemNum = scnr.nextInt();
                                }
                            }
                            switch(CDItemNum){
                                    case 1:
                                        order.add(6, hellsHeadbangers, order);
                                        break;
                                    case 2:
                                        order.add(7, hellsHeadbangers, order);
                                        break;
                                    case 3:
                                        order.add(8, hellsHeadbangers, order);
                                        break;
                                    case 4:
                                        order.add(9, hellsHeadbangers, order);
                                        break;
                                    case 5:
                                        order.add(10, hellsHeadbangers, order);
                                        break;
                                    case 6:
                                        b = 1;
                                        break;
                                }
                    }
                    break;

                case 3:
// View DVD Inventory
                    c = 0;
                    while(c == 0){
                        hellsHeadbangers.printDVDs();
                            scnr.reset();
                            int DVDItemNum;
                            try{    
                                DVDItemNum = scnr.nextInt();
                                if(DVDItemNum >6 || DVDItemNum<1){
                                    System.out.println("Try again");
                                    DVDItemNum = scnr.nextInt();
                                }
                            }
                            catch(InputMismatchException ex){
                                System.out.println("You didnt enter a number, try again");
                                DVDItemNum = scnr.nextInt();
                                if(DVDItemNum >6 || DVDItemNum<1){
                                    System.out.println("Try again");
                                    DVDItemNum = scnr.nextInt();
                                }
                            }
                            catch(Exception ex){
                                System.out.println("Something went wrong, try again");
                                System.out.println("You didnt enter a number, try again");
                                DVDItemNum = scnr.nextInt();
                                if(DVDItemNum >6 || DVDItemNum<1){
                                    System.out.println("Try again");
                                    DVDItemNum = scnr.nextInt();
                                }
                            }
                            switch(DVDItemNum){
                                    case 1:
                                        order.add(11, hellsHeadbangers, order);
                                        break;
                                    case 2:
                                        order.add(12, hellsHeadbangers, order);
                                        break;
                                    case 3:
                                        order.add(13, hellsHeadbangers, order);
                                        break;
                                    case 4:
                                        order.add(14, hellsHeadbangers, order);
                                        break;
                                    case 5:
                                        order.add(15, hellsHeadbangers, order);
                                        break;
                                    case 6:
                                        c = 1;
                                        break;
                            }
                    }
                    break;

                case 4:
// View Account Information
                    if(member instanceof PremiumMember2){
                        ((PremiumMember2)member).memberToString();
                        break;
                    }
                    if(!(member instanceof PremiumMember2)){
                        member.memberToString();
                        break;
                    }

                case 5:
// Complete Order
                    member.addOrder(order);
                    if(!(member instanceof PremiumMember2)){
                        order.orderToString(member);
                        member.setBalance(member.getBalance()+order.getOrderPrice(member));
                        }
                    if(member instanceof PremiumMember2){
                        double due = 0;

                        if(!((PremiumMember2)member).getDuePayed()){
                            due = 10;
                            ((PremiumMember2)member).setDuePayed(true);
                            System.out.println("Your membership due of $10 is due today, the charge will be added to your final price");
                        }
                        order.orderToString(member);
                        System.out.println("+ Order Due $" + due + "\n-------------------\n$");
                        System.out.println(order.getOrderPrice(member) + due);
                        member.setBalance(member.getBalance()+order.getOrderPrice(member) + due);
                    }

                    d=1;
                    break;

                case 6:
    // Exit
                    d=1;
                    break;
            }
    }
    }

// This is the add customer section of the program. It is the main of the menu. It starts by asking the customer to enter 0 to start; however, if
// the customer has the secret code (666), then it takes the user to the website stock mainframe and allows the user to order items.
// It does this by calling on the menuManager method for the menu object
// once it makes it past this, it asks the user to enter in either their name, or id to enter the store. If a name or id is not found on 
// file, it will ask the user to create an account - either premium or non premium. It then calls on the menuOrder method and inputs 
// the member as an argument 
    public void menuAddCus(){
        int exit = 0;
        Scanner scnr = new Scanner(System.in);
        // Here is the try block which will take each line of a csv file given a provided format. It will scan the identity word at the start of 
        // each line, match it to an algorithim, and update the stock if it is matched to an item, or update the memberships if matched to 
        // a member
    
        try{
            Scanner fs;
            Scanner ls;
            fs = new Scanner(new File("/Users/connorfreeman/Desktop/1213/BookStore2/closeOut.csv"));
            fs.useDelimiter("\n");


            while(fs.hasNextLine()){
                String line = fs.nextLine();
                ls = new Scanner(line);
                ls.useDelimiter(",");
                while(ls.hasNext()){
                    String identity = ls.next();
                    if(identity.equals("book") || identity.equals("cd") ||
                    identity.equals("dvd")){
                        int itemNum = ls.nextInt();
                        int stock = ls.nextInt();
                        for(Item item: hellsHeadbangers.getItems()){
                            if(item.getItemNum() == itemNum){
                                item.setStock(stock);
                            }
                        }
                    }
                    if(identity.equals("premiummember")){
                        int id = ls.nextInt();
                        String ln = ls.next();
                        String fn = ls.next();
                        double bl = ls.nextDouble();
                        Boolean dp = ls.nextBoolean();
                        PremiumMember2 a = new PremiumMember2(fn, ln);
                        Boolean check = false;

                        for(Member2 member : hellsHeadbangers.getMembers()){
                            if(id != member.getMemberID()){
                                a.setBalance(bl);
                                a.setDuePayed(dp);
                            }
                            if(id == member.getMemberID()){
                                System.out.println(true + member.getFirstName());
                                member.setBalance(bl);
                                member.setDuePayed(dp);
                                check = true;
                            }
                        }
                        if(!check){
                            hellsHeadbangers.bookStoreAddMember(a);
                            check = false;
                        }

                    }
                    if(identity.equals("member")){
                        int id = ls.nextInt();
                        String ln = ls.next();
                        String fn = ls.next();
                        double bl = ls.nextDouble();
                        Boolean dp = ls.nextBoolean();
                        Member2 a = new Member2(fn, ln);
                        Boolean check = false;

                        for(Member2 member : hellsHeadbangers.getMembers()){
                            if(id != member.getMemberID()){
                                a.setBalance(bl);
                                a.setDuePayed(dp);
                            }
                            if(id == member.getMemberID()){
                                System.out.println(true + member.getFirstName());
                                member.setBalance(bl);
                                member.setDuePayed(dp);
                                check = true;
                            }
                        }
                        if(!check){
                            hellsHeadbangers.bookStoreAddMember(a);
                            check = false;
                        }
                    }
                }
                ls.close();
            }
            fs.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("Error File Not Found");
        }
        catch(Exception ex){
            System.out.println("Something went wrong");
        }
    
            while(exit == 0){
                System.out.println("\n\nHello, welcome to Hells HeadBangers!\n\n********************************************************\n"
                 + "If you would like to continue, enter 0. To exit the program, press 1.");
                int enter;
                try{   
                    enter = scnr.nextInt();
                    scnr.nextLine();
                }
                catch(InputMismatchException ex){
                    System.out.println("You didnt enter a number, try again");
                    enter = scnr.nextInt();
                    scnr.nextLine();
                }
                catch(Exception ex){
                    System.out.println("Something went wrong, try again");
                    enter = scnr.nextInt();
                    scnr.nextLine();
                }
                if(enter == 1){
                    // this try block takes all of the info from the previous days csv file. It compares the current memberships to the 
                    // previous days memberships to create a new list of only the members added on the current day.
                    // the block also displays all transactions completed during this day as well as the total daily revenue.
                    try{
                        FileOutputStream endOfDay = new FileOutputStream("/Users/connorfreeman/Desktop/1213/BookStore2/endOfDay.txt");
                        PrintWriter pw = new PrintWriter(endOfDay); 
                        pw.println("New Customers: Name    / ID       / Balance      / Premium");
                       
                        Boolean lock = true;
                                    for(Member2 member : hellsHeadbangers.getMembers()){
                                        Scanner fs;
                                        Scanner ls;
                                        fs = new Scanner(new File("/Users/connorfreeman/Desktop/1213/BookStore2/closeOut.csv"));
                                        fs.useDelimiter("\n");
                                        
                                        while(fs.hasNextLine()){
                                            String line = fs.nextLine();
                                            ls = new Scanner(line);
                                            ls.useDelimiter(",");
                                            int id = 0;
                                            while(ls.hasNext()){
                                                String identifier = ls.next();
                                                if(identifier.equals("member") || identifier.equals("premiummember")){
                                                    id = ls.nextInt();
                                                    String ln = ls.next();
                                                    String fn = ls.next();
                                                    Double bl = ls.nextDouble();
                                                    Boolean dp = ls.nextBoolean();
                                                }



                                            }
                                            if(id == member.getMemberID()){
                                                lock = false;
                                            }
                                            ls.close();

                                        }
                                        if(lock){
                                            pw.println(member.getFirstName() + " "  + member.getLastName() + " / " + member.getMemberID() + " / "
                                             + member.getBalance() + " / " + (member instanceof PremiumMember2));
                                        }


                                        lock = true;
                                        fs.close();
                                    }
                                    pw.println("\nNew Orders: Customer\n            Item / Item Num\n            Total");
                                    double total = 0;
                                    for(Member2 member: hellsHeadbangers.getMembers()){
                                        boolean check = false;
                                        for(Order2 order : member.getOrderList()){
                                            check = true;
                                            pw.println(member.getFirstName() + " " + member.getLastName());
                                            for(Item item : order.getItems()){
                                                pw.println(item.getItemName() + " / " + item.getItemNum());
                                            }
                                            total+=order.getOrderPrice(member);
                                            pw.println("$" + order.getOrderPrice(member) + "\n");
                                        }
                                    }
                                    pw.println("\nTotal Daily Revenue: $" + total);


                       
                        pw.close();
                    }
                    catch(FileNotFoundException ex){
                        System.out.println("Error File Not Found");
                    }
                    catch(IOException ex){
                        System.out.println("IO Exception");
                    }
                    catch(Exception ex){
                        System.out.println("Something went wrong");
                    }
                    // this try block creates the days close out csv file. It goes through all members and items and adds them to a list
                    // given a specific format for each object type so that it can be read when the system starts back up again
                    try{
                        File closeOut = new File("/Users/connorfreeman/Desktop/1213/BookStore2/closeOut.csv");
                        PrintWriter fw = new PrintWriter(closeOut);
                        fw.println("Item Type / Item Number / Item Stock");
                        for(Item item : hellsHeadbangers.getItems()){
                            if(item instanceof Book2){
                                fw.println("book," + item.getItemNum() + "," + item.getStock() + ",");
                            }
                            if(item instanceof CD2){
                                fw.println("cd," + item.getItemNum() + "," + item.getStock()+ ",");
                            }
                            if(item instanceof DVD2){
                                fw.println("dvd," + item.getItemNum() + "," + item.getStock()+ ",");
                            }
                        }
                        fw.println("Membership Type / Member ID / Last Name / First name / Balance / Dues Payed");
                        for(Member2 member : hellsHeadbangers.getMembers()){
                            if(member instanceof PremiumMember2){
                                fw.println("premiummember," + member.getMemberID() + "," + member.getLastName() + "," + member.getFirstName()
                                + "," + member.getBalance() + "," + member.getDuePayed()+ ",");
                            }
                            else{
                                fw.println("member," + member.getMemberID() + "," + member.getLastName() + "," + member.getFirstName()
                                + "," + member.getBalance() + "," + member.getDuePayed()+ ",");
                            }
                        }
                        fw.close();

                        System.exit(0);
                    }
                    catch(FileNotFoundException ex){
                        System.out.println("Error File Not Found");
                    }
                    catch(IOException ex){
                        System.out.println("Error IO Exception");
                    }
                    catch(Exception ex){
                        System.out.println("Something went wrong");
                    }
                    
                }
                if(enter !=0){
                    if(enter==666){
                        this.menuManager(666);
                        System.out.println("\n\nHello, welcome to Hells HeadBangers!\n\n********************************************************\n"
                        + "If you would like to continue, enter 0. To exit the program, press 1.");
                    }
                    if(enter!=666){
                        System.out.println("Try again");
                    }
                    try{   
                        enter = scnr.nextInt();
                        scnr.nextLine();
                    }
                    catch(InputMismatchException ex){
                        System.out.println("You didnt enter a number, try again");
                        enter = scnr.nextInt();
                        scnr.nextLine();
                    }
                    catch(Exception ex){
                        System.out.println("Something went wrong, try again");
                        enter = scnr.nextInt();
                        scnr.nextLine();
                    }
                }

                System.out.println("\nPlease enter the first name of your account or your member id number");
    
                    String first = scnr.nextLine();
                    String last = "";
                    int j = 0;
                    String resultStr="0";  
                    boolean maybe = false;
    
                    for (int i=0;i<first.length();i++)  {  
                        if (first.charAt(i)>47 && first.charAt(i)<=57){  
                            resultStr= "";
                        }  
                    }
    
                    for (int i=0;i<first.length();i++)  {  
                        if (first.charAt(i)>47 && first.charAt(i)<=57){  
                            resultStr= resultStr+first.charAt(i);  
                        }  
                    }
    
                    j = Integer.parseInt(resultStr);  
    
                    if(j == 0){
                        System.out.println("Please enter the last name of your account");
                        scnr.reset();
                        last = scnr.nextLine();
                    }
    
    
                    for(Member2 member : hellsHeadbangers.getMembers()){
                        if(!((member.getFirstName().equals(first) && member.getLastName().equals(last))) ||  !(j == member.getMemberID())){}
                        if( (member.getFirstName().equals(first) && member.getLastName().equals(last)) ||   j == member.getMemberID()){
    
                            System.out.println("\nHello " + member.getFirstName() + ", welcome back!\n********************************************************");
    
                            maybe = true;
                            this.menuOrder(member);
                        }        
                    }
    
                        if(!maybe){
                            System.out.println("\nIt appears you dont have an account with us, if you would like to make one, press one, otherwise press 0");
                            int decide;
                            try{
                                decide = scnr.nextInt();
                            }
                            catch(InputMismatchException ex){
                                System.out.println("You didnt enter a number, try again");
                                decide = scnr.nextInt();
                            }
                            catch(Exception ex){
                                System.out.println("Something went wrong, try again");
                                decide = scnr.nextInt();
                            }
                            if(decide >1 || decide<0){
                                System.out.println("Try again");
                                try{
                                    decide = scnr.nextInt();
                                }
                                catch(InputMismatchException ex){
                                    System.out.println("You didnt enter a number, try again");
                                    decide = scnr.nextInt();
                                }
                                catch(Exception ex){
                                    System.out.println("Something went wrong, try again");
                                    decide = scnr.nextInt();
                                }
                            }
    
                                if(decide == 1){
                                    System.out.println("Please enter your first name");
                                    scnr.nextLine();
                                    String firstName = scnr.nextLine();
    
                                    System.out.println("Please enter yor last name");
                                    String lastName = scnr.nextLine();
    
                                    System.out.println("Our premium accounts cost $10 a month. You will get a 10% discount off of all orders\nIf you would like to create a premium account with us press 1; otherwise, press 0.");
                                    int premium;
                                    try{
                                        premium = scnr.nextInt();
                                    }
                                    catch(InputMismatchException ex){
                                        System.out.println("You didnt enter a number, try again");
                                        premium = scnr.nextInt();
                                    }
                                    catch(Exception ex){
                                        System.out.println("Something went wrong, try again");
                                        premium = scnr.nextInt();
                                    }
                                    if(premium >1 || premium<0){
                                        System.out.println("Try again");
                                        try{
                                            premium = scnr.nextInt();
                                        }
                                        catch(InputMismatchException ex){
                                            System.out.println("You didnt enter a number, try again");
                                            premium = scnr.nextInt();
                                        }
                                    }
    
                                    if(premium != 1){
                                        Member2 m = new Member2(firstName, lastName);
                                        hellsHeadbangers.bookStoreAddMember(m);
    
                                        System.out.println("Thank you " + m.getFirstName() + ", your member number is " + m.getMemberID() + ", you can use this to sign in next time!\n********************************************************\n");
                                    }
    
                                    if(premium == 1){
                                        Member2 m = new PremiumMember2(firstName, lastName);
                                        hellsHeadbangers.bookStoreAddMember(m);
    
                                        System.out.println("Thank you " + m.getFirstName() + ", your member number is " + m.getMemberID() + ", you can use this to sign in next time!\n********************************************************\n");
                                    }
                                }
    
                                if(decide == 0){
                                    System.out.println("Ok, have a good day");
                                }
                                 
                        }
    
            }
    }

// This is the manager section / method of the menu. It takes in a code, and if the code is correct, it displays all of the ietms in stock
// as well as the total inventory price. It then asks the user to specify the item number to restock, and the amount to restock.
    public void menuManager(int code){
        if(code == 666){
            hellsHeadbangers.printBooks();
            hellsHeadbangers.printCDs();
            hellsHeadbangers.printDVDs();
            System.out.println("-------------------\nTotal inventory price: $" + hellsHeadbangers.inventoryValue());

            System.out.println("Please type the item number you would like to restock");
            int itemNum;
            try{
                itemNum = scnr.nextInt();
                while (!(0<itemNum && itemNum<16)){
                    System.out.println("Try again");
                    itemNum = scnr.nextInt();
                }
            }
            catch(InputMismatchException ex){
                System.out.println("You didnt enter a number, try aain");
                itemNum = scnr.nextInt();
                while (!(0<itemNum && itemNum<16)){
                    System.out.println("Try again");
                    itemNum = scnr.nextInt();
                }
            }
            catch(Exception ex){
                System.out.println("Something went wrong, try again");
                itemNum = scnr.nextInt();
                while (!(0<itemNum && itemNum<16)){
                    System.out.println("Try again");
                    itemNum = scnr.nextInt();
                }
            }
            System.out.println("Please type the amount you would like to add to the stock");
            int stock;
            try {
                stock = scnr.nextInt();
            }
            catch(InputMismatchException ex){
                System.out.println("You didnt enter a number, try again");
                stock = scnr.nextInt();
            }
            catch(Exception ex){
                System.out.println("Something went wrong, try again");
                stock = scnr.nextInt();
            }

            hellsHeadbangers.restockProduct(itemNum, stock);


        }
    }


}
