/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.stuckOnAnIsland.control;

import buyi.cit260.stuckOnAnIsland.control.MapControl.SceneType;
import byui.cit260.stuckOnAnIsland.model.Backpack;
import byui.cit260.stuckOnAnIsland.model.Game;
import byui.cit260.stuckOnAnIsland.model.IslandInventory;
import byui.cit260.stuckOnAnIsland.model.Location;
import byui.cit260.stuckOnAnIsland.model.Map;
import byui.cit260.stuckOnAnIsland.model.Player;
import byui.cit260.stuckOnAnIsland.model.RaftMaterial;
import byui.cit260.stuckOnAnIsland.model.RaftStatus;
import byui.cit260.stuckOnAnIsland.model.Scene;
import byui.cit260.stuckOnAnIsland.model.ToolInventory;
import byui.cit260.stuckOnAnIsland.model.WreckageInventory;
import java.util.HashSet;
import java.util.Set;
import java.io.*;
import stuckonanisland.StuckOnAnIsland;
import buyi.cit260.stuckOnAnIsland.exceptions.GameControlException;

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
    
    public static void getSavedGame(String filePath) {
        System.out.println("getSavedGame called");
    }
    
    public static void saveGame(Game game, String filepath) 
            throws GameControlException {
        try( FileOutputStream fops = new FileOutputStream(filepath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            output.writeObject(game); //write the game object
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }

    static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        locations[0][0].setScene(scenes[SceneType.wreckage.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.reef.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.beach1.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.beach2.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.bambo1.ordinal()]);
        locations[0][5].setScene(scenes[SceneType.beach3.ordinal()]);
        locations[0][6].setScene(scenes[SceneType.beach4.ordinal()]);
        locations[0][7].setScene(scenes[SceneType.bambo2.ordinal()]);
        locations[0][8].setScene(scenes[SceneType.cave.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.jungle2.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.bambo1.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.bambo1.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.beach1.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.bambo3.ordinal()]);
        locations[1][5].setScene(scenes[SceneType.jungle1.ordinal()]);
        locations[1][6].setScene(scenes[SceneType.reef.ordinal()]);
        locations[1][7].setScene(scenes[SceneType.beach1.ordinal()]);
        locations[1][8].setScene(scenes[SceneType.beach2.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.beach4.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.beach3.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.bambo1.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.cave.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.beach2.ordinal()]);
        locations[2][5].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[2][6].setScene(scenes[SceneType.bambo2.ordinal()]);
        locations[2][7].setScene(scenes[SceneType.jungle2.ordinal()]);
        locations[2][8].setScene(scenes[SceneType.bambo3.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.beach3.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.jungle1.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.reef.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.beach1.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.jungle3.ordinal()]);
        locations[3][5].setScene(scenes[SceneType.beach4.ordinal()]);
        locations[3][6].setScene(scenes[SceneType.beach3.ordinal()]);
        locations[3][7].setScene(scenes[SceneType.lagoon.ordinal()]);
        locations[3][8].setScene(scenes[SceneType.jungle2.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.bambo1.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.cave.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.beach2.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.jungle3.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.bambo2.ordinal()]);
        locations[4][5].setScene(scenes[SceneType.beach4.ordinal()]);
        locations[4][6].setScene(scenes[SceneType.beach3.ordinal()]);
        locations[4][7].setScene(scenes[SceneType.bambo3.ordinal()]);
        locations[4][8].setScene(scenes[SceneType.waterfall.ordinal()]);
        locations[5][0].setScene(scenes[SceneType.reef.ordinal()]);
        locations[5][1].setScene(scenes[SceneType.beach1.ordinal()]);
        locations[5][2].setScene(scenes[SceneType.jungle1.ordinal()]);
        locations[5][3].setScene(scenes[SceneType.beach4.ordinal()]);
        locations[5][4].setScene(scenes[SceneType.bambo1.ordinal()]);
        locations[5][5].setScene(scenes[SceneType.beach2.ordinal()]);
        locations[5][6].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[5][7].setScene(scenes[SceneType.bambo2.ordinal()]);
        locations[5][8].setScene(scenes[SceneType.beach3.ordinal()]);
        locations[6][0].setScene(scenes[SceneType.jungle2.ordinal()]);
        locations[6][1].setScene(scenes[SceneType.cave.ordinal()]);
        locations[6][2].setScene(scenes[SceneType.lagoon.ordinal()]);
        locations[6][3].setScene(scenes[SceneType.bambo1.ordinal()]);
        locations[6][4].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[6][5].setScene(scenes[SceneType.lagoon.ordinal()]);
        locations[6][6].setScene(scenes[SceneType.bambo1.ordinal()]);
        locations[6][7].setScene(scenes[SceneType.beach4.ordinal()]);
        locations[6][8].setScene(scenes[SceneType.waterfall.ordinal()]);
        locations[7][0].setScene(scenes[SceneType.bambo2.ordinal()]);
        locations[7][1].setScene(scenes[SceneType.cave.ordinal()]);
        locations[7][2].setScene(scenes[SceneType.beach4.ordinal()]);
        locations[7][3].setScene(scenes[SceneType.reef.ordinal()]);
        locations[7][4].setScene(scenes[SceneType.bambo2.ordinal()]);
        locations[7][5].setScene(scenes[SceneType.beach1.ordinal()]);
        locations[7][6].setScene(scenes[SceneType.bambo1.ordinal()]);
        locations[7][7].setScene(scenes[SceneType.beach3.ordinal()]);
        locations[7][8].setScene(scenes[SceneType.beach2.ordinal()]);
        locations[8][0].setScene(scenes[SceneType.jungle3.ordinal()]);
        locations[8][1].setScene(scenes[SceneType.beach1.ordinal()]);
        locations[8][2].setScene(scenes[SceneType.jungle1.ordinal()]);
        locations[8][3].setScene(scenes[SceneType.beach4.ordinal()]);
        locations[8][4].setScene(scenes[SceneType.jungle1.ordinal()]);
        locations[8][5].setScene(scenes[SceneType.bambo2.ordinal()]);
        locations[8][6].setScene(scenes[SceneType.reef.ordinal()]);
        locations[8][7].setScene(scenes[SceneType.camp.ordinal()]);
        locations[8][8].setScene(scenes[SceneType.finish.ordinal()]);
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
