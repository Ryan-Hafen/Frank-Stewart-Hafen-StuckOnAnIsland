/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.stuckOnAnIsland.control;

import buyi.cit260.stuckOnAnIsland.exceptions.MapControlException;
import byui.cit260.stuckOnAnIsland.model.Map;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 *
 * @author Adam Frank
 */
public class MapControlTest {

    public MapControlTest() {
    }

    /**
     * Test of calcHealthUsed method, of class MapControl.
     */
    @Test
    public void testCalcHealthUsed() {
        System.out.println("Testing calcHealthUsed function");

        /**
         * ****************************************
         * Test Case #1 ***************************************
         */
        System.out.println("Test case #1");

        // input values for test case 1
        double startLocation = 1.0;
        double endLocation = 2.0;
        double startHealth = 10.0;

        // create instance of MapControl
        MapControl instance = new MapControl();

        // expected output value
        double expResult = 9.0;
        double result = 0.0;
        double result2 = 0.0;
        double result3 = 0.0;
        double result4 = 0.0;
        try {

            // call function to run test
            result = instance.calcHealthUsed(startLocation, endLocation, startHealth);

        } catch (MapControlException mce) {
            System.out.println(mce.getMessage());
        }

        // compares the results
        if (expResult == result) {
            System.out.println("\n\tResult is: " + result + "\n\tExpected Result is: "
                    + expResult);
        } else {
            System.out.println("\n\tSomething is wrong here: "
                    + "\n\tEnd Loc: " + endLocation
                    + "\n\tStart Loc: " + startLocation
                    + "\n\tEnd - Start: " + (endLocation - startLocation)
                    + "\n\tResult is: " + result
                    + "\n\tExpected Result is: " + expResult);
        }

        /**
         * ****************************************
         * Test Case #2 ***************************************
         */
        System.out.println("Test case #2");

        // input values for test case 2
        startLocation = 0.0;
        endLocation = 5.0;
        startHealth = 2.0;

        // create instance of MapControl
        MapControl instance2 = new MapControl();

        // expected output value
        double expResult2 = -999.0;

        // call function to run test
        try {
            result2 = instance2.calcHealthUsed(startLocation, endLocation, startHealth);
        } catch (MapControlException mce) {
            System.out.println(mce.getMessage());
        }
        // compares the results
        // compares the results
        if (expResult2 == result2) {
            System.out.println("\n\tResult is: " + result2 + "\n\tExpected Result is: "
                    + expResult2);
        } else {
            System.out.println("\n\tSomething is wrong here: "
                    + "\n\tEnd Loc: " + endLocation
                    + "\n\tStart Loc: " + startLocation
                    + "\n\tEnd - Start: " + (endLocation - startLocation)
                    + "\n\tResult is: " + result
                    + "\n\tExpected Result is: " + expResult);
        }

        /**
         * ****************************************
         * Test Case #3 ***************************************
         */
        System.out.println("Test case #3");

        // input values for test case 3
        startLocation = 9.0;
        endLocation = 5.0;
        startHealth = 3.0;

        // create instance of MapControl
        MapControl instance3 = new MapControl();

        // expected output value
        double expResult3 = -999.0;

        // call function to run test
        try {
            result3 = instance3.calcHealthUsed(startLocation, endLocation, startHealth);
        } catch (MapControlException mce) {
            System.out.println(mce.getMessage());
        }
        // compares the results
        // compares the results
        if (expResult3 == result3) {
            System.out.println("\n\tResult is: " + result3 + "\n\tExpected Result is: "
                    + expResult3);
        } else {
            System.out.println("\n\tSomething is wrong here: "
                    + "\n\tEnd Loc: " + endLocation
                    + "\n\tStart Loc: " + startLocation
                    + "\n\tEnd - Start: " + (endLocation - startLocation)
                    + "\n\tResult is: " + result
                    + "\n\tExpected Result is: " + expResult);
        }

        /**
         * ****************************************
         * Test Case #4 ***************************************
         */
        System.out.println("Test case #4");

        // input values for test case 4
        startLocation = 10.0;
        endLocation = 5.0;
        startHealth = 2.0;

        // create instance of MapControl
        MapControl instance4 = new MapControl();

        // expected output value
        double expResult4 = -999.0;

        // call function to run test
        try {
            result4 = instance4.calcHealthUsed(startLocation, endLocation, startHealth);
        } catch (MapControlException mce) {
            System.out.println(mce.getMessage());
        }
        // compares the results
        // compares the results
        if (expResult4 == result4) {
            System.out.println("\n\tResult is: " + result4 + "\n\tExpected Result is: "
                    + expResult4);
        } else {
            System.out.println("\n\tSomething is wrong here: "
                    + "\n\tEnd Loc: " + endLocation
                    + "\n\tStart Loc: " + startLocation
                    + "\n\tEnd - Start: " + (endLocation - startLocation)
                    + "\n\tResult is: " + result
                    + "\n\tExpected Result is: " + expResult);
        }

    }

    /**
     * Test of createMap method, of class MapControl.
     */
    @Test
    public void testCreateMap() {
        System.out.println("createMap");
        Map expResult = null;
        Map result = MapControl.createMap();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEndLocation method, of class MapControl.
     */
    @Test
    public void testGetEndLocation() {
        System.out.println("getEndLocation");
        MapControl instance = new MapControl();
        double expResult = 0.0;
        double result = instance.getEndLocation();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEndLocation method, of class MapControl.
     */
    @Test
    public void testSetEndLocation() {
        System.out.println("setEndLocation");
        double endLocation = 0.0;
        MapControl instance = new MapControl();
        instance.setEndLocation(endLocation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStartLocation method, of class MapControl.
     */
    @Test
    public void testGetStartLocation() {
        System.out.println("getStartLocation");
        MapControl instance = new MapControl();
        double expResult = 0.0;
        double result = instance.getStartLocation();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStartLocation method, of class MapControl.
     */
    @Test
    public void testSetStartLocation() {
        System.out.println("setStartLocation");
        double startLocation = 0.0;
        MapControl instance = new MapControl();
        instance.setStartLocation(startLocation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStartHealth method, of class MapControl.
     */
    @Test
    public void testGetStartHealth() {
        System.out.println("getStartHealth");
        MapControl instance = new MapControl();
        double expResult = 0.0;
        double result = instance.getStartHealth();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStartHealth method, of class MapControl.
     */
    @Test
    public void testSetStartHealth() {
        System.out.println("setStartHealth");
        double startHealth = 0.0;
        MapControl instance = new MapControl();
        instance.setStartHealth(startHealth);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEndHealth method, of class MapControl.
     */
    @Test
    public void testGetEndHealth() {
        System.out.println("getEndHealth");
        MapControl instance = new MapControl();
        double expResult = 0.0;
        double result = instance.getEndHealth();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEndHealth method, of class MapControl.
     */
    @Test
    public void testSetEndHealth() {
        System.out.println("setEndHealth");
        double endHealth = 0.0;
        MapControl instance = new MapControl();
        instance.setEndHealth(endHealth);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class MapControl.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        MapControl instance = new MapControl();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class MapControl.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        MapControl instance = new MapControl();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class MapControl.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        MapControl instance = new MapControl();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
