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
public class PlunderTradingView extends View{

    public  String promptMessage;
    private String cannonsQuestion;
    

    public PlunderTradingView(String message) {
        
        super(message);
                
       
        
        
    }

    
@Override
    public boolean doAction(String value) {
       
       int crewInt = Integer.parseInt(value);
       
       
       
       System.out.println("\n"
                  + "How many cannons do you want in battle?\n"  );
       
       //get users imput
       String strCannon = this.getInput();
       //convert value to int and assign to cannons
        int strCannon = Integer.parseInt(viewCannonsInput);
        
       
        String cannons = null;
       
       
       this.promptMessage = "You  have " + cannons + " cannons to fight with!\n\n"
                            +"How many cannons would you like to use?";
       String viewCannonsInput = this.getInput();
       int cannonsInt = Integer.parseInt(viewCannonsInput);
       
       double victoryPoints = FightEnemiesControl.plunderTrading(crewInt, cannonsInt);
       
       if (victoryPoints > 1019) {
           System.out.println("\n\nCongrats, Captain! We've won our first battle!!!");
            // Create ViewMapView object 
        ViewMapView viewMapView = new ViewMapView();
        
        // Display the view map view
        viewMapView.displayMenu();   
           
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

    void displayMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
                
    }

    

