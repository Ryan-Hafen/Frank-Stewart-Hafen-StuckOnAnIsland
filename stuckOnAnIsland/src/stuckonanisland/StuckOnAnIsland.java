/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stuckonanisland;

import byui.cit260.stuckOnAnIsland.model.Game;
import byui.cit260.stuckOnAnIsland.model.Player;

/**
 *
 * @author RyanHafen
 */
public class StuckOnAnIsland {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Ryan");
        playerOne.setBesTime(7.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        Game gameOne = new Game();
        
        gameOne.setNumberRounds(5);
        gameOne.setTotalTime(70000);
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
    }
    
}
