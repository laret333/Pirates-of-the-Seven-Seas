/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.PiratesOfTheSevenSeas.view;

/**
 *
 * @author Tanner
 */
class PlunderTrading {

    private int crewPoints = 10;
    private int cannons = 2;
    private int shipHealth = 100;
    private int upgradeShip = 100;

    void displayPlunderTrading() {
        System.out.println("\n"
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
                  + "Your ship health is" + shipHealth + " out of " + upgradeShip + ".\n\n"
                  + "You have " + crewPoints + " crew members avaiable to fight!\n\n"
                  + "You also have " + cannons + " cannons to fight with!"
                  + "\n--------------------------------------------");
    }

    
}
