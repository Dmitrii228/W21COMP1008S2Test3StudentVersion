/**
 * Author: Dmitrii Demin
 * Id: 200464709
 */
package models;

public abstract class InventoryItem {

    private int quantityInStock, quantitySold;
    private double purchasePrice, sellingPrice;

    public InventoryItem(double purchasePrice, double sellingPrice, int quantityInStock)
    {
        setPurchasePrice(purchasePrice);
        setSellingPrice(sellingPrice);
        setQuantityInStock(quantityInStock);
        quantitySold = 0;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        if (quantityInStock>=0){
            this.quantityInStock = quantityInStock;
        }
        else
            throw new IllegalArgumentException("The quantity in stock can not be less than 0!");
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(int quantitySold) {
        if (quantitySold<=quantityInStock){
            quantityInStock = quantityInStock - quantitySold;
            this.quantitySold =  this.quantitySold + quantitySold;
        }
        else
            throw new IllegalArgumentException("The quantity sold can not be greater than the quantity in stock !");
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        if (purchasePrice >=0){
            this.purchasePrice = purchasePrice;
        }
        else
            throw new IllegalArgumentException("The purchase price should be equal or greater than 0!");
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        if (sellingPrice > purchasePrice){
            this.sellingPrice = sellingPrice;
        }
        else{
            throw new IllegalArgumentException("The selling price must be greater than the purchase price!");
        }
    }

    public double getProfit()
    {
        return -1;
    }
}
