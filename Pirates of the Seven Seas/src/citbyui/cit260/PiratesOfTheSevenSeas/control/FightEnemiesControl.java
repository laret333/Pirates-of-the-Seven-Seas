/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.PiratesOfTheSevenSeas.control;

import byui.cit260.piratesOfTheSevenSeas.model.Pirate;
import byui.cit260.piratesOfTheSevenSeas.model.Ship;
import citbyui.cit260.PiratesOfTheSevenSeas.exceptions.FightEnemiesControlException;

/**
 *
 * @author Tanner
 */
public class FightEnemiesControl {

    
    
    private static int crewPoints;
    private static int cannons;
    public static int indiansFound(int gold, int food, int cannons) throws FightEnemiesControlException { 

    	
	if (gold < 1 ) {
            throw new FightEnemiesControlException("Cannot fight because you only have " + gold + "gold!");
        }
        
        if (food < 1 ) {
            throw new FightEnemiesControlException("Cannot fight because you only have " + food + "food!");
        }
	
	if (cannons < 1 ) {
            throw new FightEnemiesControlException("Cannot fight because you only have " + cannons + "cannons!");
        }
        
	int victoryPoints = gold * (food + cannons);

	return victoryPoints;
        

    }
    public static int fightPirates(int crewPoints, int cannons) throws FightEnemiesControlException { 

        // TEMPORARY CODE UNTIL GAME IS CREATED
        Ship ship = new Ship();
        ship.setShipHealth(100);
    	ship.setUpgradeHealth(100);
        
        // this is the actual code 
        int shipHealth = ship.getShipHealth();
        

        if (crewPoints < 1 ) {
           throw new FightEnemiesControlException("Cannot fight because you only have " + crewPoints + "crew!");
        }
        
        
        if (shipHealth < 1 ) {
            throw new FightEnemiesControlException("Cannot fight because you only have don't have enough Ship Health!");
        }
	
	if (cannons < 1 ) {
            throw new FightEnemiesControlException("Cannot fight because you only have " + cannons + "cannons!");
        }
        
	int victoryPoints = crewPoints * (cannons + shipHealth);

	
        
        
        
        return victoryPoints;
        

    }
    public static int fightNavy(int crewPoints, int shipHealth, int cannons) {

    	
	if (shipHealth < 100 ) {
            return -1;
        }
        
        if (cannons < 1 ) {
            return -1;
        }
	
	if (crewPoints < 10 ) {
            return -1;
        }
        
	int victoryPoints = shipHealth * (crewPoints + cannons);
 	return victoryPoints;
        

    }
    
    public static int awardVictoryPoints(int victoryPoints, Pirate pirate) {
     
        System.out.println("\n *** awardVictoryPoints stub function called *** ");
        
        
        
      return 1;  
    }

    public static double plunderTrading(int crewPoints, int cannons) throws FightEnemiesControlException {
        
        
        // TEMPORARY CODE UNTIL GAME IS CREATED
        Ship ship = new Ship();
        ship.setShipHealth(100);
    	ship.setUpgradeHealth(100);
        
        // this is the actual code 
        int shipHealth = ship.getShipHealth();
        

        if (crewPoints < 1 ) {
            throw new FightEnemiesControlException("Cannot fight because you only have " + crewPoints + "crew!");
        }
        
        
        if (shipHealth < 1 ) {
            throw new FightEnemiesControlException("Cannot fight because you only have don't have enough Ship Health!");
        }
	
	if (cannons < 1 ) {
            throw new FightEnemiesControlException("Cannot fight because you only have " + cannons + "cannons!");
        }
        
	int victoryPoints = crewPoints * (cannons + shipHealth);

	return victoryPoints;
    }
}
