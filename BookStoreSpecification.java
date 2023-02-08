public interface BookStoreSpecification {
    // Interface for the BookStore
    public abstract void restockProduct(int itemNum, int num);
    public abstract double inventoryValue();
}
