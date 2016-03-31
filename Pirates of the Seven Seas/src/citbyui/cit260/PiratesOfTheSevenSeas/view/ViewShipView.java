/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.PiratesOfTheSevenSeas.view;

/**
 *
 * @author jtemerson
 */
class ViewShipView {
    
    int shipHealth = 15;
    
    public ViewShipView() {
                 System.out.println("\n"
                  + "\n--------------------------------------------"
                  + "\n|                View Ship                 |"
                  + "\n--------------------------------------------\n"
                  + "\n Yer ship has" + shipHealth + "ship health"
                  + "\n--------------------------------------------"
        );
    }

    void displayMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
