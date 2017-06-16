/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.stuckOnAnIsland.control;

import byui.cit260.stuckOnAnIsland.model.Game;
import byui.cit260.stuckOnAnIsland.model.Player;
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
        System.out.println("\n*** createNewGame sub function called ***");
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

    
}
