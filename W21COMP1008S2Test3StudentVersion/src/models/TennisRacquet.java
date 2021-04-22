/**
 * Author: Dmitrii Demin
 * Id: 200464709
 */
package models;

import Utilities.DBUtility;

public class TennisRacquet  {
    private double weight;  //240-310
    private String headSize; //midsize, midplus, oversize, super oversize
    private String brand; //Head, Babolat, Dunlop, Yonex
    private String model;

    public TennisRacquet(String brand, String model, double weight, String headSize, double purchasePrice, double sellingPrice, int quantityInStock) {
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
    }

    public String getHeadSize() {
        return headSize;
    }

    public void setHeadSize(String headSize) {
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
}
