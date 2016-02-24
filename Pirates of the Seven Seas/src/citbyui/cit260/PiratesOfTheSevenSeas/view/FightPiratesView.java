/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.PiratesOfTheSevenSeas.view;

import java.util.Scanner;


/**
 *
 * @author Tanner
 */
class FightPiratesView {

    private String fightMessage;
    private String cannonsQuestion;
    private int crewPoints = 10;
    private int cannons = 2;
    private int shipHealth = 100;
    private int upgradeShip = 100;

    public FightPiratesView() {
        this.fightMessage = "\n"
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
                  + "You also have " + cannons + " cannons to fight with!\n\n"
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
                String viewCrewPointsInput = this.getCrewPointsInput();
                if (viewCrewPointsInput.toUpperCase().equals("Q"))
                    return;

                // do the requested action and display the next view
                crewDone = this.doAction(viewCrewPointsInput);

            } while (!crewDone);

        //this part is for cannons
        
            boolean cannonsDone = false; // set flag to not done
            do {

                // prompt for and get players name
                String viewCannonsInput = this.getCannonsInput();
                if (viewCannonsInput.toUpperCase().equals("Q"))
                    return;

                // do the requested action and display the next view
                cannonsDone = this.doAction(viewCannonsInput);

            } while (!cannonsDone);

    }
   
    //this part is for getting the crew       
   private String getCrewPointsInput() {
       Scanner keyboard = new Scanner(System.in);

       String crewValue = ""; //value to be returned
       boolean valid = false; // initialize to not valid
       
       while (!valid) {
           System.out.println("\n" + this.fightMessage);
           
           crewValue = keyboard.nextLine(); // get next line on keyboard
           crewValue = crewValue.trim(); //trim off unncessary stuff
           if (crewValue.length() < 1) { //value is blank
               System.out.println("\n*** Captain! Let the crew fight! ***");
               continue;
               
           }
           
           int crewPointsInput = Integer.parseInt(crewValue);
           
           if (crewPointsInput > crewPoints)  {
                System.out.println("\n*** I wish we had that many crew members! ***");
           }
           else if (crewPointsInput <= 0) {
               System.out.println("\n*** Captain! Let the crew fight! ***");
           }
           break;
       }
       return crewValue;
    

//this part is for getting the cannons   
   private String getCannonsInput() {   
       Scanner keyboard = new Scanner(System.in);
       String cannonsValue = ""; //value to be returned
       boolean valid = false; // initialize to not valid
       
       while (!valid) {
           System.out.println("\n" + this.cannonsQuestion);
           
           cannonsValue = keyboard.nextLine(); // get next line on keyboard
           cannonsValue = cannonsValue.trim(); //trim off unncessary stuff
           if (cannonsValue.length() < 1) { //value is blank
               System.out.println("\n*** Captain! Let the crew fight! ***");
               continue;
               
           }
           
           int cannonsInput = Integer.parseInt(cannonsValue);
           
           if (cannonsInput > cannons)  {
                System.out.println("\n*** I wish we had that many crew members! ***");
           }
           else if (cannonsInput <= 0) {
               System.out.println("\n*** Captain! Let the crew fight! ***");
           }
           break;
       }
       return cannonsValue;       
        
    }
    
   private boolean doAction(String choice) {
       
       

       
       
       
       
       
       
       
       
       
       
       
       return false;
    } 
    }
    

