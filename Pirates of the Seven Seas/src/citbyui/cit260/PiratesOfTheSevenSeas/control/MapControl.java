/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package citbyui.cit260.PiratesOfTheSevenSeas.control;


import byui.cit260.piratesOfTheSevenSeas.model.Game;
import byui.cit260.piratesOfTheSevenSeas.model.Location;
import byui.cit260.piratesOfTheSevenSeas.model.Map;
import byui.cit260.piratesOfTheSevenSeas.model.Pirates;
import byui.cit260.piratesOfTheSevenSeas.model.RandomScene;
import byui.cit260.piratesOfTheSevenSeas.model.SceneIndex;
import pirates.of.the.seven.seas.PiratesOfTheSevenSeas;

/**
 *
 * @author jacksonrkj
 */
public class MapControl {
   

    public static Map createMap() {
        // create the map
        Map map = new Map(20, 20);
        
        // create a list of the different scenes in the game
        RandomScene[] scenes = createScenes(); 
        
        // assign the different scenes to locations in the map
        assignScenesToLocations(map, scenes); 
        
        return map;
    }
    
    
    private static RandomScene[] createScenes() {
     
        Game game = PiratesOfTheSevenSeas.getCurrentGame();

        RandomScene[] scenes = new RandomScene[SceneIndex.values().length];

        RandomScene startingScene = new RandomScene();
        startingScene.setDescription(
                  "And we did come to the land which was called Bountiful, "
                + "because of its much fruit and also wild honey; and all "
                + "these things were prepared of the Lord that we might not "
                + "perish. And we beheld the sea, which we called Irreantum, "
                + "which, being interpreted, is many waters");
        
        scenes[SceneIndex.fightEnemies.ordinal()] = startingScene;

        // ...

        return scenes;


    }

    private static void assignScenesToLocations(Map map, RandomScene[] scenes) {
        Location[][] locations = map.getLocations();

        // start point
        locations[0][0].setScene(scenes[SceneIndex.fightEnemies.ordinal()]);
        // ....
        
    }

    static void movePiratesToStartingLocation(Map map, Pirates[] actors) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

 
   
    
}
