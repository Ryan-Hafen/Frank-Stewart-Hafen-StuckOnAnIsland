/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.stuckOnAnIsland.model;

import java.io.Serializable;

/**
 *
 * @author Adam Frank
 */
public class Game implements Serializable{
    
    private long totalTime;
    private long numberRounds;
    
    private Player player;
    private RaftStatus raft;
    private Backpack backpack;
    private Map map;
    private IslandInventory[] islandInventory;
    private WreckageInventory[] wreckageInventory;
    private ToolInventory[] toolInventory;
    private RaftMaterial[] raftMaterial;
    
    //constructor
    public Game() {
    }
    public long getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(long totalTime) {
        this.totalTime = totalTime;
    }

    public long getNumberRounds() {
        return numberRounds;
    }

    public void setNumberRounds(long numberRounds) {
        this.numberRounds = numberRounds;
    }
    
    public RaftStatus getRaft() {
        return raft;
    }

    public void setRaft(RaftStatus raft) {
        this.raft = raft;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Backpack getBackpack() {
        return backpack;
    }

    public void setBackpack(Backpack backpack) {
        this.backpack = backpack;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public IslandInventory[] getIslandInventory() {
        return islandInventory;
    }

    public void setIslandInventory(IslandInventory[] islandInventory) {
        this.islandInventory = islandInventory;
    }

    public WreckageInventory[] getWreckageInventory() {
        return wreckageInventory;
    }

    public void setWreckageInventory(WreckageInventory[] wreckageInventory) {
        this.wreckageInventory = wreckageInventory;
    }

    public ToolInventory[] getToolInventory() {
        return toolInventory;
    }

    public void setToolInventory(ToolInventory[] toolInventory) {
        this.toolInventory = toolInventory;
    }

    public RaftMaterial[] getRaftMaterial() {
        return raftMaterial;
    }

    public void setRaftMaterial(RaftMaterial[] raftMaterial) {
        this.raftMaterial = raftMaterial;
    }
    

    //hash code
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + (int) (this.totalTime ^ (this.totalTime >>> 32));
        hash = 47 * hash + (int) (this.numberRounds ^ (this.numberRounds >>> 32));
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
        if (this.totalTime != other.totalTime) {
            return false;
        }
        if (this.numberRounds != other.numberRounds) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + ", numberRounds=" + numberRounds + '}';
    }
}
