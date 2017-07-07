/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.stuckOnAnIsland.control;

import byui.cit260.stuckOnAnIsland.model.Map;
import byui.cit260.stuckOnAnIsland.model.Scene;
import java.lang.Math;
import buyi.cit260.stuckOnAnIsland.exceptions.MapControlException;

/**
 *
 * @author Adam Frank
 */
public class MapControl {

    public static Map createMap() {

        Map map = new Map(9, 9);

        Scene[] scenes = createScenes();

        GameControl.assignScenesToLocations(map, scenes);

        return map;
    }

    public enum SceneType {
        wreckage,
        reef,
        beach1,
        beach2,
        beach3,
        beach4,
        bambo1,
        bambo2,
        bambo3,
        cave,
        jungle1,
        jungle2,
        jungle3,
        mountain,
        lagoon,
        waterfall,
        camp,
        finish;
    }

    private static Scene[] createScenes() {
        Scene[] scenes = new Scene[SceneType.values().length];

        Scene startingScene = new Scene();
        startingScene.setDescription("You were in a terrible storm and your "
                + "boat has wrecked on an island."
                + "You are the only survivor.");
        startingScene.setMapSymbol(" ST ");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        scenes[SceneType.wreckage.ordinal()] = startingScene;

        Scene finishScene = new Scene();
        finishScene.setDescription("Congratulations! You raft is complete."
                + "You set sail and are rescured by a "
                + "Spanish merchant ship."
                + "You return home a hero.");
        finishScene.setMapSymbol(" FN ");
        finishScene.setBlocked(false);
        finishScene.setTravelTime(Double.POSITIVE_INFINITY);
        scenes[SceneType.finish.ordinal()] = finishScene;

        Scene reefScene = new Scene();
        reefScene.setDescription("You swim out to the reef to fish.");
        reefScene.setMapSymbol(" RF ");
        reefScene.setBlocked(false);
        reefScene.setTravelTime(1000);
        scenes[SceneType.reef.ordinal()] = reefScene;

        Scene campScene = new Scene();
        campScene.setDescription("This is the camp where you work on building your raft.");
        campScene.setMapSymbol(" BY ");
        campScene.setBlocked(false);
        campScene.setTravelTime(600);
        scenes[SceneType.camp.ordinal()] = campScene;

        Scene beach1Scene = new Scene();
        beach1Scene.setDescription("There are lots of fish here.");
        beach1Scene.setMapSymbol(" . ");
        beach1Scene.setBlocked(false);
        beach1Scene.setTravelTime(100);
        scenes[SceneType.beach1.ordinal()] = beach1Scene;

        Scene beach2Scene = new Scene();
        beach2Scene.setDescription("There are lots of shells here.");
        beach2Scene.setMapSymbol(" . ");
        beach2Scene.setBlocked(false);
        beach2Scene.setTravelTime(200);
        scenes[SceneType.beach2.ordinal()] = beach2Scene;

        Scene beach3Scene = new Scene();
        beach3Scene.setDescription("Look at all that seaweed.");
        beach3Scene.setMapSymbol(" . ");
        beach3Scene.setBlocked(false);
        beach3Scene.setTravelTime(600);
        scenes[SceneType.beach3.ordinal()] = beach3Scene;

        Scene beach4Scene = new Scene();
        beach4Scene.setDescription("I could lay here all day.");
        beach4Scene.setMapSymbol(" . ");
        beach4Scene.setBlocked(false);
        beach4Scene.setTravelTime(800);
        scenes[SceneType.beach4.ordinal()] = beach4Scene;

        Scene bambo1Scene = new Scene();
        bambo1Scene.setDescription("This grove of bamboo is small.");
        bambo1Scene.setMapSymbol(" | ");
        bambo1Scene.setBlocked(false);
        bambo1Scene.setTravelTime(200);
        scenes[SceneType.bambo1.ordinal()] = bambo1Scene;

        Scene bambo2Scene = new Scene();
        bambo2Scene.setDescription("This grove of bamboo have a lot to offer.");
        bambo2Scene.setMapSymbol(" | ");
        bambo2Scene.setBlocked(false);
        bambo2Scene.setTravelTime(400);
        scenes[SceneType.bambo2.ordinal()] = bambo2Scene;

        Scene bambo3Scene = new Scene();
        bambo3Scene.setDescription("You've hit the bamboo mother load.");
        bambo3Scene.setMapSymbol(" | ");
        bambo3Scene.setBlocked(false);
        bambo3Scene.setTravelTime(800);
        scenes[SceneType.bambo1.ordinal()] = bambo3Scene;

        Scene caveScene = new Scene();
        caveScene.setDescription("Maybe there is some food living in there.");
        caveScene.setMapSymbol(" O ");
        caveScene.setBlocked(false);
        caveScene.setTravelTime(240);
        scenes[SceneType.cave.ordinal()] = caveScene;

        Scene jungle1Scene = new Scene();
        jungle1Scene.setMapSymbol(" `||` ");
        jungle1Scene.setDescription("This grove of bamboo is small.");
        jungle1Scene.setBlocked(false);
        jungle1Scene.setTravelTime(200);
        scenes[SceneType.jungle1.ordinal()] = jungle1Scene;

        Scene jungle2Scene = new Scene();
        jungle2Scene.setDescription("This grove of bamboo have a lot to offer.");
        jungle2Scene.setMapSymbol(" `||` ");
        jungle2Scene.setBlocked(false);
        jungle2Scene.setTravelTime(400);
        scenes[SceneType.jungle2.ordinal()] = jungle2Scene;

        Scene jungle3Scene = new Scene();
        jungle3Scene.setDescription("You've hit the bamboo mother load.");
        jungle3Scene.setMapSymbol(" `||` ");
        jungle3Scene.setBlocked(false);
        jungle3Scene.setTravelTime(800);
        scenes[SceneType.jungle3.ordinal()] = jungle3Scene;

        Scene mountainScene = new Scene();
        mountainScene.setDescription("There is plenty of food here, if you can catch it.");
        mountainScene.setMapSymbol(" M ");
        mountainScene.setBlocked(false);
        mountainScene.setTravelTime(1200);
        scenes[SceneType.mountain.ordinal()] = mountainScene;

        Scene lagoonScene = new Scene();
        lagoonScene.setDescription("Here fishy, fishy.");
        lagoonScene.setMapSymbol(" L ");
        lagoonScene.setBlocked(false);
        lagoonScene.setTravelTime(800);
        scenes[SceneType.lagoon.ordinal()] = lagoonScene;

        Scene waterfallScene = new Scene();
        waterfallScene.setDescription("All the fresh water i could drink.");
        waterfallScene.setMapSymbol(" W ");
        waterfallScene.setBlocked(false);
        waterfallScene.setTravelTime(1200);
        scenes[SceneType.waterfall.ordinal()] = waterfallScene;

        return scenes;
    }

