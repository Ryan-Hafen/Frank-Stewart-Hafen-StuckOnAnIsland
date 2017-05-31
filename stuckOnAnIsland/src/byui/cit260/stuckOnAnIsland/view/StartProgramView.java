/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.stuckOnAnIsland.view;

import buyi.cit260.stuckOnAnIsland.control.GameControl;
import byui.cit260.stuckOnAnIsland.model.Player;
import java.util.Scanner;

/**
 *
 * @author Ryan-Hafen
 */
public class StartProgramView {
    
    private String promptMessage;
    
    public StartProgramView() {
        this.promptMessage = "\nPlease enter you name: ";
        this.displayBanner();
    }

    private void displayBanner() {
        System.out.println(
                 "\n****************************************************************"
                +"\n*                                                              *"
                +"\n The Description goes here                                     *"
                +"\n*                                                              *"
                +"\n****************************************************************"
        );
    }

    public void displayStartProgramView() {
        //System.out.println("\n*** displayStartProgram() function called ***");
                boolean done = false;
                do {
                    //Prompt for and get player name
                    String playersName = this.getPlayersName();
                    if(playersName.toUpperCase().equals("Q")) //user wants to quit
                        return; //exit game
                    
                    //do the requested action and display the next view
                    done = this.doAction(playersName);
                } while (!done);
    }

    private String getPlayersName() {
        //System.out.println("\n*** getPlayersName() called **");
        //return "Joe";
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) {
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leadnig and trailing blanks
            
            if (value.length() < 1) { // value is blank
                System.out.println("\ninvalid value: value can not be blank");
                continue;
            }
            
            break; // end the loop
        }
        
        return value; // return the value entered
    }

    private boolean doAction(String playersName) {
        //System.out.println("\n*** doAction() called **");
        //return true;
        
        if (playersName.length() < 2) {
            System.out.println("\nInvlaid players name: "
                    + "Then name must be greater than one cahracter in length");
            return false;
        }
        // call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) { //if unsuccessful
            System.out.println("\nError creating the player.");
            return false;
        }
        
        // display next view
        this.displayNextView(player);
        
        return true; // success !
    }

    private void displayNextView(Player player) {
         // display a custom welcome message
        System.out.println("\n============================================================"
                            + "\n Welcome to the game " + player.getName()
                            + "\n We hope you have a lot of fun!"
                            + "\n========================================================="
                            );
        
        // Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
                
        // Display the main menu view
        mainMenuView.displayMainMenuView();
    }
}
