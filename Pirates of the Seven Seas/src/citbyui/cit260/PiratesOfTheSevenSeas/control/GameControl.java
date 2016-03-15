/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package citbyui.cit260.PiratesOfTheSevenSeas.control;

import byui.cit260.piratesOfTheSevenSeas.model.Game;
import byui.cit260.piratesOfTheSevenSeas.model.Item;
import byui.cit260.piratesOfTheSevenSeas.model.ItemIndex;
import byui.cit260.piratesOfTheSevenSeas.model.Map;
import byui.cit260.piratesOfTheSevenSeas.model.Pirates;
import byui.cit260.piratesOfTheSevenSeas.model.Player;

import pirates.of.the.seven.seas.PiratesOfTheSevenSeas;

/**
 *
 * @author jacksonrkj
 */



public class GameControl {
    
  
    
    public GameControl() {
    }

public static Player createPlayer(String name) {
        
        if (name == null) {
            return null;
        }    
        
        Player player = new Player();
        player.setName(name);
        
        PiratesOfTheSevenSeas.setPlayer(player); // save the player
        
        return player;
    }


    public static void createNewGame(Player player) 
             {
        
       Game game = new Game(); // create new game
       PiratesOfTheSevenSeas.setCurrentGame(game); // save in CuriousWorkmanship
       
       game.setPlayer(player); // save player in game
       
       // create the inventory list amd save in the game
       Item[] inventoryList = GameControl.createInventoryList();
       game.setItems(inventoryList);
       
    
       Map map = MapControl.createMap(); // create and initialize new map
       game.setMap(map); // save map in game

       // move actors to starting position in the map
      Pirates[] actors = Pirates.createPirates();
       
       MapControl.movePiratesToStartingLocation(map, actors);    
    }
 
    
 

    
  
    public static Item[] createInventoryList() {
        // created array(list) of inventory items    
        Item[] inventory = 
            new Item[ItemIndex.values().length];
        
        Item gold = new Item();
        gold.setName("Gold");
        gold.setAttribute("Gold can be used to purchase items");
        gold.setPrice(0);
        inventory[ItemIndex.gold.ordinal()] = gold;
      
        // ...
   
        return inventory;
    }
    
  
   
    
  
    
}
