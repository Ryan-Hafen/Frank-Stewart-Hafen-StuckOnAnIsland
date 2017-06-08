/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.stuckOnAnIsland.view;

import java.util.Scanner;

/**
 *
 * @author Adam Frank
 */
public class CollectResourceView {
    
        private String promptMessage;
    
    public CollectResourceView() {
            

                
        this.promptMessage =     "\n****************************************************************"
                                + "\n*                                                              *"                                
                                + "\nW - Bottle of Water "
                                + "\nF - Flashlight "
                                + "\nT - Tarp "
                                + "\nV - Vines "                       
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
                System.out.println("\nInvalid value: value must be W, F, T or V");
                continue;
            }
            
            break; // end the loop
        }
        
        return value; // return the value entered
    }

    private boolean doAction(String menuOption) {
        menuOption = menuOption.toUpperCase(); //convert choice to upper case
            return false;
        
        
        
    }

   void collectResource(String resourceAdded) {
       
       
   }
    
    
}
