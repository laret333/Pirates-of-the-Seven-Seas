/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.PiratesOfTheSevenSeas.view;

import java.io.PrintWriter;
import pirates.of.the.seven.seas.PiratesOfTheSevenSeas;

/**
 *
 * @author Owner
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = PiratesOfTheSevenSeas.getOutFile();
    private static final PrintWriter logFile = PiratesOfTheSevenSeas.getLogFile();
    
    public static void display(String className, String errorMessage) {
        
        
        errorFile.println(
            "---------------------------------------------------"
          + "\n- ERROR - " + errorMessage
          + "\n---------------------------------------------------");
        
        // log error
        logFile.println(className + " - " + errorMessage);
    }
    
    
}
