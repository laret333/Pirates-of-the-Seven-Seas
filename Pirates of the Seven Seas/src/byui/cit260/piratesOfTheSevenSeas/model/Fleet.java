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
public class Fleet implements Serializable{
    private String characterName;
    private String characterStatus;

    public Fleet() {
    }
    
    

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getCharacterStatus() {
        return characterStatus;
    }

    public void setCharacterStatus(String characterStatus) {
        this.characterStatus = characterStatus;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.characterName);
        hash = 89 * hash + Objects.hashCode(this.characterStatus);
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
        final Fleet other = (Fleet) obj;
        if (!Objects.equals(this.characterName, other.characterName)) {
            return false;
        }
        if (!Objects.equals(this.characterStatus, other.characterStatus)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Fleet{" + "characterName=" + characterName + ", characterStatus=" + characterStatus + '}';
    }
    
    
    
}
