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
class DropResourceView extends View{
    
//    private String promptMessage;
    
    public DropResourceView() {
//        this.promptMessage =    
        super("\nConfirm item drop. Your item can't be retrieved if dropped.");
       
    }

    @Override
    public boolean doAction(String value) {
         value = value.toUpperCase(); //convert choice to upper case
         
         switch(value) {
             case "Y":
                 System.out.println("\nYou have dropped the resource.");
                 break;
                
             case "N":
                 System.out.println("\nYou held onto the resource.");
                 break;
                 
             default:
                 System.out.println("\nPlease enter Y or N");
                 break;
         }
        return false;
      
    }
}

