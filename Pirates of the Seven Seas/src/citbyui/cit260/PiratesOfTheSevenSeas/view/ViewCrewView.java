/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.PiratesOfTheSevenSeas.view;

import static java.time.Clock.system;

/**
 *
 * @author jtemerson
 */
class ViewCrewView {

    int crew = 15;
    
    public ViewCrewView() {
                 System.out.println("\n"
                  + "\n--------------------------------------------"
                  + "\n|                View Crew                 |"
                  + "\n--------------------------------------------\n"
                  + "\n Ye have" + crew + "crew members ready to fight!"
                  + "\n--------------------------------------------"
        );
    }

    void displayMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
