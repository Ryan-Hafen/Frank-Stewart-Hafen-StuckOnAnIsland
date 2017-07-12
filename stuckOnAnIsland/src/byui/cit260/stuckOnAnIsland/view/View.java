/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.stuckOnAnIsland.view;

import java.util.Scanner;
import stuckonanisland.StuckOnAnIsland;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hafenr
 */
public abstract class View implements ViewInterface {

    protected String displayMessage;
    protected final BufferedReader keyboard = StuckOnAnIsland.getInFile();
    protected final PrintWriter console = StuckOnAnIsland.getOutFile();
    String selection = null;
    boolean valid = false;

    public View() {
    }

    public View(String message) {
        this.displayMessage = message;
    }

    @Override
    public void display() {

        boolean done = false; //set flag to not done
        do {
            // promplt for and get players name
//            String value = this.getInput();
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) //user wants to quit
            {
                return; // exit the game
            }
            // do the requested action and dispaly the next view
            done = this.doAction(value);
        } while (!done);

    }

    @Override
    public String getInput() {
        try {
            while (!valid) {
                //Scanner keyboard = new Scanner(System.in); // get infile for keyboard
                selection = this.keyboard.readLine();

                break;
            }
        } catch (IOException ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }
        selection = selection.trim();

        String value = ""; // value to be returned
        boolean valid2 = false; // initialize to not valid

        try {
            while (!valid2) {
                System.out.println("\n" + this.displayMessage);

                value = this.keyboard.readLine(); // get next line typed on keyboard
                if (value.length() < 1) { // value is blank
                    //System.out.println("\n*** You must enter a value *** ");
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
}
