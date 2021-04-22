/**
 * Author: Dmitrii Demin
 * Id: 200464709
 */
package models;

import Utilities.DBUtility;

public class Skis {
    private String brand, model;
    private int length;

    public Skis(String brand, String model, int length,double purchasePrice, double sellingPrice, int quantityInStock) {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
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
    }
}
