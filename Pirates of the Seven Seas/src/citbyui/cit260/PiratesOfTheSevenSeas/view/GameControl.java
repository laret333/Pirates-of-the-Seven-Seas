/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.PiratesOfTheSevenSeas.view;

import byui.cit260.piratesOfTheSevenSeas.model.Player;

/**
 *
 * @author Tanner
 */
class GameControl {

    static Player createPlayer(String playersName) {
        System.out.println("\n*** createPlayer() function called ***");
        return new Player();
    }
    
}
