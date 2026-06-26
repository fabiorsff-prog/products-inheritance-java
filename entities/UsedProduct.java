package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class UsedProduct extends Product {

    private LocalDate manufacturerDate;
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public UsedProduct(){
    }

    public UsedProduct(String name, Double price, LocalDate manufacturerDate) {
        super(name, price);
        this.manufacturerDate = manufacturerDate;
    }

    public LocalDate getManufacturerDate() {
        return manufacturerDate;
    }

    public void setManufacturerDate(LocalDate manufacturerDate) {
        this.manufacturerDate = manufacturerDate;
    }

    @Override
    public String priceTag() {
        return super.getName() + " (used) $ " + String.format("%.2f", super.getPrice()) + " (Manufacture Date: " + manufacturerDate.format(fmt) + ")";
    }
}
