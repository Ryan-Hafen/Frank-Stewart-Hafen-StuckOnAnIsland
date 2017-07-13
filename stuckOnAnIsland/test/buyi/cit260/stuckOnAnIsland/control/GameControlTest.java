/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.stuckOnAnIsland.control;

import byui.cit260.stuckOnAnIsland.model.Game;
import byui.cit260.stuckOnAnIsland.model.Map;
import byui.cit260.stuckOnAnIsland.model.Player;
import byui.cit260.stuckOnAnIsland.model.Scene;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RyanHafen
 */
public class GameControlTest {
    
    public GameControlTest() {
    }

    /**
     * Test of createPlayer method, of class GameControl.
     */
    @Test
    public void testCreatePlayer() {
        System.out.println("createPlayer");
        String name = "";
        Player expResult = null;
        Player result = GameControl.createPlayer(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createNewGame method, of class GameControl.
     */
    @Test
    public void testCreateNewGame() {
        System.out.println("createNewGame");
        Player player = null;
        GameControl.createNewGame(player);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createHealth method, of class GameControl.
     */
    @Test
    public void testCreateHealth() {
        System.out.println("createHealth");
        GameControl.createHealth();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createSaveGame method, of class GameControl.
     */
    @Test
    public void testCreateSaveGame() {
        System.out.println("createSaveGame");
        Player player = null;
        Game currentGame = null;
        GameControl.createSaveGame(player, currentGame);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSavedGame method, of class GameControl.
     */
    @Test
    public void testGetSavedGame() {
        System.out.println("getSavedGame");
        String filePath = "";
        GameControl.getSavedGame(filePath);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveGame method, of class GameControl.
     */
    @Test
    public void testSaveGame() throws Exception {
        System.out.println("saveGame");
        Game game = null;
        String filepath = "";
        GameControl.saveGame(game, filepath);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of assignScenesToLocations method, of class GameControl.
     */
    @Test
    public void testAssignScenesToLocations() {
        System.out.println("assignScenesToLocations");
        Map map = null;
        Scene[] scenes = null;
        GameControl.assignScenesToLocations(map, scenes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
