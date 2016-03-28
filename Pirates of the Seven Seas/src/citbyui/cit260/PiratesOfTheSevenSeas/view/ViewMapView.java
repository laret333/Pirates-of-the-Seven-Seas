/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.PiratesOfTheSevenSeas.view;

import java.util.Scanner;

/**
 *
 * @author jtemerson
 */
public class ViewMapView extends View{
    
    
    public ViewMapView() {
        super( "\n"
                  + "\n--------------------------------------------"
                  + "\n|                View Map                 |"
                  + "\n--------------------------------------------\n"
                  + "   T – Travel to\n"
                  + "   E – Explore\n"
                  + "   F – Fight Local Pirates\n"
                  + "   P – Plunder passing Trading Ship\n"
                  + "   Q – Quit" 
                  + "\n--------------------------------------------"
        );
    }
    @Override
   public boolean doAction(String value) {
       value = value.toUpperCase();
       
       switch (value) {
           case "T":
               this.travelTo();
               break;
            case"E":
               this.explore();
               break;
            case"F":
               this.fightPirates();
               break;
            case"P":
               this.plunderTrading();
               break;
            
            default:
                this.console.println("\n*** Arg! Ye have chosen that which exists not! ***\n"
                        + "    *** Belay that choice, and try again! ***");
                break;
       }
       
       return false;
    } 
    
  
    private void travelTo() {
        // Create TravelToView object 
        TravelToView travelToView = new TravelToView();
        
        // Display the TravelToView
        travelToView.displayMenu();
    }

    private void explore() {
        this.console.println("\n*** startexplore() function called ***");
    }

    private void fightPirates() {
     
     int crewPoints = 10;
     int shipHealth = 100;
     int upgradeShip = 100;
        
        // Create TravelToView object 
        FightPiratesView fightPiratesView = new FightPiratesView("\n"
                  + "\n--------------------------------------------\n"
                  + "Look Captain!\n"
                  + "There is an enemy pirate in our midst!\n"
                  + "The ship looks basic enough, but let's\n"
                  + "check out resources and decide how much\n"
                  + "we need to use in order to win the fight!\n\n"
                  + "If you choose to use all your resources,\n"
                  + "there's a greater chance that you win, \n"  
                  + "but you risk losing or damaging those\n"
                  + "items!\n\n"
         
                  +"Your ship health is " + shipHealth + " out of " + upgradeShip + ".\n\n"
                  + "You have " + crewPoints + " crew members avaiable to fight!\n\n"
                  
                  + "How many crew members do you want in battle?\n" );
        
        // Display the TravelToView
    }

    private void plunderTrading() {
        // Create TravelToView object 
        
        int crewPoints = 10;
        int shipHealth = 100;
        int upgradeShip = 100;
        
        PlunderTradingView plunderTradingView = new PlunderTradingView("\n"
                  + "\n--------------------------------------------\n"
                  + "Ahoy, Captain!\n"
                  + "There is a local trading ship in our midst!\n"
                  + "The ship looks basic enough, but let's\n"
                  + "check out resources and decide how much\n"
                  + "we need to use in order to win the fight!\n\n"
                  + "If you choose to use all your resources,\n"
                  + "there's a greater chance that you win, \n"  
                  + "but you risk losing or damaging those\n"
                  + "items!\n\n"
                  + "Your ship health is " + shipHealth + " out of " + upgradeShip + ".\n\n"
                  + "You have " + crewPoints + " crew members avaiable to fight!\n\n"
                  
                  + "How many crew members do you want in battle?\n"
                );
        
        // Display the TravelToView
        plunderTradingView.display();
    }

    void displayMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
