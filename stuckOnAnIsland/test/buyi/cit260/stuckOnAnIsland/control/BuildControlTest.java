/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.stuckOnAnIsland.control;

import buyi.cit260.stuckOnAnIsland.exceptions.BuildControlException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RyanHafen
 */
public class BuildControlTest {

    public BuildControlTest() {
    }

    /**
     * Test of calcWoodNeeded method, of class BuildControl.
     */
    @Test
    public void testCalcWoodNeeded() {
        System.out.println("calcWoodNeeded");

        /**
         * ****************************************
         * Test Case #1 ***************************************
         */
        System.out.println("Test case #1");

        // input values for test case 1
        double amountInInventory = 50.0;
        double amountRequired = 100.0;
        double result = 0.0;
        // create instance of BuildControl
        BuildControl instance = new BuildControl();

        // expected output value
        double expResult = 50.0;

        // call function to run test
        try {
            result = instance.calcWoodNeeded(amountInInventory, amountRequired);
        } catch (BuildControlException bce) {
            System.out.println(bce.getMessage());
        }

        // compare expected return value twith actual value returned
        assertEquals(expResult, result, 0.0);

        /**
         * ****************************************
         * Test Case #2 ***************************************
         */
        System.out.println("\tTest case #2");

        // input values for test case 1
        amountInInventory = -1.0;
        amountRequired = 100.0;

        // expected output value
        expResult = -1.0;

        // call function to run test
        try {
            result = instance.calcWoodNeeded(amountInInventory, amountRequired);
        } catch (BuildControlException bce) {
            System.out.println(bce.getMessage());
        }

        // compare expected return value twith actual value returned
        assertEquals(expResult, result, 0.0);

        /**
         * ****************************************
         * Test Case #3 ***************************************
         */
        System.out.println("\tTest case #3");

        // input values for test case 1
        amountInInventory = 50.0;
        amountRequired = -1.0;

        // expected output value
        expResult = -1.0;

        // call function to run test
        try {
            result = instance.calcWoodNeeded(amountInInventory, amountRequired);
        } catch (BuildControlException bce) {
            System.out.println(bce.getMessage());
        }
        // compare expected return value twith actual value returned
        assertEquals(expResult, result, 0.0);

        /**
         * ****************************************
         * Test Case #4 ***************************************
         */
        System.out.println("\tTest case #4");

        // input values for test case 1
        amountInInventory = 101.0;
        amountRequired = 100.0;

        // expected output value
        expResult = -1.0;

        // call function to run test
        try {
            result = instance.calcWoodNeeded(amountInInventory, amountRequired);
        } catch (BuildControlException bce) {
            System.out.println(bce.getMessage());
        }

        // compare expected return value twith actual value returned
        assertEquals(expResult, result, 0.0);

        /**
         * ***************************************
         * Test Case #5 ***************************************
         */
        System.out.println("\tTest case #5");

        // input values for test case 1
        amountInInventory = 0.0;
        amountRequired = 100.0;

        // expected output value
        expResult = 100.0;

        // call function to run test
        try {
            result = instance.calcWoodNeeded(amountInInventory, amountRequired);
        } catch (BuildControlException bce) {
            System.out.println(bce.getMessage());
        }

        // compare expected return value twith actual value returned
        assertEquals(expResult, result, 0.0);

        /**
         * ****************************************
         * Test Case #6 ***************************************
         */
        System.out.println("\tTest case #6");

        // input values for test case 1
        amountInInventory = 100.0;
        amountRequired = 100.0;

        // expected output value
        expResult = 0.0;

        // call function to run test
        try {
            result = instance.calcWoodNeeded(amountInInventory, amountRequired);
        } catch (BuildControlException bce) {
            System.out.println(bce.getMessage());
        }

        // compare expected return value twith actual value returned
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of calcVineNeeded method, of class BuildControl.
     */
    @Test
    public void testCalcVineNeeded() throws BuildControlException {
        System.out.println("calcVineNeeded");

        /**
         * ****************************************
         * Test Case #1 ***************************************
         */
        System.out.println("Test case #1");

        // input values for test case 1
        double amountInInventory = 50.0;
        double amountRequired = 100.0;
        double result = 0.0;

        // create instance of BuildControl
        BuildControl instance = new BuildControl();

        // expected output value
        double expResult = 50.0;

        // call function to run test
        try {
            result = instance.calcVineNeeded(amountInInventory, amountRequired);
        } catch (BuildControlException bce) {
            System.out.println(bce.getMessage());
        }

        // compare expected return value twith actual value returned
        assertEquals(expResult, result, 0.0);

        /**
         * ****************************************
         * Test Case #2 ***************************************
         */
        System.out.println("\tTest case #2");

        // input values for test case 1
        amountInInventory = -1.0;
        amountRequired = 100.0;

        // expected output value
        expResult = -1.0;

        // call function to run test
        try {
            result = instance.calcVineNeeded(amountInInventory, amountRequired);
        } catch (BuildControlException bce) {
            System.out.println(bce.getMessage());
        }
        // compare expected return value twith actual value returned
        assertEquals(expResult, result, 0.0);

        /**
         * ****************************************
         * Test Case #3 ***************************************
         */
        System.out.println("\tTest case #3");

        // input values for test case 1
        amountInInventory = 50.0;
        amountRequired = -1.0;

        // expected output value
        expResult = -1.0;

        // call function to run test
        try {
            result = instance.calcVineNeeded(amountInInventory, amountRequired);
        } catch (BuildControlException bce) {
            System.out.println(bce.getMessage());
        }
        // compare expected return value twith actual value returned
        assertEquals(expResult, result, 0.0);

        /**
         * ****************************************
         * Test Case #4 ***************************************
         */
        System.out.println("\tTest case #4");

        // input values for test case 1
        amountInInventory = 101.0;
        amountRequired = 100.0;

        // expected output value
        expResult = -1.0;

        // call function to run test
        try {
            result = instance.calcVineNeeded(amountInInventory, amountRequired);
        } catch (BuildControlException bce) {
            System.out.println(bce.getMessage());
        }
        // compare expected return value twith actual value returned
        assertEquals(expResult, result, 0.0);

        /**
         * ***************************************
         * Test Case #5 ***************************************
         */
        System.out.println("\tTest case #5");

        // input values for test case 1
        amountInInventory = 0.0;
        amountRequired = 100.0;

        // expected output value
        expResult = 100.0;

        // call function to run test
        try {
            result = instance.calcVineNeeded(amountInInventory, amountRequired);
        } catch (BuildControlException bce) {
            System.out.println(bce.getMessage());
        }
        // compare expected return value twith actual value returned
        assertEquals(expResult, result, 0.0);

        /**
         * ****************************************
         * Test Case #6 ***************************************
         */
        System.out.println("\tTest case #6");

        // input values for test case 1
        amountInInventory = 100.0;
        amountRequired = 100.0;

        // expected output value
        expResult = 0.0;

        // call function to run test
        try {
            result = instance.calcVineNeeded(amountInInventory, amountRequired);
        } catch (BuildControlException bce) {
            System.out.println(bce.getMessage());
        }
        // compare expected return value twith actual value returned
        assertEquals(expResult, result, 0.0);
    }

}
