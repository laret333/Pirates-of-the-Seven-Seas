/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.PiratesOfTheSevenSeas.control;

/**
 *
 * @author Tanner
 */
public class FightEnemiesControl {
    public double indiansFound(int gold, int food, int cannons) { 

    	
	if (gold < 1 ) {
            return -1;
        }
        
        if (food < 1 ) {
            return -1;
        }
	
	if (cannons < 1 ) {
            return -1;
        }
        
	double victoryPoints = gold * (food + cannons);

	return victoryPoints;
        

    }
    public double fightPirates(int crewPoints, int shipHealth, int cannons) { 

    	
	if (crewPoints < 1 ) {
            return -1;
        }
        
        if (shipHealth < 1 ) {
            return -1;
        }
	
	if (cannons < 1 ) {
            return -1;
        }
        
	double victoryPoints = crewPoints * (cannons + shipHealth);

	return victoryPoints;
        

    }
    public double fightNavy(int crewPoints, int shipHealth, int cannons) { 

    	
	if (shipHealth < 100 ) {
            return -1;
        }
        
        if (cannons < 1 ) {
            return -1;
        }
	
	if (crewPoints < 10 ) {
            return -1;
        }
        
	double victoryPoints = shipHealth * (crewPoints + cannons);

	return victoryPoints;
        

    }
}
