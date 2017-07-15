
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.stuckOnAnIsland.view;

/**
 *
 * @author Adam Frank
 */
public class CollectResourceView extends View {

    
    public CollectResourceView() {
        
        super("\n********************************************************"
                + "\n*  Resource Menu                                       *"
                + "\n*                                                      *"
                + "\n*  W - Bottle of Water                                 *"
                + "\n*  F - Flashlight                                      *"
                + "\n*  T - Tarp                                            *"
                + "\n*  V - Vines                                           *"
                + "\n*  Q - Go Back                                         *"
                + "\n*                                                      *"
                + "\n********************************************************"
        );
    }
    
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); //convert choice to upper case
        return false;
    }

    void collectResource(String resourceAdded) {
        System.out.println("\n*** displayCollectResource() stub function called ***");
    }

    void displayCollectResourceMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
