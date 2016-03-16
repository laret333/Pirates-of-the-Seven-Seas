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
import byui.cit260.piratesOfTheSevenSeas.model.Pirate;
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
      Pirate[] pirates = GameControl.createPirates();
      game.setPirates(pirates);
       
       MapControl.movePiratesToStartingLocation(map, pirates);    
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
        Item food = new Item();
        food.setName("Food");
        food.setAttribute("Food is needed to keep your crew healthy");
        food.setPrice(1);
        inventory[ItemIndex.food.ordinal()] = food;
        
        Item cannons = new Item();
        cannons.setName("Cannons");
        cannons.setAttribute("Cannons are needed to fight enemies");
        cannons.setPrice(3);
        inventory[ItemIndex.cannons.ordinal()] = cannons;
        
        Item crew = new Item();
        crew.setName("Crew");
        crew.setAttribute("The bigger your crew, the more you win");
        crew.setPrice(2);
        inventory[ItemIndex.crew.ordinal()] = crew;
        
        return inventory;
    }
    
    
    private static Pirate[] createPirates() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
  
   
    
  
    
}
