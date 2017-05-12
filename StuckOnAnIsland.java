/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stuckonanisland;

import byui.cit260.stuckOnAnIsland.model.Game;

/**
 *
 * @author Adam Frank in team setting
 */
public class StuckOnAnIsland {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Game gameOne = new Game();
        
        //use new instance
        gameOne.setTotalTime(314);
        gameOne.setNumberRounds(2000);
        
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        
    }
    
}
