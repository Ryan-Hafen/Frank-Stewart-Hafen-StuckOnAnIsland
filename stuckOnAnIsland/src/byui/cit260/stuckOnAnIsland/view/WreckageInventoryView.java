
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.stuckOnAnIsland.view;

import buyi.cit260.stuckOnAnIsland.control.GameControl;
import byui.cit260.stuckOnAnIsland.model.WreckageInventory;
import java.io.Serializable;
import java.util.Scanner;
import stuckonanisland.StuckOnAnIsland;

/**
 *
 * @author Adam Frank
 */
public class WreckageInventoryView extends View  {
    
//    private String promptMessage;
    
    public WreckageInventoryView() {
//        this.promptMessage =
          super( "\n********************************************************"
               + "\n*  Wreckage Inventory Menu                             *"
               + "\n*                                                      *"
               + "\n*  C - Canned Food                                     *"
               + "\n*  W - Bottle of Water                                 *"
               + "\n*  L - Lighter                                         *"
               + "\n*  F - Flashlight                                      *"
               + "\n*  M - Multi-tool                                      *"
               + "\n*  D - Dry Food                                        *"
               + "\n*  K - Knife                                           *"
               + "\n*  H - Fishing Hooks                                   *"
               + "\n*  T - Tarp                                            *"
               + "\n*  P - Buckets                                         *"
               + "\n*  E - Exit                                            *"
               + "\n*  Please enter your selection:                        *"
               + "\n*                                                      *"
               + "\n********************************************************"
          );
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
            case "C": // pick up canned food
                System.out.println("you picked up canned food");
                break;
            case "W": //pick up water
                System.out.println("you picked up a water bottle");
                break;
            case "L": //pick up lighter
                System.out.println("you picked up a lighter");
                break;
            case "F": //pick up flashlight
                System.out.println("you picked up a flashlight");
                break;
            case "M": //pick up multi-tool
                System.out.println("you picked up a multi-tool");
                break;
            case "D": //pick up dry food
                System.out.println("you picked up dry food");
                break;
            case "K": //pick up knife
                System.out.println("you picked up a knife");
                break;
            case "H": //pick up fishing hooks
                System.out.println("you picked up fishing hooks");
                break;
            case "T": //pick up tarp
                System.out.println("you picked up a tarp");
                break;
            case "P": //pick up buckets
                System.out.println("you picked up buckets");
                break;
            case "E": //quit the wreckage menu
                System.out.println("you closed the wreckage inventory menu");
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

   void displayWrechageInventoryMenu() {
       System.out.println("\n*** displayWrechageInventoryMenu() stub function called ***");
   }
    
}
