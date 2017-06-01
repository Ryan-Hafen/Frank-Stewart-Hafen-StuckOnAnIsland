/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.stuckOnAnIsland.view;

import java.util.Scanner;

/**
 *
 * @author hafenr
 */
public class HelpMenuView {
    
    private String promptMessage;
    
    public HelpMenuView() {
        this.promptMessage =     "\n****************************************************************"
                                + "\n*                                                              *"
                                + "\nG - What is the goal of the game? "
                                + "\nM - how to move "
                                + "\nE - Estimating the amount of resources "
                                + "\nH - Harvesting resources "
                                + "\nD - Build the raft "
                                + "\nQ - Return to Main Menu "
                                + "\nPlease enter your selection: "
                                + "\n*                                                              *"
                                + "\n****************************************************************";
    }

    void displayHelpMenu() {
        boolean done = false; //set flag to not done
        
        do {
            // promplt for and get players name
            String helpMenuOption = this.getMenuOption();
            //if (helpMenuOption.toUpperCase().equals("Q")) //user wants to quit
            //    return; // exit the game
            
            // do the requested action and dispaly the next view
            done = this.doAction(helpMenuOption);
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
                System.out.println("\nInvalid value: value must be G, M, E, H, D, or Q");
                continue;
            }
            
            break; // end the loop
        }
        
        return value; // return the value entered
    }

    private boolean doAction(String helpMenuOption) {
        helpMenuOption = helpMenuOption.toUpperCase(); //convert choice to upper case
        
        switch (helpMenuOption) {
            case "G": // What is the goal of the game? 
                System.out.println("\n**** Add text for What is the goal of the game? ****");
                break;
            case "M": // How to move
                System.out.println("\n**** Add text for How to move ****");
                break;
            case "E": // Estimating the amount of resources
                System.out.println("\n**** Add text for Estimating the amount of resources ****");
                break;
            case "H": // Harvesting resources
                System.out.println("\n**** Add text for Harvesting resources ****");
                break;
            case "D": // Delivering resources to warehouse
                System.out.println("\n**** Add text for Delivering resources to warehouse ****");
                break;
            case "Q": // Quit
                // display the game menu
                MainMenuView mainMenuView = new MainMenuView();
                mainMenuView.displayMainMenuView();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    
    
}
