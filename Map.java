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
 * @author germa_000
 */
public class Map implements Serializable {

private String resourceDescription;
private double resourceQuantity;
private double resourceCapacity;

    public Map() {
    }

    public String getResourceDescription() {
        return resourceDescription;
    }

    public void setResourceDescription(String resourceDescription) {
        this.resourceDescription = resourceDescription;
    }

    public double getResourceQuantity() {
        return resourceQuantity;
    }

    public void setResourceQuantity(double resourceQuantity) {
        this.resourceQuantity = resourceQuantity;
    }

    public double getResourceCapacity() {
        return resourceCapacity;
    }

    public void setResourceCapacity(double resourceCapacity) {
        this.resourceCapacity = resourceCapacity;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.resourceDescription);
        hash = 73 * hash + (int) (Double.doubleToLongBits(this.resourceQuantity) ^ (Double.doubleToLongBits(this.resourceQuantity) >>> 32));
        hash = 73 * hash + (int) (Double.doubleToLongBits(this.resourceCapacity) ^ (Double.doubleToLongBits(this.resourceCapacity) >>> 32));
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
        final Map other = (Map) obj;
        if (Double.doubleToLongBits(this.resourceQuantity) != Double.doubleToLongBits(other.resourceQuantity)) {
            return false;
        }
        if (Double.doubleToLongBits(this.resourceCapacity) != Double.doubleToLongBits(other.resourceCapacity)) {
            return false;
        }
        if (!Objects.equals(this.resourceDescription, other.resourceDescription)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "resourceDescription=" + resourceDescription + ", resourceQuantity=" + resourceQuantity + ", resourceCapacity=" + resourceCapacity + '}';
    }

}