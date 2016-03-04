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
public class GameMenuView extends View{

    
    public GameMenuView() {
        
        super( "\n"
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
        );
    }
        
    @Override
     public boolean doAction(String value) {
       value = value.toUpperCase();
       
       switch (value) {
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
        
        // Display the view map view
        viewMapView.displayMenu();
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
