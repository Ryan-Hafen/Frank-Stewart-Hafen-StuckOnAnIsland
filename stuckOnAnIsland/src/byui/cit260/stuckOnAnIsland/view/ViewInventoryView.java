/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.stuckOnAnIsland.view;

import byui.cit260.stuckOnAnIsland.model.Game;
import byui.cit260.stuckOnAnIsland.model.IslandInventory;
import byui.cit260.stuckOnAnIsland.model.RaftMaterial;
import byui.cit260.stuckOnAnIsland.model.ToolInventory;
import byui.cit260.stuckOnAnIsland.model.WreckageInventory;
import stuckonanisland.StuckOnAnIsland;

/**
 *
 * @author Adam Frank
 */
public class ViewInventoryView extends View{
    
//    private String promptMessage;
    
    public ViewInventoryView() {
//        this.promptMessage =    
        super( "\n********************************************************"
             + "\n*  Inventory Menu                                      *"
             + "\n*                                                      *"
             + "\n*  I - View Island Inventory                           *"
             + "\n*  W - View Wreckage Inventory                         *"
             + "\n*  T - View Tool Inventory                             *"
             + "\n*  R - View Raft Materials collected                   *"
             + "\n*  S - Save game                                       *"
             + "\n*  Q - Quit                                            *"
             + "\n*  Please enter your selection:                        *"
             + "\n*                                                      *"
             + "\n********************************************************"
        );
    }
    

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
            case "I": // view island inventory
                this.viewIslandInventory();
                break;
            case "W": // view wreckage inventory
                this.viewWreckageInventory();
                break;
            case "T": // view tool inventory
                this.viewToolInventory();
                break;
            case "R": // view raft materials collected
                this.viewRaftMaterial();
                break;
            case "S": // save the current game
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    private void viewIslandInventory() {
        StringBuilder line;
        
        Game game = StuckOnAnIsland.getCurrentGame();
        IslandInventory[] islandInventory = game.getIslandInventory();
        
        System.out.println("\n********************************************************");
        line = new StringBuilder("\n*  List of Island Inventory Items                      *");
        line.insert(0, "Description");
        line.insert(20,"In Stock");
        System.out.println(line.toString());
        
        for (IslandInventory item : islandInventory) {
            line = new StringBuilder("\n*                                                      *");
            line.insert(0, item.getDescription());
            line.insert(20, item.getInventoryQuantity());
            
            System.out.println(line.toString());
        }
    }

    private void viewWreckageInventory() {
//        System.out.println("\n*** viewInventory function called ***");
//        String[] backPackList = {"Flashlight", "Bottle of Water", "Knife"};
//        listBackPackItems(backPackList);
        StringBuilder line;
        
        Game game = StuckOnAnIsland.getCurrentGame();
        WreckageInventory[] wreckageInventory = game.getWreckageInventory();
        
        System.out.println("\n********************************************************");
        line = new StringBuilder("\n*  List of Wreckage Inventory Items                      *");
        line.insert(0, "Description");
        line.insert(20,"In Stock");
        System.out.println(line.toString());
        
        for (WreckageInventory item : wreckageInventory) {
            line = new StringBuilder("\n*                                                      *");
            line.insert(0, item.getDescription());
            line.insert(20, item.getInventoryQuantity());
            
            System.out.println(line.toString());
        }
    }

    private void viewToolInventory() {
        StringBuilder line;
        
        Game game = StuckOnAnIsland.getCurrentGame();
        ToolInventory[] toolInventory = game.getToolInventory();
        
        System.out.println("\n********************************************************");
        line = new StringBuilder("\n*  List of Tool Inventory Items                      *");
        line.insert(0, "Description");
        line.insert(20,"In Stock");
        System.out.println(line.toString());
        
        for (ToolInventory item : toolInventory) {
            line = new StringBuilder("\n*                                                      *");
            line.insert(0, item.getDescription());
            line.insert(20, item.getInventoryQuantity());
            
            System.out.println(line.toString());
        }
    }

    private void viewRaftMaterial() {
        StringBuilder line;
        
        Game game = StuckOnAnIsland.getCurrentGame();
        RaftMaterial[] raftMaterial = game.getRaftMaterial();
        
        System.out.println("\n********************************************************");
        line = new StringBuilder("\n*  List of Tool Inventory Items                      *");
        line.insert(0, "Description");
        line.insert(20,"In Stock");
        System.out.println(line.toString());
        
        for (RaftMaterial item : raftMaterial) {
            line = new StringBuilder("\n*                                                      *");
            line.insert(0, item.getDescription());
            line.insert(20, item.getInventoryQuantity());
            
            System.out.println(line.toString());
        }
    }

    private void saveGame() {
        System.out.println("\n*** saveGame function called ***");
    }

//    private static class Resource {
//
//        public Resource(String knife) {
//        }
//    }
    
//    private void listBackPackItems(String[] backPackList) {
//        int i = 1;
//        for (String lists : backPackList) {
//            System.out.println("List item #" + i + " is: " + backPackList[i-1]);
//            i++;
//    }
//        System.out.println("You have " + (i-1) + " items in your backpack!");
//    }
    
}
