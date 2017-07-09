/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.stuckOnAnIsland.view;

import buyi.cit260.stuckOnAnIsland.control.GameControl;
import buyi.cit260.stuckOnAnIsland.exceptions.GameControlException;

// ******* removed when implemented view super class *******
//import java.util.Scanner;-- removed when implemented view super class
import stuckonanisland.StuckOnAnIsland;
import byui.cit260.stuckOnAnIsland.view.GameMenuView;
import java.io.PrintWriter;

/**
 *
 * @author hafenr
 */
public class MainMenuView extends View {

// ******* removed when implemented view super class *******    
//    private String promptMessage;
    public MainMenuView() {
//        this.promptMessage =      -- removed when implemented view super class
        super("\n****************************************************************"
                + "\n*  Main Menu                                                   *"
                + "\n*                                                              *"
                + "\n*  N - New game                                                *"
                + "\n*  C - Continue game                                           *"
                + "\n*  R - Restart game                                            *"
                + "\n*  H - Help                                                    *"
                + "\n*  Q - Quit                                                    *"
                + "\n*  A - Print Adam's List                                       *"
                + "\n*  J - Print John's List                                       *"
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
//            // prompt for and get players name
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
    /**
     *
     * @param value
     * @return
     */
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
            case "A": //Adam's print list    
                this.printAdamList();
                break;
            case "J": //John's list    
                this.johnsList();
                break;
            default:
                //System.out.println("\n*** Invalid selection *** Try again");
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void printAdamList() {
        int value = 0;
        this.console.println("\n\nEnter your filepath.");
        String adamFilePath = this.getInput();

        try {
            if (adamFilePath.length() > 3) {
                String[] array = {"Knife", "Shovel", "String", "Coconut"};
                int[] array2 = {3, 2, 7, 15};

                System.out.println("Tools in Inventory\t\tCounts");

                for (String array1 : array) {
                    System.out.println(array[value] + "\t\t" + array2[value]);
                }
                System.out.println("Your report is written!");
            }

        } catch (Exception exc) {

            ErrorView.display(this.getClass().getName(), exc.getMessage());
        }

    }

    //John's List
    private void johnsList() {
        String fileName = "IslandLocations.txt";

        PrintWriter writer = null;
        {
            int value = 0;
            this.console.println("\n\nLocate your filedirectory.");
            String johnFileDirectory = this.getInput();
            try {
                if (johnFileDirectory.length() > 3) {
                    String[] array = {"Wreckage", "Reef", "Beach1", "Beach2", "Babmbo1", "Beach3", "Beach4", "Bambo2", "Cave", "Jungle2"};
                    String[] array2 = {"0-0", "0-1", "0-2", "0-3", "0-4", "0-5", "0-6", "0-7", "0-8", "1-0"};

                    System.out.println("Island Views\t\tLocation");

                    for (String array1 : array) {
                        System.out.println(array[value] + "\t\t" + array2[value]);
                    }
                    System.out.println("Partial Island Location Printout.");
                }

            } catch (Exception exc) {

                ErrorView.display(this.getClass().getName(), exc.getMessage());
            }
            writer.close();
        }
        //Why is this illegal?
    private void startNewGame() {
        GameControl.createNewGame(StuckOnAnIsland.getPlayer());

        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void startExistingGame() {
        //System.out.println("\n*** startExistingGame function called ***");
        //prompt for and get the filename
        this.console.println("\n\nEnter the filename");
        String filePath = this.getInput();

        try {
            GameControl.getSavedGame(filePath);

        } catch (Exception ex) {
            ErrorView.display(ex.getMessage(), "MainMenuView");
        }

        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
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
