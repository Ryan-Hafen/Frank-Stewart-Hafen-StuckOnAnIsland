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
                                + "\nM - How to move "
                                + "\nT - How to build tools "
                                + "\nF - How to fix the raft "
                                + "\nH - How to collect inventory "
                                + "\nE - Exit to Main Menu "
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
                System.out.println("\nInvalid value: value must be G, M, T, F, H, or E");
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
                System.out.println("\n**** Your goal is to build a raft and escape from the island before you run out of resources? ****");
                break;
            case "M": // How to move
                System.out.println("\n**** Add text for How to move ****");
                break;
            case "T": // How to build tools
                System.out.println("\n**** Add text for Estimating the amount of resources ****");
                break;
            case "F": // How to fix raft
                System.out.println("\n**** Add text for Harvesting resources ****");
                break;
            case "H": // How to collect inventory
                System.out.println("\n**** Add text for Delivering resources to warehouse ****");
                break;
            case "E": // Exit to Main Menu
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
