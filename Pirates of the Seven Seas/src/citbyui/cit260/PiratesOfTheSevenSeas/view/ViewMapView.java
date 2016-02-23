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
public class ViewMapView {
    
    private String menu;
    
    public ViewMapView() {
        this.menu = "\n"
                  + "\n--------------------------------------------"
                  + "\n|                View Map                 |"
                  + "\n--------------------------------------------\n"
                  + "   T – Travel to\n"
                  + "   E – Explore\n" 
                  + "   Q – Quit" 
                  + "\n--------------------------------------------"
                ;
    }
    void displayViewMapView() {
        
        boolean done = false; // set flag to not done
        do {
            
            // prompt for and get players name
            String viewMapOption = this.getViewMapOption();
            if (viewMapOption.toUpperCase().equals("Q"))
                return;
            
            // do the requested action and display the next view
            done = this.doAction(viewMapOption);
            
        } while (!done);
        
        
    }
   
   private String getViewMapOption() {
       Scanner keyboard = new Scanner(System.in);
       String value = ""; //value to be returned
       boolean valid = false; // initialize to not valid
       
       while (!valid) {
           System.out.println("\n" + this.menu);
           
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
           case "T":
               this.travelTo();
               break;
            case"E":
               this.explore();
               break;
            
            default:
                System.out.println("\n*** Arg! Ye have chosen that which exists not! ***\n"
                        + "    *** Belay that choice, and try again! ***");
                break;
       }
       
       return false;
    } 
    
  
    private void travelTo() {
        System.out.println("\n*** startTravelTo() function called ***");
    }

    private void explore() {
        System.out.println("\n*** startexplore() function called ***");
    }
}
