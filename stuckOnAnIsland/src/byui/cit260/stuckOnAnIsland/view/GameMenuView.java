/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.stuckOnAnIsland.view;


import buyi.cit260.stuckOnAnIsland.control.GameControl;
import stuckonanisland.StuckOnAnIsland;
import java.util.Scanner;

/**
 *
 * @author hafenr
 */

public class GameMenuView extends View{
    
//    private String promptMessage;
    
    public GameMenuView() {
//        this.promptMessage =
        super( "\n****************************************************************"
             + "\n*  Game Play Menu                                              *"
             + "\n*    This menu will help you navigate through the game.        *"
             + "\n*                                                              *"
             + "\n*  J - Wreckage inventory menu                                 *"
             + "\n*  K - Island inventory menu                                   *"
             + "\n*  D - Display tools                                           *"
             + "\n*  B - Build tools                                             *"
             + "\n*  W - Work on raft                                            *"
             + "\n*  C - Collect resource                                        *" 
             + "\n*  X - Drop resource                                           *"
             + "\n*  I - View inventory                                          *"
             + "\n*  R - View raft status                                        *"
             + "\n*  O - Observe health menu                                     *"
             + "\n*  E - Explore locations                                       *"
             + "\n*  M - Move to a location                                      *"
             + "\n*  L - Display current location                                *"
             + "\n*  S - Save game                                               *"
             + "\n*  H - Help menu                                               *"
             + "\n*  Q - Quit                                                    *"
             + "\n*                                                              *"
             + "\n*  Please enter your selection:                                *"
             + "\n*                                                              *"
             + "\n****************************************************************"
        );
    }

//    void displayGameMenu() {
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
//                System.out.println("\nInvalid value: value must be J, K, D, B, W, C, X, I, R, O, E, M, L, S, H, or Q");
//                continue;
//            }
//            break; // end the loop
//        }
//        
//        return value; // return the value entered
//    }

    public boolean doAction(String value) {
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
            case "J": // Wreckage inventory menu
                this.displayWreckageInventoryMenu();
                break;
            case "K": // Island inventory menu
                this.displayIslandInventoryMenu();
                break;
            case "D": // Display tools
                this.displayToolsMenu();
                break;
            case "B": // Build tools
                this.displayBuildToolsMenu();
                break;
            case "W": // Work on raft
                this.displayWorkOnRaftMenu();
                break;
            case "C": // Collect resource
                this.displayCollectResourceMenu();
                break;
            case "X": // Drop resource
                this.displayDropResourceMenu();
                break;
            case "I": // View inventory
                this.displayViewInventoryMenu();
                break;
            case "R": // View raft status
                this.displayViewRaftStatusMenu();
                break;
            case "O": // Observe health menu
                this.displayObserveHealthMenu();
                break;
            case "E": // Explore locations
                this.displayExploreLocationsMenu();
                break;
            case "M": // Move to a location
                this.displayMoveToALocationMenu();
                break;
            case "L": // Display current location
                this.displayCurrentLocationMenu();
                break;
            case "S": // Save game
                this.displaySaveGameMenu();
                break;
            case "H": // Help menu
                this.displayHelpMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    private void displayWreckageInventoryMenu() {
        // display the Wreckage Inventory Menu
        WreckageInventoryView wrechageInventoryMenu = new WreckageInventoryView();
        wrechageInventoryMenu.display();
    }

    private void displayIslandInventoryMenu() {
        // display the Island Inventory Menu
        IslandInventoryView islandInventoryMenu = new IslandInventoryView();
        islandInventoryMenu.display();
    }


    private void displayBuildToolsMenu() {
        // display the Build Tools Menu
        BuildToolsView buildToolsMenu = new BuildToolsView();
        buildToolsMenu.display();
    }

    private void displayObserveHealthMenu() {
        // display the Observe Health Menu
        ObserveHealthMenuView observeHealthMenu = new ObserveHealthMenuView();
        observeHealthMenu.display();
    }

    private void displayHelpMenu() {
        // display the Help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void displayToolsMenu() {
        // display the Tools Menu
        ToolsView tools = new ToolsView();
        tools.display();
    }

    private void displayWorkOnRaftMenu() {
        // display the Work On Raft Menu
        WorkOnRaftView workOnRaftMenu = new WorkOnRaftView();
        workOnRaftMenu.display();
    }

    private void displayCollectResourceMenu() {
        // display the Collect Resource Menu
        CollectResourceView collectResource = new CollectResourceView();
        collectResource.display();
    }

    private void displayDropResourceMenu() {
        // display the Drop Resource Menu
        DropResourceView dropResource = new DropResourceView();
        dropResource.display();
    }

    private void displayViewInventoryMenu() {
        // display the View Inventory Menu
        ViewInventoryView viewInventory = new ViewInventoryView();
        viewInventory.display();
    }

    private void displayViewRaftStatusMenu() {
        // display the View Raft Status Menu
        ViewRaftStatusView viewRaftStatus = new ViewRaftStatusView();
        viewRaftStatus.display();
    }

    private void displayExploreLocationsMenu() {
        // display the Explore Locations Menu
        ExploreLocationsView exploreLocations = new ExploreLocationsView();
        exploreLocations.display();
    }

    private void displayMoveToALocationMenu() {
        // display the Move To A Location Menu
        MoveToALocationView moveToALocation = new MoveToALocationView();
        moveToALocation.display();
    }

    private void displayCurrentLocationMenu() {
        // display the Current Location Menu
        CurrentLocationView currentLocation = new CurrentLocationView();
        currentLocation.display();
    }

    private void displaySaveGameMenu() {
        // display the Save Game Menu
        SaveGameView saveGame = new SaveGameView();
        saveGame.display();
    }
}
