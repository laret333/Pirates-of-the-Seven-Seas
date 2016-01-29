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
public class Game implements Serializable{
    private Integer ememiesDefeated;
    private Point location;

    public Game() {
    }
    
    

    public Integer getEmemiesDefeated() {
        return ememiesDefeated;
    }

    public void setEmemiesDefeated(Integer ememiesDefeated) {
        this.ememiesDefeated = ememiesDefeated;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.ememiesDefeated);
        hash = 61 * hash + Objects.hashCode(this.location);
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
        final Game other = (Game) obj;
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        if (!Objects.equals(this.ememiesDefeated, other.ememiesDefeated)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "ememiesDefeated=" + ememiesDefeated + ", location=" + location + '}';
    }
    
    
    
}
