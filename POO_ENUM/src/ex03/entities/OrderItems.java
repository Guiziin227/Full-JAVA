package ex03.entities;

public class OrderItems {
    private Integer quantity;
    private Double price;

    private Product product;

    public OrderItems() {
    }

    public OrderItems(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }

    public Double subTotal() {
        return quantity * price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return product.getName() + ", $" + String.format("%.2f", price) + ", Quantity: " + quantity + ", Subtotal: $" + String.format("%.2f", subTotal());
    }

}
