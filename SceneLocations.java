/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260homework;

/**
 *
 * @author germa_000
 */
public class sceneLocations {
    private static void sceneLocations (Islandmap map, Scene[] scenes){
        Location[][] locations = map.getLocations();
        // A place to begin
        locations[0][0].setScene(scenes[SceneType.reef.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.beacha.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.beachb.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.oceana.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.oceanb.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.bamboa.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.bambob.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.cave.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.oceanc.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.jungle.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.cliff.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.oceand.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.raft.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.lagoon.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.waterfall.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.beachc.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.camp.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.bamboc.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.beachd.ordinal()]);
        locations[5][0].setScene(scenes[SceneType.wreckage.ordinal()]);
    }
}
