/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.stuckOnAnIsland.view;

// ******* removed when implemented view super class *******  
//import java.util.Scanner;

/**
 *
 * @author hafenr
 */
public class HelpMenuView extends View{
    
//    private String promptMessage;
    
    public HelpMenuView() {
        // ******* removed when implemented view super class *******  
//        this.promptMessage =      
        super( "\n********************************************************"
             + "\n*  Help Menu                                           *"
             + "\n*                                                      *"
             + "\n*  G - What is the goal of the game?                   *"
             + "\n*  M - How to move                                     *"
             + "\n*  T - How to build tools                              *"
             + "\n*  F - How to fix the raft                             *"
             + "\n*  H - How to collect inventory                        *"
             + "\n*  E - Exit to Main Menu                               *"
             + "\n*                                                      *"
             + "\n*  Please enter your selection:                        *"
             + "\n*                                                      *"
             + "\n********************************************************"
        );
    }

// ******* removed when implemented view super class *******    
//    void displayHelpMenu() {
//        boolean done = false; //set flag to not done
//        
//        do {
//            // promplt for and get players name
//            String helpMenuOption = this.getMenuOption();
//            //if (helpMenuOption.toUpperCase().equals("Q")) //user wants to quit
//            //    return; // exit the game
//            
//            // do the requested action and dispaly the next view
//            done = this.doAction(helpMenuOption);
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
//                System.out.println("\nInvalid value: value must be G, M, T, F, H, or E");
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
                this.displayMainMenuView();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    private void displayMainMenuView() {
        MainMenuView mainMenuView = new MainMenuView();
// ******* removed when implemented view super class *******        
//        mainMenuView.displayMainMenuView();
        mainMenuView.display();
    }

    
    
}
