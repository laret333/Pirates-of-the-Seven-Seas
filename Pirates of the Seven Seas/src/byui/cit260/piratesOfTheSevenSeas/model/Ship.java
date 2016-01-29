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
public class Ship implements Serializable{
    private Integer shipHealth;
    private Integer upgradeHealth;

    public Ship() {
    }
    
    

    public Integer getShipHealth() {
        return shipHealth;
    }

    public void setShipHealth(Integer shipHealth) {
        this.shipHealth = shipHealth;
    }

    public Integer getUpgradeHealth() {
        return upgradeHealth;
    }

    public void setUpgradeHealth(Integer upgradeHealth) {
        this.upgradeHealth = upgradeHealth;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.shipHealth);
        hash = 83 * hash + Objects.hashCode(this.upgradeHealth);
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
        final Ship other = (Ship) obj;
        if (!Objects.equals(this.shipHealth, other.shipHealth)) {
            return false;
        }
        if (!Objects.equals(this.upgradeHealth, other.upgradeHealth)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ship{" + "shipHealth=" + shipHealth + ", upgradeHealth=" + upgradeHealth + '}';
    }

    
    
    
}
