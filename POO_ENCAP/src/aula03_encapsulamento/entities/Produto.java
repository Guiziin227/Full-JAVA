package aula03_encapsulamento.entities;

public class Produto {
    private String name;
    private double price;
    private int quantity;

    public Produto(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Produto(String name, double price) {
        this.name = name;
        this.price = price;
    } //Refazendo usando sobrecarga

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name + ", R$ " + String.format("%.2f", price) + ", " + quantity + " unidades, Total: R$ " + String.format("%.2f", totalValueInStock());
    }

}
