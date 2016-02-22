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
public class HelpMenuView {

    private String helpMenu;
   
    

    public HelpMenuView() {
        this.helpMenu = "\n"
                  + "\n--------------------------------------------"
                  + "\n|                Help Menu                 |"
                  + "\n--------------------------------------------\n"
                  + "   O – Overview of Game\n"
                  + "   I – Inventory - How to gain items\n"
                  + "   C – Crew Members - How to get and maintain\n" 
                  + "   S - Ship and Fleet - How to maintain and upgrade\n" 
                  + "   M – Map - How to navigate" 
                  + "\n--------------------------------------------"
                ;
                  
    }
    
    public void displayHelpMenuView() {
        
        boolean done = false; // set flag to not done
        do {
            
            // prompt for and get players name
            String helpMenuOption = this.getHelpMenuOption();
            if (helpMenuOption.toUpperCase().equals("Q"))
                return;
            
            // do the requested action and display the next view
            done = this.doAction(helpMenuOption);
            
        } while (!done);
        
        
    }
    
    private String getHelpMenuOption() {
       Scanner keyboard = new Scanner(System.in);
       String value = ""; //value to be returned
       boolean valid = false; // initialize to not valid
       
       while (!valid) {
           System.out.println("\n" + this.helpMenu);
           
           value = keyboard.nextLine(); // get next line on keyboard
           value = value.trim(); //trim off unncessary stuff
           
           if (value.length() < 1) { //value is blank
               System.out.println("\n*** Captain! Give us some actual instructions! ***");
               continue;
               
           }
           break;
       }
       return value;
        
    }
    
    private boolean doAction(String choice) {
       choice = choice.toUpperCase();
       
       switch (choice) {
           case "O":
               this.overviewOfGame();
               break;
            case"I":
               this.inventoryQuestions();
               break;
            case"C":
               this.crewMembers();
               break;
            case"S":
               this.shipAndFleet();
               break;
            case"M":
               this.mapMovement();
               break;
            default:
                System.out.println("\n*** Arg! Ye have chosen that which exists not! ***\n"
                        + "    *** Belay that choice, and try again! ***");
                break;
       }
       
       return false;
    }

    private void overviewOfGame() {
        System.out.println("\n*** overviewOfGame() function called ***");
    }

    private void inventoryQuestions() {
        System.out.println("\n*** inventoryQuestions() function called ***");
    }

    private void crewMembers() {
        System.out.println("\n*** crewMembers() function called ***");
    }

    private void shipAndFleet() {
        System.out.println("\n*** shipAndFleet() function called ***");
    }

    private void mapMovement() {
        System.out.println("\n*** mapMovement() function called ***");
    }

 
}
