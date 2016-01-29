/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pirates.of.the.seven.seas;

import byui.cit260.piratesOfTheSevenSeas.model.Crew;
import byui.cit260.piratesOfTheSevenSeas.model.Fleet;
import byui.cit260.piratesOfTheSevenSeas.model.Game;
import byui.cit260.piratesOfTheSevenSeas.model.Map;
import byui.cit260.piratesOfTheSevenSeas.model.Pirates;
import byui.cit260.piratesOfTheSevenSeas.model.Player;
import byui.cit260.piratesOfTheSevenSeas.model.Ship;
import java.awt.Point;
import java.util.HashSet;

/**
 *
 * @author Tanner
 */
public class PiratesOfTheSevenSeas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        // Player Class
        Player playerOne = new Player();
        
        playerOne.setName("Captain Steel Eagle");
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        // Game Class
        Game gameInfo = new Game();
        
        gameInfo.setLocation(new Point(1,1));
        gameInfo.setEmemiesDefeated(0);
        
        String displayGameInfo = gameInfo.toString();
        //System.out.println(gameInfo);
        
        // Pirates Class
        Pirates pirateOne = new Pirates();
        
        
        pirateOne.setName("Pirate 1");
        pirateOne.setPiratePoints(100);
        pirateOne.setCoordinates(new Point(1,1));
        pirateOne.setStatus("Enemy");

        System.out.println(pirateOne);
        
        //Map Class
        Map location = new Map();
        
        location.setRowCount(4);
        location.setColumnCount(5);
        
        String mapInfo = location.toString();
        System.out.println(mapInfo);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //fleet Class
            Fleet fleetInfo = new Fleet();
            
            fleetInfo.setCharacterName("Pirate's Booty");
            fleetInfo.setCharacterStatus("Friend");
        
            String displayFleetInfo = fleetInfo.toString();
            System.out.println(displayFleetInfo);
            
        //Ship Class
            Ship shipInfo = new Ship();
            
            shipInfo.setShipHealth(100);
        
            shipInfo.setUpgradeHealth(100);
        
            String displayShipInfo = shipInfo.toString();
            System.out.println(displayShipInfo);
        
        //Crew Class
            Crew crewInfo = new Crew();
            
                    
            crewInfo.setNoCrew(10);
            crewInfo.setExperienceLevel(1);
            crewInfo.setCrewPoint(10);
        
            String displayCrewInfo = crewInfo.toString();
            System.out.println(displayCrewInfo);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }   
    
    
}
