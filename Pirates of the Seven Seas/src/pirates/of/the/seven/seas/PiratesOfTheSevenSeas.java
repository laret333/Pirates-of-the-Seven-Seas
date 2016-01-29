/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pirates.of.the.seven.seas;

import byui.cit260.piratesOfTheSevenSeas.model.Game;
import byui.cit260.piratesOfTheSevenSeas.model.Pirates;
import byui.cit260.piratesOfTheSevenSeas.model.Player;

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
        
        //gameInfo.setLocation(1,1);
        //gameInfo = enemiesDefeated.toString();
        

        System.out.println(gameInfo);
        
        // Pirates Class
        Pirates pirateOne = new Pirates();
        
        
        pirateOne.setName("Pirate 1");
        pirateOne.setPiratePoints(100);
        //pirateOne.setCoordinates(1, 2);
        pirateOne.setStatus("Enemy");

        System.out.println(pirateOne);
        
    }   
    
}
