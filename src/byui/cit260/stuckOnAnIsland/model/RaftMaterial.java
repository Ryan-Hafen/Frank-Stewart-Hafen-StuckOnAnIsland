/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.stuckOnAnIsland.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author RyanHafen
 */
public class RaftMaterial implements Serializable{
    private String materialWood;
    private String materialVine;

    public RaftMaterial() {
    }

    public String getMaterialWood() {
        return materialWood;
    }

    public void setMaterialWood(String materialWood) {
        this.materialWood = materialWood;
    }

    public String getMaterialVine() {
        return materialVine;
    }

    public void setMaterialVine(String materialVine) {
        this.materialVine = materialVine;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.materialWood);
        hash = 41 * hash + Objects.hashCode(this.materialVine);
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
        final RaftMaterial other = (RaftMaterial) obj;
        if (!Objects.equals(this.materialWood, other.materialWood)) {
            return false;
        }
        return Objects.equals(this.materialVine, other.materialVine);
    }

    @Override
    public String toString() {
        return "RaftMaterial{" + "materialWood=" + materialWood + ", materialVine=" + materialVine + '}';
    }
    
    
    
}
