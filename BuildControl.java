/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.stuckOnAnIsland.control;

/**
 * @author Ryan Hafen
 * @author John Stewart
 */
public class BuildControl {
    
    public enum SceneType {
    vine,
    wood;
    
    public double calcWoodNeeded(double amountInInventory, double amountRequired) {
        if (amountInInventory < 0 || amountInInventory > 100) {
                throw new Exception();
        }
        if (amountRequired < 0 || amountRequired > 100) {
                throw new Exception();
        }
        double woodNeeded = amountRequired - amountInInventory;
                
        return woodNeeded;
    }
    }
    
    public double calcVineNeeded(double amountInInventory, double amountRequired) {
        try {
        if (amountInInventory < 0 || amountInInventory > 100) {
                throw new Exception();
        }
        if (amountRequired < 0 || amountRequired > 100) {
                throw new Exception();
        }
        double vineNeeded = amountRequired - amountInInventory;
                
        return vineNeeded;
    }
    
    
    catch (Exception e){
        System.out.println("I'm sorry,you can't do that, please try again.");
    }
    finally {
        System.out.println("Great job!");
        }
}
    
   



