package aula01.entities;

public class Produto {
    public String name;
    public double price;
    public int quantity;

    public  Produto(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    } //Refazendo usando construtor

    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return name + ", R$ " + String.format("%.2f", price) + ", " + quantity + " unidades, Total: R$ " + String.format("%.2f", totalValueInStock());
    }
}
