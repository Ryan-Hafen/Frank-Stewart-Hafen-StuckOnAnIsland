/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.stuckOnAnIsland.view;

/**
 *
 * @author RyanHafen
 */
public class IslandInventoryView extends View{
    
//    private String promptMessage;
    
    public IslandInventoryView() {
//        this.promptMessage =    
        //super( "\\n*** IslandInventoryView() stub function called ***");
        
        String inventoryList[] = {"Knife", "Rope", "Water Bottle", "Flashlight"};
        
        System.out.println("Your current inventory is:");
        
        for(int i = 0; i < 4; i++) {
            System.out.println("\nItem " + (i + 1) + ": " + inventoryList[i]);
        }
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
        
    }

    @Override
    public boolean doAction(String value) {
        return false;
    }
}  
