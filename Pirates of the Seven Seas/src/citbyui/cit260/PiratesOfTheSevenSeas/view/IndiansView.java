/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.PiratesOfTheSevenSeas.view;

import citbyui.cit260.PiratesOfTheSevenSeas.control.FightEnemiesControl;
import citbyui.cit260.PiratesOfTheSevenSeas.exceptions.FightEnemiesControlException;

/**
 *
 * @author Owner
 */
public class IndiansView extends View {

    public IndiansView(String promptMessage) {
        super(promptMessage);
        
    }
    
    
    
    @Override
    public boolean doAction(String value) {
       int cannons = 2;
       int foodInt = 10;
       
       int crewInt = Integer.parseInt(value);
       
       this.console.println("You  have " + cannons + " cannons to fight with!\n\n"
                            +"How many cannons would you like to use?");
       String viewCannonsInput = this.getInput();
       
       int cannonsInt = Integer.parseInt(viewCannonsInput);
       
       try {
           cannonsInt = Integer.parseInt(viewCannonsInput);
       } catch (NumberFormatException nf) {
           this.console.println("\n Enter here and die, peasant. ");
           return true;
       }
       
       
       int victoryPoints;
        try {
            victoryPoints = FightEnemiesControl.indiansFound(crewInt, cannonsInt, foodInt);
        } catch (FightEnemiesControlException ex) {
            this.console.println(ex.getMessage());
            return true;
        }
       
       if (victoryPoints > 1019) {
           this.console.println("\n\nCongrats, Captain! We've won the allegiance of the Indians!!!");
            // Create ViewMapView object 
        ViewMapView viewMapView = new ViewMapView();
        
        // Display the view map view
        viewMapView.display();   
           
       } else {
           this.console.println("\n\nArg, The Indians certainly have their land claimed.\n"
                               + "We'll need to buy some more supplies at the port in order to win!");
            // Create ViewMapView object 
        ViewMapView viewMapView = new ViewMapView();
        
        // Display the view map view
        viewMapView.displayMenu();
       }
       
       return false;
    }
    
}
