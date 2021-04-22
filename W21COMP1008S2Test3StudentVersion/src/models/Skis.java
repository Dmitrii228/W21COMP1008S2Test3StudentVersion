/**
 * Author: Dmitrii Demin
 * Id: 200464709
 */
package models;

import Utilities.DBUtility;

public class Skis extends InventoryItem{
    private String brand, model;
    private int length;

    public Skis(String brand, String model, int length,double purchasePrice, double sellingPrice, int quantityInStock) {
        super(purchasePrice, sellingPrice, quantityInStock);
        setBrand(brand);
        setModel(model);
        setLength(length);
        setPurchasePrice(purchasePrice);
        setSellingPrice(sellingPrice);
        setQuantityInStock(quantityInStock);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (DBUtility.getSkiBrands().contains(brand)){
            this.brand = brand;
        }
        else
            throw new IllegalArgumentException("The brand is invalid");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length >= 60 && length <= 220){
            this.length = length;
        }
        else
            throw new IllegalArgumentException("The length is invalid, should be in the range between 60 and 220!");
    }
}
