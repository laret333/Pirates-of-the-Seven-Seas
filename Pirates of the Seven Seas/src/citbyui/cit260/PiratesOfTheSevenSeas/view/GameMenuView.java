/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.PiratesOfTheSevenSeas.view;

import byui.cit260.piratesOfTheSevenSeas.model.Location;
import java.util.Scanner;
import pirates.of.the.seven.seas.PiratesOfTheSevenSeas;



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
                this.console.println("\n*** Arg! Ye have chosen that which exists not! ***\n"
                        + "    *** Belay that choice, and try again! ***");
                break;
       }
       
       return false;
    } 

    private void viewMap() {
        // Create ViewMapView object 
//        ViewMapView viewMapView = new ViewMapView();
        
        // Display the view map view
//        viewMapView.displayMenu();
        Location[][] locations = PiratesOfTheSevenSeas.getCurrentGame().getMap().getLocations();
        this.console.println("Captain, give us a heading!");
        this.console.println("  | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11 | 12 | 13 | 14 |");
        for (int i = 0; i < locations.length; i++) {
            this.console.println("--------------------------------------------------------------");
            this.console.format("%2d", i);
            for (int j = 0; j < locations[0].length; j++) {
                this.console.print("|");
                this.console.print(locations[i][j].getScene().getMapSymbol());

            }
            this.console.println("|");
        }
        this.console.println("--------------------------------------------------------------");
 
    }

    private void viewCrew() {
        // Create ViewMapView object 
        ViewCrewView viewCrewView = new ViewCrewView();
        
        // Display the view map view
        viewCrewView.displayMenu();
    }

    private void viewInventory() {
        this.console.println("\n *** viewInventory () function called *** ");
    }

    private void viewFleet() {
        this.console.println("\n *** viewFleet () function called *** ");
    }

    private void viewShip() {
        // Create ViewMapView object 
        ViewShipView viewShipView = new ViewShipView();
        
        // Display the view map view
        viewShipView.displayMenu();
    }



     
     
}
