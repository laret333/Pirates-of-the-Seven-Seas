/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesOfTheSevenSeas.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Tanner
 */
public class Pirate implements Serializable{

    
    private String name;
    private Integer piratePoints;
    private String status;

    public Pirate() {
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPiratePoints() {
        return piratePoints;
    }

    public void setPiratePoints(Integer piratePoints) {
        this.piratePoints = piratePoints;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + Objects.hashCode(this.piratePoints);
        hash = 89 * hash + Objects.hashCode(this.status);
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
        final Pirate other = (Pirate) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        if (!Objects.equals(this.piratePoints, other.piratePoints)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pirate{" + "name=" + name + ", piratePoints=" + piratePoints + ", status=" + status + '}';
    }

    public void setDescription(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
            
    
    
}
