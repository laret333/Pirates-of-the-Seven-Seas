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
public class TravelToView extends View{
    
    private String map;
    
    public TravelToView() {
        super("\n"
                  + "\n-------------------------------------------"
                  + "\n|  1  |  2  |  3  |  4  |  5  |  6  |  7  |"
                  + "\n--------------------------------------------\n"
                  + "   T – Travel to\n"
                  + "   E – Explore\n" 
                  + "   Q – Quit" 
                  + "\n--------------------------------------------"
        );
    }

    @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void displayMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
