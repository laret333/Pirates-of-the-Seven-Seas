/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesOfTheSevenSeas.model;

import citbyui.cit260.PiratesOfTheSevenSeas.control.FightEnemiesControl;
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
        
        int expResult = 110;
        
        FightEnemiesControl instance = new FightEnemiesControl();
        
        int result = instance.indiansFound(gold, food, cannons);
        
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
    
    /**
     * Test of fightPirates method, of class FightEnemiesControl.
     */
    @Test
    public void testFightPirates() {
        System.out.println("fightPirates");
        
        //input values for test case 1
        System.out.println("\tTest case #1");
        
        int crewPoints = 10;
        int shipHealth = 1;
        int cannons = 10;
        
        int expResult = 110;
        
        FightEnemiesControl instance = new FightEnemiesControl();
        
        int result = instance.fightPirates(crewPoints, cannons);
        
        assertEquals(expResult, result, 0);
        
        //input values for test case 2
        System.out.println("\tTest case #2");
        
        crewPoints = 0;
        shipHealth = 2;
        cannons = 10;
        
        expResult = -1;
        
        result = instance.fightPirates(crewPoints, cannons);
        
        assertEquals(expResult, result, 0);
        
        //input values for test case 3
        System.out.println("\tTest case #3");
        
        crewPoints = 10;
        shipHealth = 2;
        cannons = 0;
        
        expResult = -1;
        
        result = instance.fightPirates(crewPoints, cannons);
        
        assertEquals(expResult, result, 0);
        
        //input values for test case 4
        System.out.println("\tTest case #4");
        
        crewPoints = 10;
        shipHealth = 0;
        cannons = 10;
        
        expResult = -1;
        
        result = instance.fightPirates(crewPoints, cannons);
        
        assertEquals(expResult, result, 0);
        
        //input values for test case 5
        System.out.println("\tTest case #5");
        
        crewPoints = 1;
        shipHealth = 10;
        cannons = 10;
        
        expResult = 20;
        
        result = instance.fightPirates(crewPoints, cannons);
        
        assertEquals(expResult, result, 0);
        
        //input values for test case 6
        System.out.println("\tTest case #6");
        
        crewPoints = 10;
        shipHealth = 2;
        cannons = 1;
        
        expResult = 30;
        
        result = instance.fightPirates(crewPoints, cannons);
        
        assertEquals(expResult, result, 0);
        
        //input values for test case 7
        System.out.println("\tTest case #7");
        
        crewPoints = 10;
        shipHealth = 1;
        cannons = 10;
        
        expResult = 110;
        
        result = instance.fightPirates(crewPoints, cannons);
        
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of fightNavy method, of class FightEnemiesControl.
     */
    @Test
    public void testFightNavy() {
        System.out.println("fightNavy");
        
        //input values for test case 1
        System.out.println("\tTest case #1");
        
        int crewPoints = 20;
        int shipHealth = 100;
        int cannons = 2;
        
        int expResult = 2200;
        
        FightEnemiesControl instance = new FightEnemiesControl();
        
        int result = instance.fightNavy(crewPoints, shipHealth, cannons);
        
        assertEquals(expResult, result, 0.0001);
        
        //input values for test case 2
        System.out.println("\tTest case #2");
        
        crewPoints = 10;
        shipHealth = 100;
        cannons = 0;
        
        expResult = -1;
        
        result = instance.fightNavy(crewPoints, shipHealth, cannons);
        
        assertEquals(expResult, result, 0);
        
        //input values for test case 3
        System.out.println("\tTest case #3");
        
        crewPoints = 9;
        shipHealth = 10;
        cannons = 2;
        
        expResult = -1;
        
        result = instance.fightNavy(crewPoints, shipHealth, cannons);
        
        assertEquals(expResult, result, 0);
        
        //input values for test case 4
        System.out.println("\tTest case #4");
        
        crewPoints = 20;
        shipHealth = 10;
        cannons = 5;
        
        expResult = -1;
        
        result = instance.fightNavy(crewPoints, shipHealth, cannons);
        
        assertEquals(expResult, result, 0);
        
        //input values for test case 5
        System.out.println("\tTest case #5");
        
        crewPoints = 20;
        shipHealth = 100;
        cannons = 1;
        
        expResult = 2100;
        
        result = instance.fightNavy(crewPoints, shipHealth, cannons);
        
        assertEquals(expResult, result, 0);
        
        //input values for test case 6
        System.out.println("\tTest case #6");
        
        crewPoints = 10;
        shipHealth = 100;
        cannons = 2;
        
        expResult = 1200;
        
        result = instance.fightNavy(crewPoints, shipHealth, cannons);
        
        assertEquals(expResult, result, 0);
        
        //input values for test case 7
        System.out.println("\tTest case #7");
        
        crewPoints = 10;
        shipHealth = 100;
        cannons = 3;
        
        expResult = 1300;
        
        result = instance.fightNavy(crewPoints, shipHealth, cannons);
        
        assertEquals(expResult, result, 0);
    }
}
