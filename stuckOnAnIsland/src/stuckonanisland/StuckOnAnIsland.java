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
import byui.cit260.stuckOnAnIsland.model.islandInventory;
import byui.cit260.stuckOnAnIsland.model.raftMaterial;
import byui.cit260.stuckOnAnIsland.model.raftStatus;
import byui.cit260.stuckOnAnIsland.model.toolInventory;
import byui.cit260.stuckOnAnIsland.model.wreckageInventory;

/**
 *
 * @author RyanHafen
 */
public class StuckOnAnIsland {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Actor Class
        Actor actorOne = new Actor();
        
        actorOne.setActorName("George");
        actorOne.getCurrentCoordinate(3, 1);
        actorOne.getCurrentHealth();
        
        String actorInfo = actorOne.toString();
        System.out.println(actorInfo);
        
        //Backpack Class
        Backpack backpack = new Backpack();
        
        backpack.setResourceCapacity(100);
        backpack.setResourceQuantity(3);
        backpack.setResourceDescription("apple");
        
        String backpackInfo = backpack.toString();
        System.out.println(backpackInfo);
        
        //Game Class
        Game gameOne = new Game();
        
        gameOne.setNumberRounds(5);
        gameOne.setTotalTime(70000);
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        
        //Player Class
        Player playerOne = new Player();
        
        playerOne.setName("Ryan");
        playerOne.setBesTime(7.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        //islandInventory Class
        islandInventory islandInventory = new islandInventory();
        
        islandInventory.setDescription("water");
        islandInventory.setInventoryQuantity(1);
        islandInventory.setInventorySize(25);
        islandInventory.setHealthPoints(5.5);
        
        String islandInventoryInfo = islandInventory.toString();
        System.out.println(islandInventoryInfo);
        
        //raftMaterial Class
        raftMaterial raftMaterial = new raftMaterial();
        
        raftMaterial.setMaterialVine("vine");
        raftMaterial.setMaterialWood("wood");
        
        String raftMaterialInfo = raftMaterial.toString();
        System.out.println(raftMaterialInfo);
        
        //raftStatus Class
        raftStatus raftStatus = new raftStatus();
        
        raftStatus.setDescription("raft");
        raftStatus.setRaftCompletionPercentage(95.6);
        raftStatus.setRaftMaterialList("wood");
        
        String raftStatusInfo = raftStatus.toString();
        System.out.println(raftStatusInfo);
        
        //toolInventory Class
        toolInventory toolInventory = new toolInventory();
        
        toolInventory.setDescription("axe");
        toolInventory.setToolType("weapon");
        
        String toolInventoryInfo = toolInventory.toString();
        System.out.println(toolInventoryInfo);
        
        //wreckageInventory Class
        wreckageInventory wreckageInventory = new wreckageInventory();
        
        wreckageInventory.setDescription("matches");
        wreckageInventory.setInventoryType("fire");
        
        String wreckageInventoryInfo = wreckageInventory.toString();
        System.out.println(wreckageInventoryInfo);
    }
    
}
