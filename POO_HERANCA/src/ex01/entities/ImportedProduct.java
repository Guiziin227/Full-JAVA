package ex01.entities;

public class ImportedProduct extends Product{
    private Double customsFee;

    public ImportedProduct(){}

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public Double totalPrice(Double total, Double fee){
        return total + fee;
    }

    @Override
    public String priceTag(){
        return getName() + " - $" + totalPrice(getPrice(),getCustomsFee()) + " Customs fee: $" + getCustomsFee();
    }
}
