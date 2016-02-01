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
public class Inventory implements Serializable{
    private String gold;
    private String food;
    private String cannons;

    public String getGold() {
        return gold;
    }

    public void setGold(String gold) {
        this.gold = gold;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getCannons() {
        return cannons;
    }

    public void setCannons(String cannons) {
        this.cannons = cannons;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.gold);
        hash = 73 * hash + Objects.hashCode(this.food);
        hash = 73 * hash + Objects.hashCode(this.cannons);
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
        final Inventory other = (Inventory) obj;
        if (!Objects.equals(this.gold, other.gold)) {
            return false;
        }
        if (!Objects.equals(this.food, other.food)) {
            return false;
        }
        if (!Objects.equals(this.cannons, other.cannons)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Inventory{" + "gold=" + gold + ", food=" + food + ", cannons=" + cannons + '}';
    }

    
    
    public Inventory() {
    }
    
    
}
