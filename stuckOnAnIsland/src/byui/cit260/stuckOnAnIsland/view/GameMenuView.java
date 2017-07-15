/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.stuckOnAnIsland.view;

import byui.cit260.stuckOnAnIsland.model.Game;
import byui.cit260.stuckOnAnIsland.model.Map;

/**
 *
 * @author hafenr
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("\n****************************************************************"
                + "\n*  Game Play Menu                                              *"
                + "\n*    This menu will help you navigate through the game.        *"
                + "\n*                                                              *"
                + "\n*  V - View Map                                                *"
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

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); //convert choice to upper case

        switch (value) {
            case "V": // Wreckage inventory menu
                this.displayMap();
                break;
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
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection *** Try again");
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

    private void displayMap() {
    }
}
