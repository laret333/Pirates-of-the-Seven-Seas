/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.PiratesOfTheSevenSeas.view;

import citbyui.cit260.PiratesOfTheSevenSeas.control.FightEnemiesControl;
import java.util.Scanner;


/**
 *
 * @author Tanner
 */
public class FightPiratesView extends View{

    

   

    public FightPiratesView(String promptMessage) {
        super(promptMessage);
        
    }

    
    
    
    
    
    
       
   
    @Override
   public boolean doAction(String value) {
       
       
        int cannons = 2;
       
       int crewInt = Integer.parseInt(value);
       
       System.out.println("You  have " + cannons + " cannons to fight with!\n\n"
                            +"How many cannons would you like to use?");
       String viewCannonsInput = this.getInput();
       int cannonsInt = Integer.parseInt(viewCannonsInput);
       
       int victoryPoints = FightEnemiesControl.fightPirates(crewInt, cannonsInt);
       
       if (victoryPoints > 1019) {
           System.out.println("\n\nCongrats, Captain! We've won our first battle!!!");
            // Create ViewMapView object 
        ViewMapView viewMapView = new ViewMapView();
        
        // Display the view map view
        viewMapView.display();   
           
       } else {
           System.out.println("\n\nArg, Captain, we've been beat like yellow-bellied scallywags.\n"
                               + "We'll need to buy some more supplies at the port in order to win!");
            // Create ViewMapView object 
        ViewMapView viewMapView = new ViewMapView();
        
        // Display the view map view
        viewMapView.displayMenu();
       }
       
       return false;
    } 
    }
    

