package entities;

public class Products {
    public String name;
    public double price;
    public int quantity;

    public double TotalValueStock(){
       return this.price * this.quantity;

    }

    public void AddProducts(int quantity){
        this.quantity += quantity;
    }

    public void RemoveProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return String.format("Product data: %s, $ %.2f, %d units. Total: $ %.2f", name, price, quantity, TotalValueStock());
    }
}
