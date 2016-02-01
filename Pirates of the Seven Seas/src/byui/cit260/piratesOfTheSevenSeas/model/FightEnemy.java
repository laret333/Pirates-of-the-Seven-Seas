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
public class FightEnemy implements Serializable{
    //class instance variables
    private String enemy;
    private Integer crewPoints;
    private Integer numberOfCannons;
    private Integer shipHealth;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.enemy);
        hash = 89 * hash + Objects.hashCode(this.crewPoints);
        hash = 89 * hash + Objects.hashCode(this.numberOfCannons);
        hash = 89 * hash + Objects.hashCode(this.shipHealth);
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
        final FightEnemy other = (FightEnemy) obj;
        if (!Objects.equals(this.enemy, other.enemy)) {
            return false;
        }
        if (!Objects.equals(this.crewPoints, other.crewPoints)) {
            return false;
        }
        if (!Objects.equals(this.numberOfCannons, other.numberOfCannons)) {
            return false;
        }
        if (!Objects.equals(this.shipHealth, other.shipHealth)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FightEnemy{" + "enemy=" + enemy + ", crewPoints=" + crewPoints + ", numberOfCannons=" + numberOfCannons + ", shipHealth=" + shipHealth + '}';
    }

    
    
    public FightEnemy() {
    }

    public String getEnemy() {
        return enemy;
    }

    public void setEnemy(String enemy) {
        this.enemy = enemy;
    }

    public Integer getCrewPoints() {
        return crewPoints;
    }

    public void setCrewPoints(Integer crewPoints) {
        this.crewPoints = crewPoints;
    }

    public Integer getNumberOfCannons() {
        return numberOfCannons;
    }

    public void setNumberOfCannons(Integer numberOfCannons) {
        this.numberOfCannons = numberOfCannons;
    }

    public Integer getShipHealth() {
        return shipHealth;
    }

    public void setShipHealth(Integer shipHealth) {
        this.shipHealth = shipHealth;
    }
    
    
}
