package com.joslabs.jospipa.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class ProductModelJava {
    @PrimaryKey
    String itemId;
    String   itemName;
    String type;
    String quantity;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String temName) {
        this.itemName = temName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public ProductModelJava() {
    }

    public ProductModelJava(String itemId, String itemName, String type, String quantity) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.type = type;
        this.quantity = quantity;
    }
}
