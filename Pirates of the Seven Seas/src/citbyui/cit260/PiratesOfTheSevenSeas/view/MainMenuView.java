/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.PiratesOfTheSevenSeas.view;


import citbyui.cit260.PiratesOfTheSevenSeas.control.GameControl;
import java.util.Scanner;
import pirates.of.the.seven.seas.PiratesOfTheSevenSeas;

/**
 *
 * @author Tanner
 */
public class MainMenuView {

    private String menu;
    private String promptMessage;
    
    public MainMenuView() {
        this.menu = "\n"
                  + "\n--------------------------------------------"
                  + "\n|                Main Menu                 |"
                  + "\n--------------------------------------------\n"
                  + "   N – New Game\n"
                  + "   L – Load Game\n"
                  + "   S – Save Game\n" 
                  + "   H - Help\n" 
                  + "   Q – Quit" 
                  + "\n--------------------------------------------"
                ;
                  
    }
    
    
    
    public void displayMainMenuView() {
        
        boolean done = false; // set flag to not done
        do {
            
            // prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
            
        } while (!done);
        
        
    }

    private String getMenuOption() {
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
           case "N":
               this.startNewGame();
               break;
            case"L":
               this.startLoadGame();
               break;
            case"S":
               this.startSaveGame();
               break;
            case"H":
               this.startHelpMenu();
               break;
            default:
                System.out.println("\n*** Arg! Ye have chosen that which exists not! ***\n"
                        + "    *** Belay that choice, and try again! ***");
                break;
       }
       
       return false;
    }

    private void startNewGame() {
       // create new game 
       GameControl.createNewGame(PiratesOfTheSevenSeas.getPlayer());
       
       // display the game menu
       GameMenuView gameMenu = new GameMenuView();
       gameMenu.displayMenu();
    }

    private void startLoadGame() {
        System.out.println("\n*** startLoadGame() function called ***");
    }

    private void startSaveGame() {
        System.out.println("\n*** startSaveGame() function called ***");
    }

    private void startHelpMenu() {
        System.out.println("\n*** startHelpMenu() function called ***");
    }
    
}
