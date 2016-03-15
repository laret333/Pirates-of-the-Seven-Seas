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
public abstract class View implements ViewInterface{
    protected String displayMessage;
    
    public View(){
        
    }
    public View(String message){
        this.displayMessage = message;
    }
    
    public void display() {
        
        boolean done = false; // set flag to not done
        do {
            
            // prompt for and get players name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q"))
                return;
            
            // do the requested action and display the next view
            done = this.doAction(value);
            
        } while (!done);
        
        
    }
    
    
    
    
    
    @Override
    public String getInput() {
       Scanner keyboard = new Scanner(System.in);
       String value = null; //value to be returned
       boolean valid = false; // initialize to not valid
       
       while (!valid) {
           System.out.println("\n" + this.displayMessage);
           
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
    
    
    
}
