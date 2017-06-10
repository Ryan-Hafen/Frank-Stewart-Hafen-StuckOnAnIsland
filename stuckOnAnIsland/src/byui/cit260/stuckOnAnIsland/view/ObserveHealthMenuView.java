/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package byui.cit260.stuckOnAnIsland.view;

/**
 *
 * @author RyanHafen
 */
//class ObserveHealthMenuView {

 //   void displayObserveHealthMenu() {
//        System.out.println("\n*** displayObserveHealthMenu() stub function called ***");
 //   }
    
//}
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
public class ObserveHealthMenuView {
    
    private String promptMessage;
    
    public ObserveHealthMenuView() {
            

                
        this.promptMessage =     "\n****************************************************************"
                                + "\n*                                                              *"
                                + "\nH - View Health Status "
                                + "\nR - Restore Health "
                                + "\nS - Save game "
                                + "\nQ - Quit "
                                + "\nPlease enter your selection: "
                                + "\n*                                                              *"
                                + "\n****************************************************************";
    }
    
    void displayObserveHealthMenu() {
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
            case "H": // view health status
                this.viewHealth();
                break;
            case "R": // restore health
                this.restoreHealth();
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

    private void viewHealth() {
        GameControl.createHealth ();
        
        // display ealth status
        HealthView viewHealth = new HealthView();
        viewHealth.displayCurrentHealth();
    }

    private void saveGame() {
        System.out.println("\n*** saveGame function called ***");
    }

    private void restoreHealth() {
        System.out.println("\n*** restoreHealth function called ***");
    }
    
}
