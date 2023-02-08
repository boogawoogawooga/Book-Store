import java.util.*;

public class Order2 {
    // initialization
    ArrayList<Item> order;
    private double total;

    // Order constructor that creates a new list of items
    Order2(){
        order = new ArrayList<>();
    }

    // items items to order and updates stock 
    public void add(Item item){
        this.order.add(item);
        int stock = item.getStock() - 1;
        item.setStock(stock);
    }

    public ArrayList<Item> getItems(){
        return order;
    }

    // prints out the entire order: items bought, discount, and total - essentially the receipt
    public void orderToString(Member2 member){
        total = 0;
        for(Item item :this.order){
            System.out.println("                                                +\n" + item.getItem());
            total += item.getPrice();
        }
        if(member instanceof PremiumMember2){
            total *=0.9;
            System.out.println("+ 10% premium discount");
        }

        System.out.println("-------------------");
        System.out.println("Total: $" + total);  
    }

    // returns the order price. If cus is premium, gives them 10% discount 
    public double getOrderPrice(Member2 member){
        double total = 0;
        for(Item item : this.order){
            total += item.getPrice();
        }

        if(member instanceof PremiumMember2){
            return total*0.9;
        }
        return total;  
    }

    // adder which is used in menu; thus has to specify item num in bookstore, what bookstore, and the order
    // Once specified, adds items to order 
    public void add(int itemNum, BookStore2 bookStore, Order2 order){
        for(Item item : bookStore.getItems()){
            if(item.getItemNum() == itemNum){
                order.add(item);
            }
        }
    }


}
