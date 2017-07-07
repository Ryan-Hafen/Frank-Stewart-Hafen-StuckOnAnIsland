/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.stuckOnAnIsland.control;

import buyi.cit260.stuckOnAnIsland.exceptions.BuildControlException;

/**
 *
 * @author RyanHafen
 */
public class BuildControl {

    public double calcWoodNeeded(double amountInInventory,
            double amountRequired) throws BuildControlException {
        if (amountInInventory < 0 || amountInInventory > 100) {
            throw new BuildControlException("Amount in inventory out of bounds");
            //return -1;
        }
        if (amountRequired < 0 || amountRequired > 100) {
            throw new BuildControlException("Amount required out of bounds");
            //return -1;
        }
        double woodNeeded = amountRequired - amountInInventory;

        return woodNeeded;
    }

    public double calcVineNeeded(double amountInInventory, 
            double amountRequired) throws BuildControlException {
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
