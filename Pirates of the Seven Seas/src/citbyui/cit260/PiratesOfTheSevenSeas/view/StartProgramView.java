/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.PiratesOfTheSevenSeas.view;


import byui.cit260.piratesOfTheSevenSeas.model.Player;
import citbyui.cit260.PiratesOfTheSevenSeas.control.GameControl;
import java.util.Scanner;

/**
 *
 * @author Tanner
 */
public class StartProgramView {
    
    public void displayStartProgramView() {
        
        
        //displays the start program view
        
        boolean done = false; //set flag to not done
        do {
            // prompt for and get players name
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q"))//user wants to quit
                return; //exit the game
            
            //do the requested actiona dnd isplay the next view
            done = this.doAction(playersName);
            
        } while (!done);
   
    }
        
    private String getPlayersName() {
       Scanner keyboard = new Scanner(System.in);
       String value = ""; //value to be returned
       boolean valid = false; // initialize to not valid
       
       while (!valid) {
           System.out.println("\n" + this.promptMessage);
           
           value = keyboard.nextLine(); // get next line on keyboard
           value = value.trim(); //trim off unncessary stuff
           
           if (value.length() < 1) { //value is blank
               System.out.println("\nInvalid value: Value cannot be blank");
               continue;
               
           }
           break;
       }
       return value;
    }

    private boolean doAction(String playersName) {
        
        if (playersName.length() < 2) {
            System.out.println("\n*** Give us a name longer than one character, ye scurvy dog! ***");
            return false;
        }   
        
        // call creatPlayer() control funtion
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) {
           System.out.println("\n*** Give us an actual name, Captain! ***");
           return false; 
        }
        
        // display next view
        this.displayNextView(player);
        
        return true; //argh success!
    }    
    
    private String promptMessage;
    
    public StartProgramView() {
        // promptMessage = "Please enter you name"
        // display the banner when the view is created
        this.promptMessage = "\nCaptain! Under what name shall we fly the colors?: ";
        
        this.displayBanner();
        
    }

    private void displayBanner() {
        
        System.out.println(
              "\n************************************************************"
            + "\n* Welcome!                                                 *"
            + "\n*                                                          *"
            + "\n* You are in the sea of Spokania, which has the            *"
            + "\n* port to the first sea that you are to conquer.           *"
            + "\n* Your mission is to conquer all seven seas by plundering  *"
            + "\n* and attacking all enemies that dare stand in your way!   *"
            + "\n*                                                          *"
            + "\n* Because of the battles that you and your pirates will    *"
            + "\n* fight, you must wisely use the gold that you steal       *"
            + "\n* to buy supplies and food, recruit and train new priates, *"
            + "\n* and repair and upgrade your ship. You must keep your     *"
            + "\n* supplies and equipment in order to defeat your enemies   *"
            + "\n* and ultimately conquer the blasted Captain Cannon in     *"
            + "\n* the Great North Sea!                                     *"
            
            );
        
        
    }
    

    private void displayNextView(Player player) {
        System.out.println("\n====================================="
                         + "\n Welcome to the game, Captain " + player.getName() + "!"
                         + "\n Get out there and claim yer seas!"
                         + "\n=====================================");
        
        // Create ViewMapView object 
        MainMenuView mainMenuView = new MainMenuView();
        
        // Display the main menu view
        mainMenuView.displayMainMenuView();
        
    }

        
}
