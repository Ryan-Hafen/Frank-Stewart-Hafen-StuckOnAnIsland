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
public class RaftStatus implements Serializable{
    private String description;
    private double raftCompletionPercentage;
    private String raftMaterialList;

    public RaftStatus() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRaftCompletionPercentage() {
        return raftCompletionPercentage;
    }

    public void setRaftCompletionPercentage(double raftCompletionPercentage) {
        this.raftCompletionPercentage = raftCompletionPercentage;
    }

    public String getRaftMaterialList() {
        return raftMaterialList;
    }

    public void setRaftMaterialList(String raftMaterialList) {
        this.raftMaterialList = raftMaterialList;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.description);
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.raftCompletionPercentage) ^ (Double.doubleToLongBits(this.raftCompletionPercentage) >>> 32));
        hash = 43 * hash + Objects.hashCode(this.raftMaterialList);
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
        final RaftStatus other = (RaftStatus) obj;
        if (Double.doubleToLongBits(this.raftCompletionPercentage) != Double.doubleToLongBits(other.raftCompletionPercentage)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.raftMaterialList, other.raftMaterialList)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RaftStatus{" + "description=" + description + ", raftCompletionPercentage=" + raftCompletionPercentage + ", raftMaterialList=" + raftMaterialList + '}';
    }
}
