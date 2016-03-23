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
        
        //fightPirateScene1        
        RandomScene fightPirateScene1 = new RandomScene();
        fightPirateScene1.setDescription(
                  "Prepare yer crew for battle Captain! These Pirates "
                + "look like a nasty bunch of brutes; but you can take them! "
                + "Make suer that you have enough supplies and crew to win "
                + "this battle! ");
        
        fightPirateScene1.setMapSymbol(" P1 ");
        scenes[SceneIndex.fightPirateScene1.ordinal()] = fightPirateScene1;
        
        //fightPirateScene2        
        RandomScene fightPirateScene2 = new RandomScene();
        fightPirateScene2.setDescription(
                  "Prepare yer crew for battle Captain! These Pirates "
                + "look like a nasty bunch of brutes; but you can take them! "
                + "Make suer that you have enough supplies and crew to win "
                + "this battle! ");
        
        fightPirateScene2.setMapSymbol(" P2 ");
        scenes[SceneIndex.fightPirateScene2.ordinal()] = fightPirateScene2;
        
        //fightPirateScene3        
        RandomScene fightPirateScene3 = new RandomScene();
        fightPirateScene3.setDescription(
                  "Prepare yer crew for battle Captain! These Pirates "
                + "look like a nasty bunch of brutes; but you can take them! "
                + "Make suer that you have enough supplies and crew to win "
                + "this battle! ");
        
        fightPirateScene3.setMapSymbol(" P3 ");
        scenes[SceneIndex.fightPirateScene3.ordinal()] = fightPirateScene3;
        
        //fightPirateScene4        
        RandomScene fightPirateScene4 = new RandomScene();
        fightPirateScene4.setDescription(
                  "Prepare yer crew for battle Captain! These Pirates "
                + "look like a nasty bunch of brutes; but you can take them! "
                + "Make suer that you have enough supplies and crew to win "
                + "this battle! ");
        
        fightPirateScene4.setMapSymbol(" P4 ");
        scenes[SceneIndex.fightPirateScene4.ordinal()] = fightPirateScene4;
        
        //fightPirateScene5        
        RandomScene fightPirateScene5 = new RandomScene();
        fightPirateScene5.setDescription(
                  "Prepare yer crew for battle Captain! These Pirates "
                + "look like a nasty bunch of brutes; but you can take them! "
                + "Make suer that you have enough supplies and crew to win "
                + "this battle! ");
        
        fightPirateScene5.setMapSymbol(" P5 ");
        scenes[SceneIndex.fightPirateScene5.ordinal()] = fightPirateScene5;
        
        //fightPirateScene6        
        RandomScene fightPirateScene6 = new RandomScene();
        fightPirateScene6.setDescription(
                  "Prepare yer crew for battle Captain! These Pirates "
                + "look like a nasty bunch of brutes; but you can take them! "
                + "Make suer that you have enough supplies and crew to win "
                + "this battle! ");
        
        fightPirateScene6.setMapSymbol(" P6 ");
        scenes[SceneIndex.fightPirateScene6.ordinal()] = fightPirateScene6;
        
        //fightPirateScene7
        RandomScene fightPirateScene7 = new RandomScene();
        fightPirateScene7.setDescription(
                  "Prepare yer crew for battle Captain! These Pirates "
                + "look like a nasty bunch of brutes; but you can take them! "
                + "Make suer that you have enough supplies and crew to win "
                + "this battle! ");
        
        fightPirateScene7.setMapSymbol(" P7 ");
        scenes[SceneIndex.fightPirateScene7.ordinal()] = fightPirateScene7;
        
        
        // fogscene
        RandomScene fogscene = new RandomScene();
        fogscene.setDescription(
                  "Captain, we can't sea a thing! "
                + "Let's travel in and see what we find! ");
        
        fogscene.setMapSymbol(" FS ");
        scenes[SceneIndex.fogScene.ordinal()] = fogscene;
        
        // islandscene
        RandomScene islandscene = new RandomScene();
        islandscene.setDescription(
                  "An unchartered island, Captain! Let's see if we can find treasure! "
                + "This does look like the lucky island we have all heard about! ");
        
        islandscene.setMapSymbol(" IS ");
        scenes[SceneIndex.islandScene.ordinal()] = islandscene;
        
        // plunderTradingScene
        RandomScene plunderTradingScene = new RandomScene();
        plunderTradingScene.setDescription(
                  "look, Captain, a measley little trading ship. "
                + "I be willing to bet my knickers they are loaded with gold. ");
        
        plunderTradingScene.setMapSymbol(" PT ");
        scenes[SceneIndex.plunderTradingScene.ordinal()] = plunderTradingScene;
        
        // indiansFoundScene
        RandomScene indiansFoundScene = new RandomScene();
        indiansFoundScene.setDescription(
                  "Captain we have found a tribe of Indians! They look like they could be "
                + "helpful to us. Let's see what's going on with them! ");
        
        indiansFoundScene.setMapSymbol(" IN ");
        scenes[SceneIndex.indiansFoundScene.ordinal()] = indiansFoundScene;
        
        // fightNavyScene
        RandomScene fightNavyScene = new RandomScene();
        fightNavyScene.setDescription(
                  "Captain, this navy looks strong. You know the pirate code:  "
                + "Strong ship, strong source of income! ");
        
        fightNavyScene.setMapSymbol(" FN ");
        scenes[SceneIndex.fightNavyScene.ordinal()] = fightNavyScene;
        
        // portScene
        RandomScene portScene = new RandomScene();
        portScene.setDescription(
                  "Port, port, wonderful port! "
                + "Let's buy some supplies and have some fun! ");
        
        portScene.setMapSymbol(" PT ");
        scenes[SceneIndex.portScene.ordinal()] = portScene;   
        
        
        return scenes;
    }

    private static void assignScenesToLocations(Map map, RandomScene[] scenes) {
        Location[][] locations = map.getLocations();

        // start point
        locations[0][0].setScene(scenes[SceneIndex.startSea1.ordinal()]);
        // ....
        
    }

    static void movePiratesToStartingLocation(Map map, Pirate[] pirates) {
        System.out.println("movePiratesToStartingLocation stub function called");
        
//        map = PiratesOfTheSevenSeas.getCurrentGame().getMap();
//        int newRow = coordinates.x-1;
        
        
    }

    

    

 
   
    
}
