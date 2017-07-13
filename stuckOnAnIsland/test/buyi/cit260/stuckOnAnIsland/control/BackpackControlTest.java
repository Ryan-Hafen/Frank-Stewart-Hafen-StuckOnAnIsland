/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.stuckOnAnIsland.control;

import byui.cit260.stuckOnAnIsland.model.Backpack;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RyanHafen
 */
public class BackpackControlTest {
    
    public BackpackControlTest() {
    }

    /**
     * Test of getTools method, of class BackpackControl.
     */
    @Test
    public void testGetTools() {
        System.out.println("getTools");
        BackpackControl instance = new BackpackControl();
        instance.getTools();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createInventory method, of class BackpackControl.
     */
    @Test
    public void testCreateInventory() {
        System.out.println("createInventory");
        BackpackControl.createInventory();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createBackpack method, of class BackpackControl.
     */
    @Test
    public void testCreateBackpack() {
        System.out.println("createBackpack");
        Backpack expResult = null;
        Backpack result = BackpackControl.createBackpack();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
