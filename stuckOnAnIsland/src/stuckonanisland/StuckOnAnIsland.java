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
    }
    
}
