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
public class Location implements Serializable{
    private Integer row;
    private Integer column;
    private String charted;
    private String uncharted;

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getColumn() {
        return column;
    }

    public void setColumn(Integer column) {
        this.column = column;
    }

    public String getCharted() {
        return charted;
    }

    public void setCharted(String charted) {
        this.charted = charted;
    }

    public String getUncharted() {
        return uncharted;
    }

    public void setUncharted(String uncharted) {
        this.uncharted = uncharted;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.row);
        hash = 89 * hash + Objects.hashCode(this.column);
        hash = 89 * hash + Objects.hashCode(this.charted);
        hash = 89 * hash + Objects.hashCode(this.uncharted);
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
        final Location other = (Location) obj;
        if (!Objects.equals(this.charted, other.charted)) {
            return false;
        }
        if (!Objects.equals(this.uncharted, other.uncharted)) {
            return false;
        }
        if (!Objects.equals(this.row, other.row)) {
            return false;
        }
        if (!Objects.equals(this.column, other.column)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", charted=" + charted + ", uncharted=" + uncharted + '}';
    }

    
    
    public Location() {
    }
    
    
}
