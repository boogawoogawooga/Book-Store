import java.util.*;

public class Member2 {
    // initialization
    private String firstName;
    private String lastName;
    private int memberID;
    private boolean isPremium = false;
    private double balance;
    private boolean duePayed = false;
    private ArrayList<Order2> orderList;

    // Mmeber constructor that creates new arraylist for each member 
    Member2(String firstName, String lastName){
        orderList = new ArrayList<>();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // getters
    public String getFirstName() {
        return firstName;
    }

    public double getBalance() {
        return balance;
    }

    public String getLastName() {
        return lastName;
    }

    public int getMemberID() {
        return memberID;
    }

    public boolean getDuePayed(){
        return duePayed;
    }

    public ArrayList<Order2> getOrderList() {
        return orderList;
    }

    public boolean isPremium(){
        return isPremium;
    }

    public double getTotalBalance(){
        double totalBalance = 0;
        for (Order2 order : orderList){
            totalBalance += order.getOrderPrice(this);
        }
        return totalBalance;
    } 

    public void memberToString(){
        System.out.println(firstName + " " + lastName + "\n ID: " + memberID + "     Total Spent: $" + this.getBalance());
    }

    // Setters
    public void setPremium(){
        this.isPremium = true;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setDuePayed(boolean duePayed) {
        this.duePayed = duePayed;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public void addOrder(Order2 order){
        orderList.add(order);
    }






}
