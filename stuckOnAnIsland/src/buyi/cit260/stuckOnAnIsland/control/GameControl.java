/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.stuckOnAnIsland.control;

import byui.cit260.stuckOnAnIsland.model.Backpack;
import byui.cit260.stuckOnAnIsland.model.Game;
import byui.cit260.stuckOnAnIsland.model.IslandInventory;
import byui.cit260.stuckOnAnIsland.model.Map;
import byui.cit260.stuckOnAnIsland.model.Player;
import byui.cit260.stuckOnAnIsland.model.RaftMaterial;
import byui.cit260.stuckOnAnIsland.model.RaftStatus;
import byui.cit260.stuckOnAnIsland.model.ToolInventory;
import byui.cit260.stuckOnAnIsland.model.WreckageInventory;
import java.util.HashSet;
import java.util.Set;
import stuckonanisland.StuckOnAnIsland;

/**
 *
 * @author RyanHafen
 */
public class GameControl {

    public static Player createPlayer(String name) {
        //System.out.println("\n*** createPlayer() function called ***");
        //return new Player();
        if (name == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        StuckOnAnIsland.setPlayer(player); // save the player
        
        return player;
    }

    public static void createNewGame(Player player) {
        Game game = new Game();
        StuckOnAnIsland.setCurrentGame(game);
        
        game.setPlayer(player);
        
        RaftStatus raft = new RaftStatus();
        game.setRaft(raft);
        
        Backpack backpack = BackpackControl.createBackpack();
        game.setBackpack(backpack);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        IslandInventory[] islandInventory = GameControl.createIslandInventoryList();
        WreckageInventory[] wreckageInventory = GameControl.createWreckageInventoryList();
        ToolInventory[] toolInventory = GameControl.createToolInventoryList();
        RaftMaterial[] raftMaterial = GameControl.createRaftMaterialList();
        
        
    }

    public static void createHealth() {
        System.out.println("\n*** createHealth sub function called ***");
    }

    public static void createSaveGame(Player player, Game currentGame) {
        if (player == null) {
            return;
        }else if (currentGame == null) {
            return;
        }else {
            System.out.println("\n*** createSaveGame sub function called ***");
        }
    }

    private static IslandInventory[] createIslandInventoryList() {
        IslandInventory[] islandInventory = new IslandInventory[6];
        
        IslandInventory berry = new IslandInventory();
        return null;
    }

    private static WreckageInventory[] createWreckageInventoryList() {
        System.out.println("\n*** createWreckageInventoryList sub function called ***");
        return null;
    }

    private static ToolInventory[] createToolInventoryList() {
        System.out.println("\n*** createToolInventoryList sub function called ***");
        return null;
    }

    private static RaftMaterial[] createRaftMaterialList() {
        System.out.println("\n*** createRaftMaterialList sub function called ***");
        return null;
    }

    
}
