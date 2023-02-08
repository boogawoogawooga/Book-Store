import java.util.*;

public class BookStore2 implements BookStoreSpecification {
    // Initialization - includes member list and item list
    ArrayList<Member2> members;
    ArrayList<Item> items;
    public int memberID = 1;
    public int itemNum = 1;

    // Bookstore construcotr that adds member list full of 3 members, and item list with 15 items
    BookStore2(){
        members = new ArrayList<>();
        items = new ArrayList<>();

        Member2 john = new Member2("John", "Doe");
        Member2 connor = new Member2("Connor", "Freeman");
        Member2 jane = new Member2("Jane", "Doe");

        Book2 lordOfTheRings = new Book2("Lord of The Rings", "J.R. Tolein", 19.29, 30);
        incrementItemNum(lordOfTheRings);
        items.add(lordOfTheRings);
        Book2 theRepublic = new Book2("The Republic", "Plato", 10.25, 25);
        incrementItemNum(theRepublic);
        items.add(theRepublic);
        Book2 letTheRightOneIn = new Book2("Let The right One In", "John Lindqvist", 15.66, 15);
        incrementItemNum(letTheRightOneIn);
        items.add(letTheRightOneIn);
        Book2 amityVilleHorror = new Book2("The Amityville Horror", "Jay Anson", 3.37, 38);
        incrementItemNum(amityVilleHorror);
        items.add(amityVilleHorror);
        Book2 booksOfBlood = new Book2("Books of Blood", "Clive Barker", 6.66, 10);
        incrementItemNum(booksOfBlood);
        items.add(booksOfBlood);
    
        CD2 deathCrush = new CD2("Death Crush", "Mayhem", 10.99, 50);
        incrementItemNum(deathCrush);
        items.add(deathCrush);
        CD2 panzerfaust = new CD2("Panzerfaust", "Darkthrone", 9.75, 40);
        incrementItemNum(panzerfaust);
        items.add(panzerfaust);
        CD2 pesteNoire = new CD2("La Sanie des siècles Panégyrique de la dégénérescence", "Peste Noire", 7.50, 20);
        incrementItemNum(pesteNoire);
        items.add(pesteNoire);
        CD2 filosofem = new CD2("Filosphem", "Burzum", 12.65, 50);
        incrementItemNum(filosofem);
        items.add(filosofem);
        CD2 pentagram = new CD2("Pentagram", "Gorgoroth", 15.00, 35);
        incrementItemNum(pentagram);
        items.add(pentagram);
    
        DVD2 facesOfDeath = new DVD2("Faces of Death", "Kaoru Adachi", 12.23, 30);
        incrementItemNum(facesOfDeath);
        items.add(facesOfDeath);
        DVD2 aftermath = new DVD2("Aftermath (1998)", "Jaison Greene", 7.39, 10);
        incrementItemNum(aftermath);
        items.add(aftermath);
        DVD2 videoDrome = new DVD2("Videodrome", "David Cronenberg", 8.99, 15);
        incrementItemNum(videoDrome);
        items.add(videoDrome);
        DVD2 blackMetalVeins = new DVD2("Black Metal Veins", "Lucifer Valentine", 9.99, 13);
        incrementItemNum(blackMetalVeins);
        items.add(blackMetalVeins);
        DVD2 gummo = new DVD2("Gummo", "Harmony Korine", 8.95, 18);
        incrementItemNum(gummo);
        items.add(gummo);

        members.add(john);
        incrementMemberNum(john);
        members.add(connor);
        incrementMemberNum(connor);
        members.add(jane);
        incrementMemberNum(jane);
    }

    // prints every member in the bookstore 
    public void printMembers(){
        for(Member2 member : members){
            System.out.println(member.toString());
        }
    }

    // prints every book type in the bookstore in an organized list
    public void printBooks(){
        int i = 1;
        for(Item item:items){
            
            if(item instanceof Book2){
                System.out.print(i + ") ");
                item.itemToString();
                i++;
            }
        }
        System.out.println("Please enter a number (1-5) to add the associated book to your cart or enter 6 to go back");
    }

    // prints every cd type in the bookstore in an organized list
    public void printCDs(){
        int i = 1;
        for(Item item:items){
            
            if(item instanceof CD2){
                System.out.print(i + ") ");
                item.itemToString();
                i++;
            }
        }
        System.out.println("Please enter a number (1-5) to add the associated CD to your cart or enter 6 to go back");
    }

    // prints every dvd type in the bookstore in an organized list
    public void printDVDs(){
        int i = 1;
        for(Item item:items){
            
            if(item instanceof DVD2){
                System.out.print(i + ") ");
                item.itemToString();
                i++;
            }
        }
        System.out.println("Please enter a number (1-5) to add the associated DVD to your cart or enter 6 to go back");
    }

    // returns all members in bookstore
    public ArrayList<Member2> getMembers() {
        return members;
    }

    // returns only premium members in bookstore
    public ArrayList<PremiumMember2> getPremiumMembers(){
        ArrayList<PremiumMember2> premium = new ArrayList<>();

        for(Member2 member : this.members){
            if(member instanceof PremiumMember2){
                premium.add((PremiumMember2)member);
            }
        }

        return premium;
    }

    // returns all items in bookstore
    public ArrayList<Item> getItems() {
        return items;
    }

    // adds members to bookstore
    public void bookStoreAddMember(Member2 member){
        this.members.add(member);
        incrementMemberNum(member);
    }

    // used in bookstoreaddmember & bookstore
    public void incrementMemberNum(Member2 member){
        member.setMemberID(memberID);
        memberID++;
    }

    // used in bookstore
    public void incrementItemNum(Item item){
        item.setItemNum(itemNum);
        itemNum++;
    }

    // implimented from interface. Takes in item number and quantity. It adds the specified quantitiy of the item number to the bookstore stock
    @Override
    public void restockProduct(int itemNum, int num){
        for(Item item : items){
            if(item.getItemNum() == itemNum){
                int newStock = item.getStock() + num;
                item.setStock(newStock);
            }
        }
    }

    // returns the value of the entire bookstore stock
    @Override
    public double inventoryValue(){
        double total = 0;
        for(Item item : items){
            total+=(item.getPrice()*item.getStock());
        }
        return total;
    }


    
}
