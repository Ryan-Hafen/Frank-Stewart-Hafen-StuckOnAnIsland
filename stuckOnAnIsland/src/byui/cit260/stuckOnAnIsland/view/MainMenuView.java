/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.stuckOnAnIsland.view;

import buyi.cit260.stuckOnAnIsland.control.GameControl;

// ******* removed when implemented view super class *******
//import java.util.Scanner;-- removed when implemented view super class
import stuckonanisland.StuckOnAnIsland;

/**
 *
 * @author hafenr
 */
public class MainMenuView extends View{

// ******* removed when implemented view super class *******    
//    private String promptMessage;
    
    public MainMenuView() {
//        this.promptMessage =      -- removed when implemented view super class
          super(  "\n****************************************************************"
                + "\n*  Main Menu                                                   *"
                + "\n*                                                              *"
                + "\n*  N - New game                                                *"
                + "\n*  C - Continue game                                           *"
                + "\n*  R - Restart game                                            *"
                + "\n*  H - Help                                                    *"
                + "\n*  Q - Quit                                                    *"
                + "\n*                                                              *"
                + "\n*  Please enter your selection:                                *"
                + "\n*                                                              *"
                + "\n****************************************************************"
                );
    }

// ******* removed when implemented view super class *******    
//    void displayMainMenuView() {
//        boolean done = false; //set flag to not done
//        do {
//            // promplt for and get players name
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
//                System.out.println("\nInvalid value: value must be N, C, R, H, or Q");
//                continue;
//            }
//            break; // end the loop
//        }
//        
//        return value; // return the value entered
//    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
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
                //System.out.println("\n*** Invalid selection *** Try again");
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void startNewGame() {
        GameControl.createNewGame(StuckOnAnIsland.getPlayer());
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void startExistingGame() {
        System.out.println("\n*** startExistingGame function called ***");
    }

    private void displayHelpMenu() {
        // display the Help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void restartGame() {
        System.out.println("\n*** restartGame function called ***");
    }
    
}
