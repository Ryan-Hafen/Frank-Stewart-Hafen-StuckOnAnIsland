/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.stuckOnAnIsland.control;

import byui.cit260.stuckOnAnIsland.model.Backpack;
import stuckonanisland.StuckOnAnIsland;
import java.io.*;
import byui.cit260.stuckOnAnIsland.view.View;
import java.util.ArrayList;

/**
 *
 * @author RyanHafen
 */
public class BackpackControl implements Serializable {

    boolean done = false;
    private ArrayList<Backpack> backpack;

    public BackpackControl() {
        backpack = new ArrayList<Backpack>();
    }

    public ArrayList<Backpack> getItems() {
        return backpack;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Backpack singleItem : backpack) {
            builder.append("   ").append(backpack.toString()).append("\n|");
        }

        return builder.toString();
    }

    public void getTools() {

        System.out.println("\n*** getTools() stub function called ***");
        //this.console.println("\n*** getTools() stub function called ***");
    }

    public static void createInventory() {
        System.out.println("\n*** createInventory() stub function called ***");
    }

    public static Backpack createBackpack() {
        System.out.println("\n*** createBackpack() stub function called ***");

        return null;
    }

    public void LoadBackpack(){
    Backpack yourBackpack = new Backpack();

    //yourBackpack.getItems().add(new Backpack("Knife",1,1));
      yourBackpack.getResourceDescription();
      yourBackpack.getResourceCapacity();
      yourBackpack.getResourceQuantity();
  
      for(int i = 0; i < 3; i++){
          System.out.println(backpack);
      }
    }

}
