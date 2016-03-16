/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package citbyui.cit260.PiratesOfTheSevenSeas.control;


import byui.cit260.piratesOfTheSevenSeas.model.Game;
import byui.cit260.piratesOfTheSevenSeas.model.Location;
import byui.cit260.piratesOfTheSevenSeas.model.Map;
import byui.cit260.piratesOfTheSevenSeas.model.Pirate;
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
                  "Argh Captain! Ye have arrived in the first sea. "
                + "Ye must defeat all of the scalywagged enemies "
                + "that dare try to stand against ye. "
                + "There be a port to buy supplies, pirates to fight, "
                + "and it looks like a poor trading ship to loot! ");
        
        startingScene.setMapSymbol(" ST ");
        scenes[SceneIndex.startSea1.ordinal()] = startingScene;

        // sea 2
        RandomScene sea2 = new RandomScene();
        sea2.setDescription(
                  "Argh Captain! Ye have arrived in the second sea. "
                + "Ye must defeat all of the scalywagged enemies "
                + "that dare try to stand against ye. "
                + "There be a port to buy supplies, pirates to fight, "
                + "and what's that on the horizon? ");
        
        sea2.setMapSymbol(" S2 ");
        scenes[SceneIndex.sea2.ordinal()] = sea2;
        
              
        // sea3
        RandomScene sea3 = new RandomScene();
        sea3.setDescription(
                  "Argh Captain! Ye have arrived in the third sea. "
                + "Ye must defeat all of the scalywagged enemies "
                + "that dare try to stand against ye. "
                + "There be a port to buy supplies, pirates to fight, "
                + "and what's that foggy area? Feeling adventurous? ");
        
        sea3.setMapSymbol(" S3 ");
        scenes[SceneIndex.sea3.ordinal()] = sea3;
        
        // sea4
        RandomScene sea4 = new RandomScene();
        sea4.setDescription(
                  "Argh Captain! Ye have arrived in the fourth sea. "
                + "Ye must defeat all of the scalywagged enemies "
                + "that dare try to stand against ye. "
                + "There be a port to buy supplies, pirates to fight, "
                + "and look and that tiny island! ");
        
        sea4.setMapSymbol(" S4 ");
        scenes[SceneIndex.sea4.ordinal()] = sea4;

        // sea5
        RandomScene sea5 = new RandomScene();
        sea5.setDescription(
                  "Argh Captain! Ye have arrived in the fifth sea. "
                + "Ye must defeat all of the scalywagged enemies "
                + "that dare try to stand against ye. "
                + "There be a port to buy supplies, pirates to fight, "
                + "and there be indians on the horizon! ");
        
        sea5.setMapSymbol(" S5 ");
        scenes[SceneIndex.sea5.ordinal()] = sea5;
        
        // sea6
        RandomScene sea6 = new RandomScene();
        sea6.setDescription(
                  "Argh Captain! Ye have arrived in the sixth sea. "
                + "Ye must defeat all of the scalywagged enemies "
                + "that dare try to stand against ye. "
                + "There be a port to buy supplies, pirates to fight, "
                + "and there be a local navy! Shall we fight them, Cap'n? ");
        
        sea6.setMapSymbol(" S6 ");
        scenes[SceneIndex.sea6.ordinal()] = sea6;
        

        // sea7
        RandomScene sea7 = new RandomScene();
        sea7.setDescription(
                  "Argh Captain! Ye have quickly become a fearsome pirate! "
                + "We are rich beyond all other pirates... except one! "
                + "He owns this sea and has not been contested in years. "
                + "The crew stands behind ye if ye choose to fight! "
                + "But Captain, let us not overlook the port to buy supplies! ");
        
        sea7.setMapSymbol(" S7 ");
        scenes[SceneIndex.sea7.ordinal()] = sea7;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        return scenes;
    }

    private static void assignScenesToLocations(Map map, RandomScene[] scenes) {
        Location[][] locations = map.getLocations();

        // start point
        locations[0][0].setScene(scenes[SceneIndex.startSea1.ordinal()]);
        // ....
        
    }

    static void movePiratesToStartingLocation(Map map, Pirate[] actors) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

 
   
    
}
