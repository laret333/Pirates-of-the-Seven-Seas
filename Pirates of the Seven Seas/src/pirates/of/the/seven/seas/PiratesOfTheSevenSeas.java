/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pirates.of.the.seven.seas;

import byui.cit260.piratesOfTheSevenSeas.model.Game;
import byui.cit260.piratesOfTheSevenSeas.model.Player;
import citbyui.cit260.PiratesOfTheSevenSeas.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Tanner
 */
public class PiratesOfTheSevenSeas {

    /**
     * @param args the command line arguments
     */
    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    private static PrintWriter logFile = null;
    
    
    
    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        PiratesOfTheSevenSeas.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        PiratesOfTheSevenSeas.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        PiratesOfTheSevenSeas.logFile = logFile;
    }
    
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        PiratesOfTheSevenSeas.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        PiratesOfTheSevenSeas.player = player;
    }
    
    
    
    
    public static void main(String[] args) {
        
        
        
        
        
        
        try {
            
            
            PiratesOfTheSevenSeas.inFile = 
                    new BufferedReader(new InputStreamReader(System.in));
            PiratesOfTheSevenSeas.outFile = 
                    new PrintWriter(System.out, true);
            
            String filePath = "log.txt";
            PiratesOfTheSevenSeas.logFile = 
                    new PrintWriter(filePath);
            
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.displayStartProgramView();
            startProgramView.display();
            return;
            
        } catch (Throwable te) {
                System.out.println("Exception: " + te.toString()
                                 + "\nCause: " + te.getCause()
                                 + "\nMessage: " + te.getMessage());
               
        }
         
        
        finally {
            
            try {
                if (PiratesOfTheSevenSeas.inFile != null)
                    PiratesOfTheSevenSeas.inFile.close();
                
                if (PiratesOfTheSevenSeas.outFile != null)
                    PiratesOfTheSevenSeas.outFile.close();
                
                if (PiratesOfTheSevenSeas.logFile != null)
                    PiratesOfTheSevenSeas.logFile.close();
                
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
            
        }
        
    }   
    
    
}
