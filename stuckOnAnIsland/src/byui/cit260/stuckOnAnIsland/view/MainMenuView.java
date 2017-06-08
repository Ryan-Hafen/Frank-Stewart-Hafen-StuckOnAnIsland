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
 * @author hafenr
 */
public class MainMenuView {
    
    private String promptMessage;
    
    public MainMenuView() {
            

                
        this.promptMessage =     "\n****************************************************************"
                                + "\n*                                                              *"
                                + "\nN - New game "
                                + "\nC - Continue game "
                                + "\nR - Restart game "
                                + "\nH - Help "
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
                System.out.println("\nInvalid value: value must be N, C, R, H, or Q");
                continue;
            }
            
            break; // end the loop
        }
        
        return value; // return the value entered
    }

    private boolean doAction(String menuOption) {
        menuOption = menuOption.toUpperCase(); //convert choice to upper case
        
        switch (menuOption) {
            case "N": // create and start a new game
                this.startNewGame();
                break;
            case "C": // get and start an existing game
                this.startExistingGame();
                break;
            case "R": //display the help menu
                this.restartGame();
                break;
            case "H": // save the current game
                this.displayHelpMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void startNewGame() {
        GameControl.createNewGame(StuckOnAnIsland.getPlayer());
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void startExistingGame() {
        System.out.println("\n*** startExistingGame function called ***");
    }

    private void displayHelpMenu() {
        // display the Help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenu();
    }

    private void restartGame() {
        System.out.println("\n*** restartGame function called ***");
    }
    
}
