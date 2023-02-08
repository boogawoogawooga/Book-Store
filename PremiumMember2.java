public class PremiumMember2 extends Member2 {
    // Premium member that extends Member

    PremiumMember2(String firstName, String lastName){
        super(firstName, lastName); 
        this.setPremium();
    }

    // Override toString method from member to add premium status
    @Override
    public String toString(){
        return super.toString() + "\nPremium Status: " + this.isPremium();
    }


}
