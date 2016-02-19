/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.PiratesOfTheSevenSeas.view;

import byui.cit260.piratesOfTheSevenSeas.model.Player;
import pirates.of.the.seven.seas.PiratesOfTheSevenSeas;

/**
 *
 * @author Tanner
 */
class GameControl {

    public static Player createPlayer(String name) {
        
        if (name == null) {
            return null;
            
        }
        
        Player player = new Player ();
        player.setName(name);
        
        PiratesOfTheSevenSeas.setPlayer(player); //saves the player
        
        return player;
    
    }
}
