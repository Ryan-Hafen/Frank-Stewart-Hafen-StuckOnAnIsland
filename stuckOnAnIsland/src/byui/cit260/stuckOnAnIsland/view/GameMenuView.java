/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.stuckOnAnIsland.view;

import java.util.Scanner;

/**
 *
 * @author hafenr
 */

public class GameMenuView {
    
    private String promptMessage;
    
    public GameMenuView() {
        this.promptMessage =      "\n****************************************************************"
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
                                + "\n****************************************************************";
    }

    void displayGameMenu() {
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
                System.out.println("\nInvalid value: value must be J, K, D, B, W, C, X, I, R, O, E, M, L, S, H, or Q");
                continue;
            }
            break; // end the loop
        }
        
        return value; // return the value entered
    }

    private boolean doAction(String helpMenuOption) {
        helpMenuOption = helpMenuOption.toUpperCase(); //convert choice to upper case
        
        switch (helpMenuOption) {
            case "J": // Wreckage inventory menu
                this.displayWreckageInventoryMenu();
                break;
            case "K": // Island inventory menu
                this.displayIslandInventoryMenu();
                break;
            case "D": // Display tools
                this.displayTools();
                break;
            case "B": // Build tools
                this.displayBuildTools();
                break;
            case "W": // Work on raft
                this.displayWorkOnRaft();
                break;
            case "C": // Collect resource
                this.displayCollectResource();
                break;
            case "X": // Drop resource
                this.displayDropResource();
                break;
            case "I": // View inventory
                this.displayViewInventoy();
                break;
            case "R": // View raft status
                this.displayViewRaftStatus();
                break;
            case "O": // Observe health menu
                this.displayObserveHealthMenu();
                break;
            case "E": // Explore locations
                this.displayExploreLocations();
                break;
            case "M": // Move to a location
                this.displayMoveToALocation();
                break;
            case "L": // Display current location
                this.displayCurrentLocation();
                break;
            case "S": // Save game
                this.displaySaveGame();
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
        wrechageInventoryMenu.displayWrechageInventoryMenu();
    }

    private void displayIslandInventoryMenu() {
        // display the Island Inventory Menu
        IslandInventoryView islandInventoryMenu = new IslandInventoryView();
        islandInventoryMenu.displayIslandInventoryMenu();
    }

    private void displayTools() {
        // display the Tools
        ToolsView tools = new ToolsView();
        tools.displayTools();
    }

    private void displayBuildTools() {
        // display the Build Tools
        BuildToolsView buildTools = new BuildToolsView();
        buildTools.displayBuildTools();
    }

    private void displayWorkOnRaft() {
        // display the Help menu
        WorkOnRaftView workOnRaftMenu = new WorkOnRaftView();
        workOnRaftMenu.displayWorkOnRaftMenu();
    }

    private void displayCollectResource() {
        // display the Help menu
        CollectResourceView collectResource = new CollectResourceView();
        collectResource.displayCollectResource();
    }

    private void displayDropResource() {
        // display the Help menu
        DropResourceView dropResource = new DropResourceView();
        dropResource.displayDropResource();
    }

    private void displayViewInventoy() {
        // display the Help menu
        ViewInventoyView viewInventoy = new ViewInventoyView();
        viewInventoy.displayViewInventoy();
    }

    private void displayViewRaftStatus() {
        // display the Help menu
        ViewRaftStatusView viewRaftStatus = new ViewRaftStatusView();
        viewRaftStatus.displayViewRaftStatus();
    }

    private void displayObserveHealthMenu() {
        // display the Help menu
        ObserveHealthMenuView observeHealthMenu = new ObserveHealthMenuView();
        observeHealthMenu.displayObserveHealthMenu();
    }

    private void displayExploreLocations() {
        // display the Help menu
        ExploreLocationsView exploreLocations = new ExploreLocationsView();
        exploreLocations.displayExploreLocations();
    }

    private void displayMoveToALocation() {
        // display the Help menu
        MoveToALocationView moveToALocation = new MoveToALocationView();
        moveToALocation.displayMoveToALocation();
    }

    private void displayCurrentLocation() {
        // display the Help menu
        CurrentLocationView currentLocation = new CurrentLocationView();
        currentLocation.displayCurrentLocation();
    }

    private void displaySaveGame() {
        // display the Help menu
        SaveGameView saveGame = new SaveGameView();
        saveGame.displaySaveGame();
    }

    private void displayHelpMenu() {
        // display the Help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenu();
    }

    
    
}
