/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pirates.of.the.seven.seas;

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
        Player playerOne = new Player();
        
        playerOne.setName("Captain Steel Eagle");
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
    }
    
}
