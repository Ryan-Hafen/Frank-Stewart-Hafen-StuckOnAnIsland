/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.stuckOnAnIsland.view;

import buyi.cit260.stuckOnAnIsland.control.GameControl;
import byui.cit260.stuckOnAnIsland.model.Player;
import java.io.*;

// ******* removed when implemented view super class *******  
//import java.util.Scanner;
/**
 *
 * @author Ryan-Hafen
 */
public class StartProgramView extends View {
// ******* removed when implemented view super class *******  
//    private String promptMessage;
//    private String headerMessage;

    public StartProgramView() {
// ******* removed when implemented view super class *******       
//        System.out.println
        super("\n********************************************************"
                + "\n********************************************************"
                + "\n*                                                      *"
                + "\n*                                                      *"
                + "\n*       XXXX    XXXXXX  XX    XX    XXXX   XX   XX     *"
                + "\n*     XX    XX    XX    XX    XX  XX    XX XX  XX      *"
                + "\n*     XXX         XX    XX    XX  XX       XX XX       *"
                + "\n*       XXXX      XX    XX    XX  XX       XXX         *"
                + "\n*          XXX    XX    XX    XX  XX       XXXX        *"
                + "\n*     XX    XX    XX    XX    XX  XX    XX XX  XX      *"
                + "\n*       XXXX      XX      XXXX      XXXX   XX   XX     *"
                + "\n*                                                      *"
                + "\n*                                                      *"
                + "\n*       XXXX    XX     XX        XXXX    XX     XX     *"
                + "\n*     XX    XX  XXX    XX      XX    XX  XXX    XX     *"
                + "\n*     XX    XX  XXXX   XX      XX    XX  XXXX   XX     *"
                + "\n*     XX    XX  XX XX  XX      XXXXXXXX  XX XX  XX     *"
                + "\n*     XX    XX  XX  XX XX      XXXXXXXX  XX  XX XX     *"
                + "\n*     XX    XX  XX    XXX      XX    XX  XX    XXX     *"
                + "\n*       XXXX    XX     XX      XX    XX  XX     XX     *"
                + "\n*                                                      *"
                + "\n*                                                      *"
                + "\n*      XX   XXXX   XX      XXXX   XX     XX XXXX       *"
                + "\n*      XX XX    XX XX    XX    XX XXX    XX XX  XX     *"
                + "\n*      XX XXX      XX    XX    XX XXXX   XX XX  XX     *"
                + "\n*      XX   XXXX   XX    XXXXXXXX XX XX  XX XX  XX     *"
                + "\n*      XX      XXX XX    XXXXXXXX XX  XX XX XX  XX     *"
                + "\n*      XX XX    XX XX    XX    XX XX    XXX XX  XX     *"
                + "\n*      XX   XXXX   XXXXX XX    XX XX     XX XXXX       *"
                + "\n*                                                      *"
                + "\n*                                                      *"
                + "\n********************************************************"
                + "\n********************************************************"
                + "                                                            "
                + "                                                            "
                + "\n**********************************************************"
                + "\n*                                                        *"
                + "\n* Your boat has crashed! You are STUCK ON AN ISLAND...   *"
                + "\n* The only way to survive is to stay alive.              *"
                + "\n* Build a raft to leave the island,                      *"
                + "\n* but there are dangers along the way.                   *"
                + "\n* Find resources, find wood and vines to build the raft, *"
                + "\n* Your choices will determine whether you live or die.   *"
                + "\n* Get ready to take an adventure!                        *"
                + "\n*                                                        *"
                + "\n**********************************************************"
                + "                                                            "
                + "                                                            "
                + "\nPlease enter you name:                                    ");
    }
// ******* removed when implemented view super class *******  
//    private void displayBanner() {
//        System.out.println(  
//        );
//    }

// ******* removed when implemented view super class *******      
//    public void displayStartProgramView() {
//        //System.out.println("\n*** displayStartProgram() function called ***");
//                boolean done = false;
//                do {
//                    //Prompt for and get player name
//                    String playersName = this.getPlayersName();
//                    if(playersName.toUpperCase().equals("Q")) //user wants to quit
//                        return; //exit game
//                    
//                    //do the requested action and display the next view
//                    done = this.doAction(playersName);
//                } while (!done);
//    }
// ******* removed when implemented view super class *******      
//    private String getPlayersName() {
//        //System.out.println("\n*** getPlayersName() called **");
//        //return "Joe";
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
//            if (value.length() < 1) { // value is blank
//                System.out.println("\nInvalid value: value can not be blank");
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
        //System.out.println("\n*** doAction() called **");
        //return true;
        if (value.length() < 2) {
            //System.out.println("\nInvlaid players name: "
            //+ "Then name must be greater than one character in length");
            ErrorView.display(this.getClass().getName(),
                    "\nInvlaid players name: "
                    + "Then name must be greater than one character in length");
            return false;
        }
        // call createPlayer() control function
        Player player = GameControl.createPlayer(value);

        if (player == null) { //if unsuccessful
            //System.out.println("\nError creating the player.");
            ErrorView.display(this.getClass().getName(),
                    "\nError creating the player.");
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
// ******* removed when implemented view super class *******        
//        mainMenuView.displayMainMenuView();
        mainMenuView.display();
    }
}
