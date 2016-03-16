/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesOfTheSevenSeas.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author jtemerson
 */
public class RandomScene implements Serializable{
    private String description;
    private String mapSymbol;
    
    
        
    
    public RandomScene() {
    }
    
    
    
    
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMapSymbol() {
        return mapSymbol;
    }

    public void setMapSymbol(String mapSymbol) {
        this.mapSymbol = mapSymbol;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.description);
        hash = 79 * hash + Objects.hashCode(this.mapSymbol);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RandomScene other = (RandomScene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.mapSymbol, other.mapSymbol)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RandomScene{" + "description=" + description + ", mapSymbol=" + mapSymbol + '}';
    }






    
    
}
