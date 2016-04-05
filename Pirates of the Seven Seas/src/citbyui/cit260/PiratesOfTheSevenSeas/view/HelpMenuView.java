/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.PiratesOfTheSevenSeas.view;

import citbyui.cit260.PiratesOfTheSevenSeas.control.GameControl;
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
                this.console.println("\n*** Arg! Ye have chosen that which exists not! ***\n"
                        + "    *** Belay that choice, and try again! ***");
                break;
       }
       
       return false;
    }
  
 
    private void overviewOfGame() {
        this.console.println("\nYou are a new Captain about to conquer the seven seas!"
                + "\nYou are given 10 crew members, 10 food items for them and a cannon to fight."
                + "\nEach sea has a new pirate to conquer and adventures to explore."
                + "\nThere are also ports to buy supplies that are needed.");
    }

    private void inventoryQuestions() {
        this.console.println("\nYour inventory is very important. It contains how much gold, food, "
                + "\nand other supplies you have in order to fight. It's important to make sure you"
                + "\nare prepared when you fight each pirate and go into each sea.");
    }

    private void crewMembers() {
        this.console.println("\nA Captain is nothing without his crew! You start with 10 crew members."
                + "\nThey are incredibly loyal to you, but you need to make sure you have enough food"
                + "\nwhen you travel or you will lose crew members. You can recruit new crew members"
                + "\nin the port of each sea.");
    }

    private void shipAndFleet() {
        this.console.println("\nYou can view your ship and fleet condition in the Game Menu. "
                + "\nYou can upgrade your ship if you have enough gold, and you need to always"
                + "\nmake sure it is consistently repaired or you will not win the battles"
                + "\nyou need to. "
                + "\n\nEach time you defeat a pirate, you win over that pirate and crew. They"
                + "\nwill now help you when you travel to unexplored seas. They will give you gold"
                + "\nor food.");
    }

    private void mapMovement() {
        this.console.println("\nYou can access the map through the Game Menu. Select 'travel to' "
                + "and then you can enter in coordinates to travel to a location. ");
    }



   

 
}
