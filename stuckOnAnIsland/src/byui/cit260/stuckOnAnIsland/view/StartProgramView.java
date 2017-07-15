/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.stuckOnAnIsland.view;

import buyi.cit260.stuckOnAnIsland.control.GameControl;
import byui.cit260.stuckOnAnIsland.model.Player;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import stuckonanisland.StuckOnAnIsland;


/**
 *
 * @author Ryan-Hafen
 */

public class StartProgramView {
    private final String promptMessage;
    protected final BufferedReader keyboard = StuckOnAnIsland.getInFile();
    protected final PrintWriter console = StuckOnAnIsland.getOutFile();
    String selection = null;
    boolean valid = false;
    
    
    public StartProgramView() {
        this.promptMessage = "\n* Please enter you name:                                 *";
        this.displayBanner();
    }
    private void displayBanner() {
    System.out.println("\n********************************************************"
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
        );
    }

    public void displayStartProgramView() {
                boolean done = false;
                do {
                    String playersName = this.getPlayersName();
                    if(playersName.toUpperCase().equals("Q")) //user wants to quit
                        return; //exit game
                    done = this.doAction(playersName);
                } while (!done);
    }     
    private String getPlayersName() {
        
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        try {
            while (!valid) {
                System.out.println("\n" + this.promptMessage);
            
                value = this.keyboard.readLine(); // get next line typed on keyboard
                value = value.trim(); // trim off leadnig and trailing blanks
            
                if (value.length() < 1) { // value is blank
                    ErrorView.display(this.getClass().getName(),
                            "\n*** You must enter a value *** ");
                 continue;
                }
                break; // end the loop
            }
        } catch (IOException ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }
        value = value.trim(); // trim off leadnig and trailing blanks
        return value; // return the value entered
    }
    
    
    public boolean doAction(String value) {
        if (value.length() < 2) {
            ErrorView.display(this.getClass().getName(),
                    "\nInvlaid players name: "
                    + "Then name must be greater than one character in length");
            return false;
        }
        Player player = GameControl.createPlayer(value);

        if (player == null) {
            ErrorView.display(this.getClass().getName(),
                    "\nError creating the player.");
            return false;
        }
        this.displayNextView(player);
        return true; // success !
    }
//
    private void displayNextView(Player player) {
        System.out.println("\n**********************************************************"
                + "\n* Welcome to the game " + player.getName()
                + "\n* We hope you have a lot of fun!                         *"
                + "\n**********************************************************"
        );
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }

    
}
