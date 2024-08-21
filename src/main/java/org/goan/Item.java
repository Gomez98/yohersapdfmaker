package org.goan;

public class Item {
    String measure;
    String code;
    String description;
    double quantity;
    double unitValue;
    double unitPrice;
    double total;

    public Item() {
    }

    public Item(String measure, String code, String description, double quantity, double unitValue, double unitPrice, double total) {
        this.measure = measure;
        this.code = code;
        this.description = description;
        this.quantity = quantity;
        this.unitValue = unitValue;
        this.unitPrice = unitPrice;
        this.total = total;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getUnitValue() {
        return unitValue;
    }

    public void setUnitValue(double unitValue) {
        this.unitValue = unitValue;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
