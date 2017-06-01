/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.stuckOnAnIsland.control;
import java.lang.Math;

/**
 *
 * @author Adam Frank
 */
public class MapControl {
    
    
    private double endLocation;
    private double startLocation;
    private double startHealth;
    private double endHealth;

    public double getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(double endLocation) {
        this.endLocation = endLocation;
    }

    public double getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(double startLocation) {
        this.startLocation = startLocation;
    }

    public double getStartHealth() {
        return startHealth;
    }

    public void setStartHealth(double startHealth) {
        this.startHealth = startHealth;
    }

    public double getEndHealth() {
        return endHealth;
    }

    public void setEndHealth(double endHealth) {
        this.endHealth = endHealth;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.endLocation) ^ (Double.doubleToLongBits(this.endLocation) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.startLocation) ^ (Double.doubleToLongBits(this.startLocation) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.startHealth) ^ (Double.doubleToLongBits(this.startHealth) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.endHealth) ^ (Double.doubleToLongBits(this.endHealth) >>> 32));
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
        final MapControl other = (MapControl) obj;
        if (Double.doubleToLongBits(this.endLocation) != Double.doubleToLongBits(other.endLocation)) {
            return false;
        }
        if (Double.doubleToLongBits(this.startLocation) != Double.doubleToLongBits(other.startLocation)) {
            return false;
        }
        if (Double.doubleToLongBits(this.startHealth) != Double.doubleToLongBits(other.startHealth)) {
            return false;
        }
        if (Double.doubleToLongBits(this.endHealth) != Double.doubleToLongBits(other.endHealth)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MapControl{" + "endLocation=" + endLocation + ", startLocation=" + startLocation + ", startHealth=" + startHealth + ", endHealth=" + endHealth + '}';
    }

    
    
    
    public double calcHealthUsed(double startLocation, double endLocation, double startHealth) {
        endHealth = startHealth - Math.abs(endLocation - startLocation);
        if (endHealth < 0.0) 
            {
                return -999.0;
            }
        else 
            {
                return endHealth; 
            }
    }
}
