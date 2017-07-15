/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.stuckOnAnIsland.view;

/**
 *
 * @author hafenr
 */
public class HelpMenuView extends View{
    
    public HelpMenuView() {   
        super( "\n********************************************************"
             + "\n*  Help Menu                                           *"
             + "\n*                                                      *"
             + "\n*  G - What is the goal of the game?                   *"
             + "\n*  M - How to move                                     *"
             + "\n*  T - How to build tools                              *"
             + "\n*  F - How to fix the raft                             *"
             + "\n*  H - How to collect inventory                        *"
             + "\n*  E - Exit to Main Menu                               *"
             + "\n*                                                      *"
             + "\n*  Please enter your selection:                        *"
             + "\n*                                                      *"
             + "\n********************************************************"
        );
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
            case "G": // What is the goal of the game? 
                System.out.println("\n**** Your goal is to build a raft and escape from the island before you run out of resources? ****");
                break;
            case "M": // How to move
                System.out.println("\n**** Add text for How to move ****");
                break;
            case "T": // How to build tools
                System.out.println("\n**** Add text for Estimating the amount of resources ****");
                break;
            case "F": // How to fix raft
                System.out.println("\n**** Add text for Harvesting resources ****");
                break;
            case "H": // How to collect inventory
                System.out.println("\n**** Add text for Delivering resources to warehouse ****");
                break;
            case "E": // Exit to Main Menu
//                this.displayMainMenuView();
                return true;
//                break;
            default:
                //System.out.println("\n*** Invalid selection *** Try again");
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

//    private void displayMainMenuView() {
//        MainMenuView mainMenuView = new MainMenuView();
//        mainMenuView.display();
//    }

    
    
}
