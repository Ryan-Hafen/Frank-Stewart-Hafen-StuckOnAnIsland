/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.stuckOnAnIsland.view;

import buyi.cit260.stuckOnAnIsland.control.BackpackControl;
import buyi.cit260.stuckOnAnIsland.control.GameControl;
import byui.cit260.stuckOnAnIsland.model.Backpack;
import java.util.Scanner;
import stuckonanisland.StuckOnAnIsland;

/**
 *
 * @author Adam Frank
 */
public class ViewInventoryView extends View{
    
//    private String promptMessage;
    
    public ViewInventoryView() {
//        this.promptMessage =    
        super( "\n********************************************************"
             + "\n*  Inventory Menu                                      *"
             + "\n*                                                      *"
             + "\n*  V - View Inventory                                  *"
             + "\n*  R - Quantity of Rope                                *"
             + "\n*  B - Linear Feet of Bamboo                           *"
             + "\n*  S - Save game                                       *"
             + "\n*  Q - Quit                                            *"
             + "\n*  Please enter your selection:                        *"
             + "\n*                                                      *"
             + "\n********************************************************"
        );
    }
    
// ******* removed when implemented view super class *******  
//    
//    void displayViewInventoryMenu() {
//        boolean done = false; //set flag to not done
//        do {
//            // prompt for and get players name
//            String menuOption = this.getMenuOption();
//            if (menuOption.toUpperCase().equals("Q")) //user wants to quit
//                return; // exit the game
//            
//            // do the requested action and dispaly the next view
//            done = this.doAction(menuOption);
//        } while (!done);
//    }

// ******* removed when implemented view super class *******  
    
//    private String getMenuOption() {
//        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
//        String value = ""; // value to be returned
//        boolean valid = false; // initialize to not valid
//        
//        while (!valid) {
//            System.out.println("\n" + this.promptMessage);
//            
//            value = keyboard.nextLine(); // get next line typed on keyboard
//            value = value.trim(); // trim off leadnig and trailing blanks
//            
//            if (value.length() < 1 ) { // value is blank
//                System.out.println("\nInvalid value: value can not be blank");
//                continue;
//            }
//            else if (value.length() > 1 ) { // value is blank
//                System.out.println("\nInvalid value: value must be V, R, B, S, or Q");
//                continue;
//            }
//            
//            break; // end the loop
//        }
//        
//        return value; // return the value entered
//    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
            case "V": // view inventory
                this.viewInventory();
                break;
            case "R": // calculate length of rope in inventory
                this.ropeInventory();
                break;
            case "B": // claculate length of bamboo in inventory
                this.bambooInventory();
                break;
            case "S": // save the current game
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    //Adam's individual assignment array
    private void viewInventory() {
        //System.out.println("\n*** viewInventory function called ***");
        String[] backPackList = {"Flashlight", "Bottle of Water", "Knife"};
        listBackPackItems(backPackList);
    }

    private void listBackPackItems(String[] backPackList) {
        int i = 1;
        for (String lists : backPackList) {
            System.out.println("List item #" + i + " is: " + backPackList[i-1]);
            i++;
    }
        System.out.println("You have " + (i-1) + " items in your backpack!");
    }

    
    private void ropeInventory() {
        System.out.println("\n*** ropeInventory function called ***");
    }

    private void bambooInventory() {
        System.out.println("\n*** bambooInventory function called ***");
    }

    private void saveGame() {
        System.out.println("\n*** saveGame function called ***");
    }
    
}
