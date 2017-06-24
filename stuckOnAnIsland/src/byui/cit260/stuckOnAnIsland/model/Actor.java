/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.stuckOnAnIsland.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;



/**
 *
 * @author Adam Frank
 */
public enum Actor implements Serializable {
//    private String actorName;

    Lehi("He is the prophet and leader fo the family");
    
    private final String description;
    private final Point currentCoordinate;
    private final double currentHealth;
//    private final int y;
//    private final int x;

    Actor(String description) {
        this.description = description;
        currentCoordinate = new Point(1,1);
        currentHealth = 100;
    }
    public String getDescription() {
        return description;
    }
    public Point getCurrentCoordinate() {
        return currentCoordinate;
    }

    public double getCurrentHealth() {
        return currentHealth;
    }
}