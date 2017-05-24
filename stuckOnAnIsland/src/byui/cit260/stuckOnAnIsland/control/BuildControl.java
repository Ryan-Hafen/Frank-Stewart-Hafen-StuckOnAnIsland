/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.stuckOnAnIsland.control;

/**
 *
 * @author RyanHafen
 */
public class BuildControl {
    
    public double calcWoodNeeded(double amountInInventory, double amountRequired) {
        if (amountInInventory < 0 || amountInInventory > 100) {
                return -1;
        }
        if (amountRequired < 0 || amountRequired > 100) {
                return -1;
        }
        double woodNeeded = amountRequired - amountInInventory;
                
        return woodNeeded;
    }
    
    public double calcVineNeeded(double amountInInventory, double amountRequired) {
        if (amountInInventory < 0 || amountInInventory > 100) {
                return -1;
        }
        if (amountRequired < 0 || amountRequired > 100) {
                return -1;
        }
        double vineNeeded = amountRequired - amountInInventory;
                
        return vineNeeded;
    }
}