    private double endLocation;
    private double startLocation;
    private double startHealth;
    private double endHealth;

    public double getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(double endLocation) {
        this.endLocation = endLocation;
    }

    public double getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(double startLocation) {
        this.startLocation = startLocation;
    }

    public double getStartHealth() {
        return startHealth;
    }

    public void setStartHealth(double startHealth) {
        this.startHealth = startHealth;
    }

    public double getEndHealth() {
        return endHealth;
    }

    public void setEndHealth(double endHealth) {
        this.endHealth = endHealth;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.endLocation) ^ (Double.doubleToLongBits(this.endLocation) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.startLocation) ^ (Double.doubleToLongBits(this.startLocation) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.startHealth) ^ (Double.doubleToLongBits(this.startHealth) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.endHealth) ^ (Double.doubleToLongBits(this.endHealth) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MapControl other = (MapControl) obj;
        if (Double.doubleToLongBits(this.endLocation) != Double.doubleToLongBits(other.endLocation)) {
            return false;
        }
        if (Double.doubleToLongBits(this.startLocation) != Double.doubleToLongBits(other.startLocation)) {
            return false;
        }
        if (Double.doubleToLongBits(this.startHealth) != Double.doubleToLongBits(other.startHealth)) {
            return false;
        }
        if (Double.doubleToLongBits(this.endHealth) != Double.doubleToLongBits(other.endHealth)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MapControl{" + "endLocation=" + endLocation + ", startLocation=" + startLocation + ", startHealth=" + startHealth + ", endHealth=" + endHealth + '}';
    }

    public double calcHealthUsed(double startLocation, double endLocation,
            double startHealth) throws MapControlException {
        endHealth = startHealth - Math.abs(endLocation - startLocation);
        if (endHealth < 0.0) {
            //return -999.0;
            throw new MapControlException("Out of health");

        } else {
            return endHealth;
        }
    }
}
