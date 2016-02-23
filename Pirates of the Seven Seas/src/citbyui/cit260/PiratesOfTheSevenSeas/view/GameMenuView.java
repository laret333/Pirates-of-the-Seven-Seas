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
public class GameMenuView {

    private String gameMenu;
    
    public GameMenuView() {
        
        this.gameMenu = "\n"
                  + "\n--------------------------------------------"
                  + "\n|                Game Menu                 |"
                  + "\n--------------------------------------------\n"
                  + "   M – View Map\n"
                  + "   C – View Crew\n"
                  + "   I – View Inventory\n" 
                  + "   F - View Fleet\n" 
                  + "   S – View Ship\n"
                  + "   Q - Return                                 "  
                  + "\n--------------------------------------------"
                ;
        
        
        
        
    }
    
    public void displayGameMenu() {
        boolean done = false; // set flag to not done
        do {
            
            // prompt for and get players name
            String gameMenuOption = this.getGameMenuOption();
            if (gameMenuOption.toUpperCase().equals("Q"))
                return;
            
            // do the requested action and display the next view
            done = this.doAction(gameMenuOption);
            
        } while (!done);
    }
    
     private String getGameMenuOption() {
       Scanner keyboard = new Scanner(System.in);
       String value = ""; //value to be returned
       boolean valid = false; // initialize to not valid
       
       while (!valid) {
           System.out.println("\n" + this.gameMenu);
           
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
           case "M":
               this.viewMap();
               break;
            case"C":
               this.viewCrew();
               break;
            case"I":
               this.viewInventory();
               break;
            case"F":
               this.viewFleet();
               break;
            case"S":
               this.viewShip();
               break;
            default:
                System.out.println("\n*** Arg! Ye have chosen that which exists not! ***\n"
                        + "    *** Belay that choice, and try again! ***");
                break;
       }
       
       return false;
    } 

    private void viewMap() {
        // Create ViewMapView object 
        ViewMapView viewMapView = new ViewMapView();
        
        // Display the main menu view
        viewMapView.displayViewMapView();
    }

    private void viewCrew() {
        System.out.println("\n *** viewCrew () function called *** ");
    }

    private void viewInventory() {
        System.out.println("\n *** viewInventory () function called *** ");
    }

    private void viewFleet() {
        System.out.println("\n *** viewFleet () function called *** ");
    }

    private void viewShip() {
        System.out.println("\n *** viewShip () function called *** ");
    }
     
     
}
