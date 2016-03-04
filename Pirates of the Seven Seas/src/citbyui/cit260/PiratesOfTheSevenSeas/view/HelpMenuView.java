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
public class HelpMenuView extends View{

   
    

    public HelpMenuView() {
        super( "\n"
                  + "\n--------------------------------------------"
                  + "\n|                Help Menu                 |"
                  + "\n--------------------------------------------\n"
                  + "   O – Overview of Game\n"
                  + "   I – Inventory - How to gain items\n"
                  + "   C – Crew Members - How to get and maintain\n" 
                  + "   S - Ship and Fleet - How to maintain and upgrade\n" 
                  + "   M – Map - How to navigate" 
                  + "\n--------------------------------------------"
        );
                  
    }
    
   
    
    public boolean doAction(String value) {
       value = value.toUpperCase();
       
       switch (value) {
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

    void displayMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
}
