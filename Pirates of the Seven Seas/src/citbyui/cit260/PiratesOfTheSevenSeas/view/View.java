/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.PiratesOfTheSevenSeas.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import pirates.of.the.seven.seas.PiratesOfTheSevenSeas;

/**
 *
 * @author jtemerson
 */
public abstract class View implements ViewInterface{
    protected String displayMessage;
    
    protected final BufferedReader keyboard = PiratesOfTheSevenSeas.getInFile();
    protected final PrintWriter console = PiratesOfTheSevenSeas.getOutFile();
    
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
       
       String value = null; //value to be returned
       boolean valid = false; // initialize to not valid
    
            while (!valid) {
           try {
               this.console.println("\n" + this.displayMessage);
               
               
               value = this.keyboard.readLine(); // get next line on keyboard
               
               value = value.trim(); //trim off unncessary stuff
               
               if (value.length() < 1) { //value is blank
                   ErrorView.display(this.getClass().getName(),
                           "\n*** Captain! Give us some actual instructions! ***");
                   continue;
                   
               }
               break;
           } catch (IOException ex) {
               ErrorView.display(this.getClass().getName(),
                           "Error reading input: " + ex.getMessage());
           }
            }
       
       return value;
        
    }
    
    
    
}
