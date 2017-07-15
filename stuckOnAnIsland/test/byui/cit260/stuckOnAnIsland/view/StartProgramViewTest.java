/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.stuckOnAnIsland.view;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RyanHafen
 */
public class StartProgramViewTest {
    
    public StartProgramViewTest() {
    }

    /**
     * Test of displayStartProgramView method, of class StartProgramView.
     */
    @Test
    public void testDisplayStartProgramView() {
        System.out.println("displayStartProgramView");
        StartProgramView instance = new StartProgramView();
        instance.displayStartProgramView();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doAction method, of class StartProgramView.
     */
    @Test
    public void testDoAction() {
        System.out.println("doAction");
        String value = "";
        StartProgramView instance = new StartProgramView();
        boolean expResult = false;
        boolean result = instance.doAction(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
