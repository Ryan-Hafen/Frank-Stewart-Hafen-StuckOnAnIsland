/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.stuckOnAnIsland.view;

import buyi.cit260.stuckOnAnIsland.control.GameControl;
import stuckonanisland.StuckOnAnIsland;

/**
 *
 * @author RyanHafen
 */
class SaveGameView  extends View{
    
//    private String promptMessage;
    
    public SaveGameView() {
//        this.promptMessage =    
        super( "\n****************************************************************"
             + "\n*  Save Game                                                   *"
             + "\n*                                                              *"
             + "\n*  Y - Save Game                                               *"
             + "\n*  N - Return to Game Play Menu                                *"
             + "\n*                                                              *"
             + "\n****************************************************************"
        );
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        switch (value) {
            case "Y": // Save game
                this.saveGame();
                break;
            case "N": // Help menu
                this.displayGameMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    private void saveGame() {
        GameControl.createSaveGame(StuckOnAnIsland.getPlayer(), StuckOnAnIsland.getCurrentGame());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void displayGameMenu() {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
}  
