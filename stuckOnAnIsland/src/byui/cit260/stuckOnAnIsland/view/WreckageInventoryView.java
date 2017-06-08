/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.stuckOnAnIsland.view;

import buyi.cit260.stuckOnAnIsland.control.GameControl;
import byui.cit260.stuckOnAnIsland.model.WreckageInventory;
import java.io.Serializable;
import java.util.Scanner;
import stuckonanisland.StuckOnAnIsland;

/**
 *
 * @author Adam Frank
 */
public class WreckageInventoryView implements Serializable  {
    
    private String promptMessage;
    
    public WreckageInventoryView() {
            

                
        this.promptMessage =     "\n****************************************************************"
                                + "\n*                                                              *"
                                + "\nC - Canned Food "
                                + "\nW - Bottle of Water "
                                + "\nL - Lighter "
                                + "\nF - Flashlight "
                                + "\nM - Multi-tool "
                                + "\nD - Dry Food "
                                + "\nK - Knife "
                                + "\nH - Fishing Hooks "
                                + "\nT - Tarp "
                                + "\nP - Buckets "
                                + "\nQ - Quit "
                                + "\nPlease enter your selection: "
                                + "\n*                                                              *"
                                + "\n****************************************************************";
    }
    
    void displayMainMenuView() {
        boolean done = false; //set flag to not done
        do {
            // promplt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) //user wants to quit the wreckage menu
                return; // exit the game
            
            // do the requested action and dispaly the next view
            done = this.doAction(menuOption);
        } while (!done);
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) {
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leadnig and trailing blanks
            
            if (value.length() < 1 ) { // value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            else if (value.length() > 1 ) { // value is blank
                System.out.println("\nInvalid value: value must be C, W, L, F, M, D, K, H, T, P, or Q");
                continue;
            }
            
            break; // end the loop
        }
        
        return value; // return the value entered
    }

    private boolean doAction(String menuOption) {
        menuOption = menuOption.toUpperCase(); //convert choice to upper case
        
        
        switch (menuOption) {
            case "C": // pick up canned food
                System.out.println("you picked up canned food");
                break;
            case "W": //pick up water
                System.out.println("you picked up a water bottle");
                break;
            case "L": //pick up lighter
                System.out.println("you picked up a lighter");
                break;
            case "F": //pick up flashlight
                System.out.println("you picked up a flashlight");
                break;
            case "M": //pick up multi-tool
                System.out.println("you picked up a multi-tool");
                break;
            case "D": //pick up dry food
                System.out.println("you picked up dry food");
                break;
            case "K": //pick up knife
                System.out.println("you picked up a knife");
                break;
            case "H": //pick up fishing hooks
                System.out.println("you picked up fishing hooks");
                break;
            case "T": //pick up tarp
                System.out.println("you picked up a tarp");
                break;
            case "P": //pick up buckets
                System.out.println("you picked up buckets");
                break;
            case "Q": //quit the wreckage menu
                System.out.println("you closed the wreckage inventory menu");
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

   void addResource(String resourceAdded) {
       
       
   }
    
}
