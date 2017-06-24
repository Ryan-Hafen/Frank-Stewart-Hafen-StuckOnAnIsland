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
import byui.cit260.stuckOnAnIsland.model.Scene;
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

    static void assignScenesToLocations(Map map, Scene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public enum IslandInventoryItem {
        berries,
        nuts,
        freshWater,
        fish,
        smallAnimal,
        largeAnimal;
    }
    
    private static IslandInventory[] createIslandInventoryList() {
        IslandInventory[] islandInventory = new IslandInventory[6];
        
        IslandInventory berries = new IslandInventory();
        berries.setDescription("Berries");
        berries.setHealthPoints(1);
        berries.setInventoryQuantity(0);
        berries.setInventorySize(.25);
        islandInventory[IslandInventoryItem.berries.ordinal()] = berries;
        
        IslandInventory nuts = new IslandInventory();
        nuts.setDescription("Nuts");
        nuts.setHealthPoints(1);
        nuts.setInventoryQuantity(0);
        nuts.setInventorySize(.25);
        islandInventory[IslandInventoryItem.nuts.ordinal()] = nuts;
        
        IslandInventory freshWater = new IslandInventory();
        freshWater.setDescription("Fresh Water");
        freshWater.setHealthPoints(5);
        freshWater.setInventoryQuantity(0);
        freshWater.setInventorySize(1);
        islandInventory[IslandInventoryItem.freshWater.ordinal()] = freshWater;
        
        IslandInventory fish = new IslandInventory();
        fish.setDescription("Fish");
        fish.setHealthPoints(5);
        fish.setInventoryQuantity(0);
        fish.setInventorySize(1);
        islandInventory[IslandInventoryItem.fish.ordinal()] = fish;
        
        IslandInventory smallAnimal = new IslandInventory();
        smallAnimal.setDescription("Small Animal");
        smallAnimal.setHealthPoints(10);
        smallAnimal.setInventoryQuantity(0);
        smallAnimal.setInventorySize(15);
        islandInventory[IslandInventoryItem.smallAnimal.ordinal()] = smallAnimal;
        
        IslandInventory largeAnimal = new IslandInventory();
        largeAnimal.setDescription("Large Animal");
        largeAnimal.setHealthPoints(25);
        largeAnimal.setInventoryQuantity(0);
        largeAnimal.setInventorySize(35);
        islandInventory[IslandInventoryItem.largeAnimal.ordinal()] = largeAnimal;
        
        return islandInventory;
    }
    
    public enum WreckageInventoryItem {
        cannedFood,
        bottleOfWater,
        lighter,
        flashlight,
        multiTool,
        dryFood,
        knife,
        fishingHook,
        tarp,
        bucket;
    }

    private static WreckageInventory[] createWreckageInventoryList() {
        WreckageInventory[] wreckageInventory = new WreckageInventory[10];
        
        WreckageInventory cannedFood = new WreckageInventory();
        cannedFood.setDescription("Canned Food");
        cannedFood.setHealthPoints(10);
        cannedFood.setInventoryQuantity(0);
        cannedFood.setInventorySize(5);
        wreckageInventory[WreckageInventoryItem.cannedFood.ordinal()] = cannedFood;
        
        WreckageInventory bottleOfWater = new WreckageInventory();
        bottleOfWater.setDescription("Bottle of Water");
        bottleOfWater.setHealthPoints(5);
        bottleOfWater.setInventoryQuantity(0);
        bottleOfWater.setInventorySize(1);
        wreckageInventory[WreckageInventoryItem.bottleOfWater.ordinal()] = bottleOfWater;
        
        WreckageInventory lighter = new WreckageInventory();
        lighter.setDescription("Lighter");
        lighter.setHealthPoints(1);
        lighter.setInventoryQuantity(0);
        lighter.setInventorySize(.25);
        wreckageInventory[WreckageInventoryItem.lighter.ordinal()] = lighter;
        
        WreckageInventory flashlight = new WreckageInventory();
        flashlight.setDescription("Flashlight");
        flashlight.setHealthPoints(5);
        flashlight.setInventoryQuantity(0);
        flashlight.setInventorySize(1);
        wreckageInventory[WreckageInventoryItem.flashlight.ordinal()] = flashlight;
        
        WreckageInventory multiTool = new WreckageInventory();
        multiTool.setDescription("Multi-Tool");
        multiTool.setHealthPoints(10);
        multiTool.setInventoryQuantity(0);
        multiTool.setInventorySize(5);
        wreckageInventory[WreckageInventoryItem.multiTool.ordinal()] = multiTool;
        
        WreckageInventory dryFood = new WreckageInventory();
        dryFood.setDescription("Dry Food");
        dryFood.setHealthPoints(10);
        dryFood.setInventoryQuantity(0);
        dryFood.setInventorySize(5);
        wreckageInventory[WreckageInventoryItem.dryFood.ordinal()] = dryFood;
        
        WreckageInventory knife = new WreckageInventory();
        knife.setDescription("Dry Food");
        knife.setHealthPoints(10);
        knife.setInventoryQuantity(0);
        knife.setInventorySize(1);
        wreckageInventory[WreckageInventoryItem.knife.ordinal()] = knife;
        
        WreckageInventory fishingHook = new WreckageInventory();
        fishingHook.setDescription("Fishing Hook");
        fishingHook.setHealthPoints(1);
        fishingHook.setInventoryQuantity(0);
        fishingHook.setInventorySize(.25);
        wreckageInventory[WreckageInventoryItem.fishingHook.ordinal()] = fishingHook;
        
        WreckageInventory tarp = new WreckageInventory();
        tarp.setDescription("Tarp");
        tarp.setHealthPoints(10);
        tarp.setInventoryQuantity(0);
        tarp.setInventorySize(15);
        wreckageInventory[WreckageInventoryItem.tarp.ordinal()] = tarp;
        
        WreckageInventory bucket = new WreckageInventory();
        bucket.setDescription("Bucket");
        bucket.setHealthPoints(5);
        bucket.setInventoryQuantity(0);
        bucket.setInventorySize(15);
        wreckageInventory[WreckageInventoryItem.bucket.ordinal()] = bucket;
        
        return wreckageInventory;
    }
    
    public enum ToolInventoryItem {
        hammer,
        hatchet,
        rope,
        bow,
        match,
        spear,
        trotline;
    }

    private static ToolInventory[] createToolInventoryList() {
        ToolInventory[] toolInventory = new ToolInventory[7];
        
        ToolInventory hammer = new ToolInventory();
        hammer.setDescription("Hammer");
        hammer.setHealthPoints(1);
        hammer.setInventoryQuantity(0);
        hammer.setInventorySize(.25);
        toolInventory[ToolInventoryItem.hammer.ordinal()] = hammer;
        
        ToolInventory hatchet = new ToolInventory();
        hatchet.setDescription("Hatchet");
        hatchet.setHealthPoints(1);
        hatchet.setInventoryQuantity(0);
        hatchet.setInventorySize(.25);
        toolInventory[ToolInventoryItem.hatchet.ordinal()] = hatchet;
        
        ToolInventory rope = new ToolInventory();
        rope.setDescription("Rope");
        rope.setHealthPoints(5);
        rope.setInventoryQuantity(0);
        rope.setInventorySize(1);
        toolInventory[ToolInventoryItem.rope.ordinal()] = rope;
        
        ToolInventory bow = new ToolInventory();
        bow.setDescription("Bow");
        bow.setHealthPoints(5);
        bow.setInventoryQuantity(0);
        bow.setInventorySize(1);
        toolInventory[ToolInventoryItem.bow.ordinal()] = bow;
        
        ToolInventory match = new ToolInventory();
        match.setDescription("Match");
        match.setHealthPoints(10);
        match.setInventoryQuantity(0);
        match.setInventorySize(15);
        toolInventory[ToolInventoryItem.match.ordinal()] = match;
        
        ToolInventory spear = new ToolInventory();
        spear.setDescription("Spear");
        spear.setHealthPoints(25);
        spear.setInventoryQuantity(0);
        spear.setInventorySize(35);
        toolInventory[ToolInventoryItem.spear.ordinal()] = spear;
        
        ToolInventory trotline = new ToolInventory();
        trotline.setDescription("Trotline");
        trotline.setHealthPoints(25);
        trotline.setInventoryQuantity(0);
        trotline.setInventorySize(35);
        toolInventory[ToolInventoryItem.trotline.ordinal()] = trotline;
        
        return toolInventory;
    }
    
    public enum RaftMaterialItem {
        wood,
        vine;
    }

    private static RaftMaterial[] createRaftMaterialList() {
        RaftMaterial[] raftMaterial = new RaftMaterial[7];
        
        RaftMaterial wood = new RaftMaterial();
        wood.setDescription("Wood");
        wood.setHealthPoints(0);
        wood.setInventoryQuantity(0);
        wood.setInventorySize(5);
        raftMaterial[RaftMaterialItem.wood.ordinal()] = wood;
        
        RaftMaterial vine = new RaftMaterial();
        vine.setDescription("Vine");
        vine.setHealthPoints(0);
        vine.setInventoryQuantity(0);
        vine.setInventorySize(5);
        raftMaterial[RaftMaterialItem.vine.ordinal()] = vine;
        
        return raftMaterial;
    }

    
}
