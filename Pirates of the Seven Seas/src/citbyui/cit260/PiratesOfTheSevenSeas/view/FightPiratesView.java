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
class FightPiratesView {

    private String promptMessage;
    private String cannonsQuestion;
    private int crewPoints = 10;
    private int cannons = 2;
    private int shipHealth = 100;
    private int upgradeShip = 100;

    public FightPiratesView() {
        this.promptMessage = "\n"
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
                  + "Your ship health is " + shipHealth + " out of " + upgradeShip + ".\n\n"
                  + "You have " + crewPoints + " crew members avaiable to fight!\n\n"
                  
                  + "How many crew members do you want in battle?\n"  
                ;
        
        this.cannonsQuestion = "\n"
                + "How many cannons do you want in battle?\n"  
                ;
    }
    
    
       void displayFightPiratesView() {
        // this part is for crew
            boolean crewDone = false; // set flag to not done
            do {

                // prompt for and get players name
                String viewCrewPointsInput = this.getInput();
                if (viewCrewPointsInput.toUpperCase().equals("Q"))
                    return;

                // do the requested action and display the next view
                crewDone = this.doAction(viewCrewPointsInput);

            } while (!crewDone);

      
    }
   
    //this part is for getting the crew       
   private String getInput() {
       Scanner keyboard = new Scanner(System.in);

       String crewValue = ""; //value to be returned
       boolean valid = false; // initialize to not valid
       
       while (!valid) {
           System.out.println("\n" + this.promptMessage);
           
           crewValue = keyboard.nextLine(); // get next line on keyboard
           crewValue = crewValue.trim(); //trim off unncessary stuff
           if (crewValue.length() < 1) { //value is blank
               System.out.println("\n*** The value must be something  ***");
               continue;
               
           }
           break;
       }
       return crewValue;
    

}
    
   private boolean doAction(String crewString) {
       
       int crewInt = Integer.parseInt(crewString);
       
       this.promptMessage = "You  have " + cannons + " cannons to fight with!\n\n"
                            +"How many cannons would you like to use?";
       String viewCannonsInput = this.getInput();
       int cannonsInt = Integer.parseInt(viewCannonsInput);
       
       int victoryPoints = FightEnemiesControl.fightPirates(crewInt, cannonsInt);
       
       if (victoryPoints > 1019) {
           System.out.println("\n\nCongrats, Captain! We've won our first battle!!!");
            // Create ViewMapView object 
        ViewMapView viewMapView = new ViewMapView();
        
        // Display the view map view
        viewMapView.displayViewMapView();   
           
       } else {
           System.out.println("\n\nArg, Captain, we've been beat like yellow-bellied scallywags.\n"
                               + "We'll need to buy some more supplies at the port in order to win!");
            // Create ViewMapView object 
        ViewMapView viewMapView = new ViewMapView();
        
        // Display the view map view
        viewMapView.displayViewMapView();
       }
       
       
       
       
       
       return false;
    } 
    }
    

