/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.stuckOnAnIsland.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author RyanHafen
 */
public class WreckageInventory implements Serializable{
    private String description;
    private double healthPoints;
    private int inventoryQuantity;
    private double inventorySize;

    public WreckageInventory() {
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(double healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getInventoryQuantity() {
        return inventoryQuantity;
    }

    public void setInventoryQuantity(int inventoryQuantity) {
        this.inventoryQuantity = inventoryQuantity;
    }

    public double getInventorySize() {
        return inventorySize;
    }

    public void setInventorySize(double inventorySize) {
        this.inventorySize = inventorySize;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.description);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.healthPoints) ^ (Double.doubleToLongBits(this.healthPoints) >>> 32));
        hash = 37 * hash + this.inventoryQuantity;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.inventorySize) ^ (Double.doubleToLongBits(this.inventorySize) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final WreckageInventory other = (WreckageInventory) obj;
        if (Double.doubleToLongBits(this.healthPoints) != Double.doubleToLongBits(other.healthPoints)) {
            return false;
        }
        if (this.inventoryQuantity != other.inventoryQuantity) {
            return false;
        }
        if (Double.doubleToLongBits(this.inventorySize) != Double.doubleToLongBits(other.inventorySize)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "WreckageInventory{" + "description=" + description + ", healthPoints=" + healthPoints + ", inventoryQuantity=" + inventoryQuantity + ", inventorySize=" + inventorySize + '}';
    }
}
