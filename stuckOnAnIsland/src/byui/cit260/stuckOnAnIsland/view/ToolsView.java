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
public class ToolsView extends View{

//    private String promptSelection;
//    private String promptMessage;
    
    public ToolsView() {
//        this.promptSelection =
        super( "\n********************************************************"
             + "\n*  Tools Menu                                          *"  
             + "\n*                                                      *"                               
             + "\n*  M - Hammer                                          *"
             + "\n*  H - Hatchet                                         *"
             + "\n*  R - Rope                                            *"
             + "\n*  B - Bow                                             *"                      
             + "\n*  F - Match                                           *"                      
             + "\n*  S - Spear                                           *"                      
             + "\n*  T - Trotline                                        *"                      
             + "\n*  E - Exit                                            *"                     
             + "\n*                                                      *"
             + "\n********************************************************"  
             + "\n*                                                      *"    
             + "\n*                                                      *"  
             + "\n*  Which tool do you want to use?                      *"
        );
    }
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
            case "M": //Hammer
                break;
            case "H": //Hatchet
                break;
            case "R": //Rope
                break;
            case "B": //Bow
                break;
            case "F": //Match
                break;
            case "S": //Spear
                break;
            case "T": //Trotline
                break;
            case "E": //quit the wreckage menu
                System.out.println("you closed the tool menu");
                return true;
        }
            return false;
        
        
        
    }
}
