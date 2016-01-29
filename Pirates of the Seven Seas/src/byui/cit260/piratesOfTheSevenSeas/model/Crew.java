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
 * @author Tanner
 */
public class Crew implements Serializable{
    private Integer noCrew;
    private Integer experienceLevel;
    private Integer crewPoint;

    public Crew() {
    }

    
    
    public Integer getNoCrew() {
        return noCrew;
    }

    public void setNoCrew(Integer noCrew) {
        this.noCrew = noCrew;
    }

    public Integer getExperienceLevel() {
        return experienceLevel;
    }

    public void setExperienceLevel(Integer experienceLevel) {
        this.experienceLevel = experienceLevel;
    }

    public Integer getCrewPoint() {
        return crewPoint;
    }

    public void setCrewPoint(Integer crewPoint) {
        this.crewPoint = crewPoint;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.noCrew);
        hash = 79 * hash + Objects.hashCode(this.experienceLevel);
        hash = 79 * hash + Objects.hashCode(this.crewPoint);
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
        final Crew other = (Crew) obj;
        if (!Objects.equals(this.noCrew, other.noCrew)) {
            return false;
        }
        if (!Objects.equals(this.experienceLevel, other.experienceLevel)) {
            return false;
        }
        if (!Objects.equals(this.crewPoint, other.crewPoint)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Crew{" + "noCrew=" + noCrew + ", experienceLevel=" + experienceLevel + ", crewPoint=" + crewPoint + '}';
    }
    
    
    
    
}
