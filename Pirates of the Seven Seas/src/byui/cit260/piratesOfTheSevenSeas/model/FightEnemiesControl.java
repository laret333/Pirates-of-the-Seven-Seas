/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesOfTheSevenSeas.model;

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
}
