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
public class MainMenuView extends View {


    
    public MainMenuView() {
                    super("\n"
                  + "\n--------------------------------------------"
                  + "\n|                Main Menu                 |"
                  + "\n--------------------------------------------\n"
                  + "   N – New Game\n"
                  + "   L – Load Game\n"
                  + "   S – Save Game\n" 
                  + "   H - Help\n" 
                  + "   Q – Quit" 
                  + "\n--------------------------------------------"
                    );
                  
    }
    
    
   
    @Override
    public boolean doAction(String choice) {
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
                this.console.println("\n*** Arg! Ye have chosen that which exists not! ***\n"
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
       gameMenu.display();
    }

    private void startLoadGame() {
        this.console.println("\nEnter the file path for the file where the "
                           + "game was saved.");
        
        String filePath = this.getInput();
        
        try {
            GameControl.getSavedGame(filePath);
        } catch(Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
        
        
    }

    private void startSaveGame() {
        this.console.println("\nEneter the file path for the file where the "
                           + "game is to be saved.");
        
        String filePath = this.getInput();
        
        try {
            GameControl.saveGame(PiratesOfTheSevenSeas.getCurrentGame(), filePath);
        } catch(Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
        
    }

    private void startHelpMenu() {
        // Create MainMenuView object 
        HelpMenuView helpMenuView = new HelpMenuView();

        //display the help menu
        
        helpMenuView.displayMenu();
    }

    private HelpMenuView HelpMenuView() {
        this.console.println("\n *** helpMenuView () function called *** ");
        return null;
    }



    
}
