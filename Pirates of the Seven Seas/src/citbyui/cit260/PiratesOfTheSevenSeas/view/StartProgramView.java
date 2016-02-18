/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.PiratesOfTheSevenSeas.view;

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
        System.out.println("\n*** getPlayersName() called ***");
        return "Tanner";
    }

    private boolean doAction(String playersName) {
        System.out.println("\n*** doAction() called ***");
        return true;
    }    
    
    private String promptMessage;
    
    public StartProgramView() {
        // promptMessage = "Please enter you name"
        // display the banner when the view is created
        this.promptMessage = "\nPlease enter your name: ";
        
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

    
}
