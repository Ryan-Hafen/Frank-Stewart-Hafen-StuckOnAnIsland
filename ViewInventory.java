/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.stuckOnAnIsland.view;

import buyi.cit260.stuckOnAnIsland.control.GameControl;
import java.util.Scanner;
import stuckonanisland.StuckOnAnIsland;

/**
 *
 * @author germa_000
 */
public class ViewInventoryView {
    
    private String promptMessage;
    
    public ViewInventoryView() {
            

                
        this.promptMessage =     "\n****************************************************************"
                                + "\n*                                                              *"
                                + "\nV - View Inventory "
                                + "\nR - Quantity of Rope "
                                + "\nB - Linear Feet of Bamboo "
                                + "\nS - Save game "
                                + "\nQ - Quit "
                                + "\nPlease enter your selection: "
                                + "\n*                                                              *"
                                + "\n****************************************************************";
    }
    
    void displayViewInventoryView() {
        boolean done = false; //set flag to not done
        do {
            // prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) //user wants to quit
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
                System.out.println("\nInvalid value: value must be V, R, B, S, or Q");
                continue;
            }
            
            break; // end the loop
        }
        
        return value; // return the value entered
    }

    private boolean doAction(String menuOption) {
        menuOption = menuOption.toUpperCase(); //convert choice to upper case
        
        switch (menuOption) {
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

    private void viewInventory() {
        Inventory.createInventory (Inventory.getInventory());
        
        // display inventory list
        ViewInventoryView viewInventory = new ViewInventoryView();
        viewinventory.displayInventoryMenu();
    }

    private void ropeInventory() {
        System.out.println("\n*** ropeInventory function called ***");
    }

    private void bambooInventory {
        // display bamboo resource
        BambooInventoryView bambooInventoryMenu = new BambooInentoryView();
        bambooinventoryMenu.displaybambooinventoryMenu();
    }

    private void saveGame() {
        System.out.println("\n*** saveGame function called ***");
    }
    
}
