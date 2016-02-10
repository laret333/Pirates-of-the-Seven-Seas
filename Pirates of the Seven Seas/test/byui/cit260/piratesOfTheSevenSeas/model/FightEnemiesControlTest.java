/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesOfTheSevenSeas.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tanner
 */
public class FightEnemiesControlTest {
    
    public FightEnemiesControlTest() {
    }

    /**
     * Test of indiansFound method, of class FightEnemiesControl.
     */
    @Test
    public void testIndiansFound() {
        System.out.println("indiansFound");
        
        //input values for test case 1
        System.out.println("\tTest case #1");
        
        int gold = 10;
        int food = 10;
        int cannons = 1;
        
        double expResult = 110.0;
        
        FightEnemiesControl instance = new FightEnemiesControl();
        
        double result = instance.indiansFound(gold, food, cannons);
        
        assertEquals(expResult, result, 0.0001);
        
        
        //input values for test case 2
        System.out.println("\tTest case #2");
        
        gold = 0;
        food = 10;
        cannons = 2;
        
        expResult = -1;
        
        result = instance.indiansFound(gold, food, cannons);
        
        assertEquals(expResult, result, 0.0001);
        
        
        //input values for test case 3
        System.out.println("\tTest case #3");
        
        gold = 10;
        food = 0;
        cannons = 2;
        
        expResult = -1;
        
        result = instance.indiansFound(gold, food, cannons);
        
        assertEquals(expResult, result, 0.0001);
        
        
        
        //input values for test case 1
        System.out.println("\tTest case #4");
        
        gold = 10;
        food = 10;
        cannons = 0;
        
        expResult = -1;
        
        result = instance.indiansFound(gold, food, cannons);
        
        assertEquals(expResult, result, 0.0001);
         
        
        
        //input values for test case 1
        System.out.println("\tTest case #5");
        
        gold = 1;
        food = 10;
        cannons = 10;
        
        expResult = 20;
        
        result = instance.indiansFound(gold, food, cannons);
        
        assertEquals(expResult, result, 0.0001);
        
         
        
        
        //input values for test case 1
        System.out.println("\tTest case #6");
        
        gold = 10;
        food = 1;
        cannons = 2;
        
        expResult = 30;
        
        result = instance.indiansFound(gold, food, cannons);
        
        assertEquals(expResult, result, 0.0001);
        
         
        
        
        //input values for test case 1
        System.out.println("\tTest case #7");
        
        gold = 10;
        food = 10;
        cannons = 1;
        
        expResult = 110;
        
        result = instance.indiansFound(gold, food, cannons);
        
        assertEquals(expResult, result, 0.0001);
        
        //fail("The test case is a prototype.");
    }
    
}
