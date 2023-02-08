public abstract class Item implements Comparable<Item>{
    // Initialization
    private String itemName;
    private String author; 
    private double price;
    private int stock;
    private int itemNum = 0;

    // Item constructor 
    Item(String itemName, String author, double price, int stock){
        this.itemName = itemName;
        this.author = author; 
        this.price = price;
        this.stock = stock;
    }

    // Getters
    public String getItemName(){
        return this.itemName;
    }

    public String getAuthor(){
        return this.author;
    }

    public double getPrice(){
        return this.price;
    }

    public int getStock(){
        return this.stock;
    }

    public int getItemNum() {
        return itemNum;
    }

    public void itemToString() {
        
        System.out.println(this.itemName + "        " + this.author + "\n $" + this.price + "       " + stock + " in stock\nItem Number: " + itemNum +"\n"); 

    }

    public String getItem(){
        return this.itemName + "        " + this.author + "\n $" + this.price;
    }

    // Compares item stock to another item stock. If stock is greater than, it will return 1, if less than, return -1, else return 0
    @Override
    public int compareTo(Item item){
        if(this.getStock() < item.getStock()){
            return -1;
        }
        if(this.getStock() > item.getStock()){
            return 1;
        }
        else{
            return 0;
        }
    }

    // Setters
    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setItemNum(int itemNum) {
        this.itemNum = itemNum;
    }



}