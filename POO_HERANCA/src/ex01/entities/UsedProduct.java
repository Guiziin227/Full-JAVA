package ex01.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date manufactureDate;

    public UsedProduct(){}


    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public SimpleDateFormat getSdf() {
        return sdf;
    }

    public void setSdf(SimpleDateFormat sdf) {
        this.sdf = sdf;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag(){
        return getName() + " (used)" + " - $" + getPrice() + " Manufacture Date (" + sdf.format(manufactureDate) + ")";
    }
}
