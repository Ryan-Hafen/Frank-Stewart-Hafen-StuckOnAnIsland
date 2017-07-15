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
class CurrentLocationView extends View{
    
//    private String promptMessage;
    
    public CurrentLocationView() {
//        this.promptMessage =    
        System.out.println( "\nYour map location is currently at (1,1)"
        );
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    @Override
    public boolean doAction(String value) {
        return false;
    }
}  
