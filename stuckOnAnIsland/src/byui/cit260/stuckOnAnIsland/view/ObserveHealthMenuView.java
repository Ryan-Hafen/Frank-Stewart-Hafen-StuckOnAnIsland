/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package byui.cit260.stuckOnAnIsland.view;

/**
 *
 * @author RyanHafen
 */
//class ObserveHealthMenuView {

 //   void displayObserveHealthMenu() {
//        System.out.println("\n*** displayObserveHealthMenu() stub function called ***");
 //   }
    
//}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.stuckOnAnIsland.view;

import buyi.cit260.stuckOnAnIsland.control.GameControl;

/**
 *
 * @author germa_000
 */
public class ObserveHealthMenuView extends View{
    
//    private String promptMessage;
    
    public ObserveHealthMenuView() {
//        this.promptMessage =     
        super("\n********************************************************"
             + "\n*  Health Menu                                        *"
             + "\n*                                                     *"
             + "\n*  H - View Health Status                             *"
             + "\n*  R - Restore Health                                 *"
             + "\n*  S - Save game                                      *"
             + "\n*  E - Exit                                           *"
             + "\n*  Please enter your selection:                       *"
             + "\n*                                                     *"
             + "\n*******************************************************"
        );
    }
    
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
            case "H": // view health status
                this.viewHealth();
                break;
            case "R": // restore health
                this.restoreHealth();
                break;
            case "S": // save the current game
                this.saveGame();
                break;
            case "E": //quit the wreckage menu
                System.out.println("you closed the Health menu");
                return true;
            default:
                //System.out.println("\n*** Invalid selection *** Try again");
                 ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    private void viewHealth() {
        GameControl.createHealth ();
        
        // display ealth status
        HealthView viewHealth = new HealthView();
        viewHealth.display();
    }

    private void saveGame() {
        System.out.println("\n*** saveGame function called ***");
    }

    private void restoreHealth() {
        System.out.println("\n*** restoreHealth function called ***");
    }
    
}
