/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.stuckOnAnIsland.view;

import java.util.Scanner;

/**
 *
 * @author RyanHafen
 */
public class ToolsView {

    private String promptSelection;
    private String promptMessage;
    
    void displayToolsMenu() {
        //System.out.println("\n*** displayTools() stub function called ***");
                
        this.promptSelection =      "\n****************************************************************"
                                + "\n*  Tools                                                       *"  
                                + "\n*                                                              *"                               
                                + "\n*  M - Hammer                                                  *"
                                + "\n*  H - Hatchet                                                 *"
                                + "\n*  R - Rope                                                    *"
                                + "\n*  B - Bow                                                     *"                      
                                + "\n*  F - Match                                                   *"                      
                                + "\n*  S - Spear                                                   *"                      
                                + "\n*  T - Trotline                                                *"                      
                                + "\n*                                                              *"
                                + "\n****************************************************************";
                
        this.promptMessage =      "\n  Which tool do you want to use?";
    }
    
    void displayMainMenuView() {
        boolean done = false; //set flag to not done
        do {
            // promplt for and get players name
            String selection = this.getSelection();
            done = this.doAction(selection);
        } while (!done);
    }

    private String getSelection() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) {
            System.out.println("\n" + this.promptSelection);
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leadnig and trailing blanks
            
            if (value.length() < 1 ) { // value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            else if (value.length() > 1 ) { // value is blank
                System.out.println("\nInvalid value: value must be M, H, R, B, F, S, or T");
                continue;
            }
            
            break; // end the loop
        }
        
        return value; // return the value entered
    }

    private boolean doAction(String selection) {
        selection = selection.toUpperCase(); //convert choice to upper case
        
        switch (selection) {
            case "M": //Hammer
                break;
            case "H": //Hatchet
                break;
            case "R": //Rope
                break;
            case "B": //Bow
                break;
            case "F": //Match
                break;
            case "S": //Spear
                break;
            case "T": //Trotline
                break;
        }
            return false;
        
        
        
    }
}
