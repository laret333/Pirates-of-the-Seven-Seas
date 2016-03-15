/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.PiratesOfTheSevenSeas.control;

import byui.cit260.piratesOfTheSevenSeas.model.Map;
import byui.cit260.piratesOfTheSevenSeas.model.RandomScene;

/**
 *
 * @author jtemerson
 */
public class MapControl {
    
    public static Map createMap() {
        //create map
        Map map = new Map(20, 20);
        
        //create a list of different scenes in the game
        RandomScene[] randomScene = createRandomScenes();
        
        //assign the different scenes to locations in the map
        assignScenseToLocations (map, randomScene);
        return map;
    }

    static void movePiratesToStartingLocation(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
