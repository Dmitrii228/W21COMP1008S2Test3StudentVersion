/**
 * Author: Dmitrii Demin
 * Id: 200464709
 */
package models;

import java.util.ArrayList;
import java.util.Locale;

public class SportStore {
    private String address;
    private ArrayList<InventoryItem> inventory;

    public SportStore(String address, ArrayList<InventoryItem> inventory) {
        setAddress(address);
        this.inventory = inventory;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        address = address.trim();
        if (address.length() >= 5){
            this.address = address;
        }
        else
            throw new IllegalArgumentException("The address must be at least 5 characters");
    }

    public ArrayList<InventoryItem> getInventory() {
        return inventory;
    }

    public void sellItem(InventoryItem item, int quantitySold)
    {
        item.setQuantitySold(quantitySold);
    }

    public double calculateProfit()
    {
        return -1;
    }
}
