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
    private int woodRequired;
    private int vineRequired;
    private int woodGathered;
    private int vineGathered;

    public RaftStatus() {
        this.description = "Build a raft to escape.";
        this.raftCompletionPercentage = 0.0;
        this.woodRequired = 100;
        this.vineRequired = 100;
        this.woodGathered = 0;
        this.vineGathered = 0;
    }
}
