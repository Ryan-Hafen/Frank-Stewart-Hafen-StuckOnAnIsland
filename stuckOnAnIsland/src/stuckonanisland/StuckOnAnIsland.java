/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stuckonanisland;

import byui.cit260.stuckOnAnIsland.model.Actor;
import byui.cit260.stuckOnAnIsland.model.Backpack;
import byui.cit260.stuckOnAnIsland.model.Game;
import byui.cit260.stuckOnAnIsland.model.Player;
import byui.cit260.stuckOnAnIsland.model.IslandInventory;
import byui.cit260.stuckOnAnIsland.model.RaftMaterial;
import byui.cit260.stuckOnAnIsland.model.RaftStatus;
import byui.cit260.stuckOnAnIsland.model.ToolInventory;
import byui.cit260.stuckOnAnIsland.model.WreckageInventory;
import byui.cit260.stuckOnAnIsland.view.StartProgramView;

/**
 *
 * @author RyanHafen
 */
public class StuckOnAnIsland {

    /**
     * @param args the command line arguments
     */
    private static Game currentGame = null;
    private static Player player = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        StuckOnAnIsland.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }
    
    public static void setPlayer(Player player) {
        StuckOnAnIsland.player = player;
    }
    
        
    public static void main(String[] args) {
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
        
        
//        //Actor Class
//        Actor actorOne = new Actor();
//        
//        actorOne.setActorName("George");
//        actorOne.getCurrentCoordinate(3, 1);
//        actorOne.getCurrentHealth();
//        
//        String actorInfo = actorOne.toString();
//        System.out.println(actorInfo);
//        
//        //Backpack Class
//        Backpack backpack = new Backpack();
//        
//        backpack.setResourceCapacity(100);
//        backpack.setResourceQuantity(3);
//        backpack.setResourceDescription("apple");
//        
//        String backpackInfo = backpack.toString();
//        System.out.println(backpackInfo);
//        
//        //Game Class
//        Game gameOne = new Game();
//        
//        gameOne.setNumberRounds(5);
//        gameOne.setTotalTime(70000);
//        
//        String gameInfo = gameOne.toString();
//        System.out.println(gameInfo);
//        
//        //Player Class
//        Player playerOne = new Player();
//        
//        playerOne.setName("Ryan");
//        playerOne.setBesTime(7.00);
//        
//        String playerInfo = playerOne.toString();
//        System.out.println(playerInfo);
//        
//        //islandInventory Class
//        IslandInventory islandInventory = new IslandInventory();
//        
//        islandInventory.setDescription("water");
//        islandInventory.setInventoryQuantity(1);
//        islandInventory.setInventorySize(25);
//        islandInventory.setHealthPoints(5.5);
//        
//        String islandInventoryInfo = islandInventory.toString();
//        System.out.println(islandInventoryInfo);
//        
//        //raftMaterial Class
//        RaftMaterial raftMaterial = new RaftMaterial();
//        
//        raftMaterial.setMaterialVine("vine");
//        raftMaterial.setMaterialWood("wood");
//        
//        String raftMaterialInfo = raftMaterial.toString();
//        System.out.println(raftMaterialInfo);
//        
//        //raftStatus Class
//        RaftStatus raftStatus = new RaftStatus();
//        
//        raftStatus.setDescription("raft");
//        raftStatus.setRaftCompletionPercentage(95.6);
//        raftStatus.setRaftMaterialList("wood");
//        
//        String raftStatusInfo = raftStatus.toString();
//        System.out.println(raftStatusInfo);
//        
//        //toolInventory Class
//        ToolInventory toolInventory = new ToolInventory();
//        
//        toolInventory.setDescription("axe");
//        toolInventory.setToolType("weapon");
//        
//        String toolInventoryInfo = toolInventory.toString();
//        System.out.println(toolInventoryInfo);
//        
//        //wreckageInventory Class
//        WreckageInventory wreckageInventory = new WreckageInventory();
//        
//        wreckageInventory.setDescription("matches");
//        wreckageInventory.setInventoryType("fire");
//        
//        String wreckageInventoryInfo = wreckageInventory.toString();
//        System.out.println(wreckageInventoryInfo);
    }
    
}
