/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.stuckOnAnIsland.model;

import java.util.Objects;
import java.io.Serializable;

/**
 *
 * @author RyanHafen
 */
public class Player implements Serializable {
    private String name;
    private double besTime;

    public Player() {
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBesTime() {
        return besTime;
    }

    public void setBesTime(double besTime) {
        this.besTime = besTime;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.name);
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.besTime) ^ (Double.doubleToLongBits(this.besTime) >>> 32));
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
        final Player other = (Player) obj;
        if (Double.doubleToLongBits(this.besTime) != Double.doubleToLongBits(other.besTime)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", besTime=" + besTime + '}';
    }
    
    
    
}
