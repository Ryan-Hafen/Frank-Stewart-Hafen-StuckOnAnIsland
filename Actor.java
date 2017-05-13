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
 * @author Adam Frank
 */
public class Actor implements Serializable{
    private String actorName;
    private int currentCoordinate;
    private double currentHealth;
    private int y;
    private int x;

    public Actor() {
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public int getCurrentCoordinate(int x, int y) {
        return currentCoordinate;
    }

    public void setCurrentCoordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(double currentHealth) {
        this.currentHealth = currentHealth;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.actorName);
        hash = 89 * hash + this.currentCoordinate;
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.currentHealth) ^ (Double.doubleToLongBits(this.currentHealth) >>> 32));
        hash = 89 * hash + this.y;
        hash = 89 * hash + this.x;
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
        final Actor other = (Actor) obj;
        if (this.currentCoordinate != other.currentCoordinate) {
            return false;
        }
        if (Double.doubleToLongBits(this.currentHealth) != Double.doubleToLongBits(other.currentHealth)) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        if (this.x != other.x) {
            return false;
        }
        if (!Objects.equals(this.actorName, other.actorName)) {
            return false;
        }
        return true;
    }
 
    
    @Override
    public String toString() {
        return "Actor{" + "actorName=" + actorName + ", currentCoordinate=" + currentCoordinate + ", currentHealth=" + currentHealth + '}';
    }
     
}
