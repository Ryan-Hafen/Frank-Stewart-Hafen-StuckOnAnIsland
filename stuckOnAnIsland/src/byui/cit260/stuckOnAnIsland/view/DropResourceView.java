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
class DropResourceView extends View {

//    private String promptMessage;
    public DropResourceView() {
//        this.promptMessage =    
        super("\nConfirm item drop. Your item can't be retrieved if dropped.");

    }

    @Override
    public boolean doAction(String value) {
        String selection = null;

        //selection = keyboard.nextLine(); // get infile for keyboard
        selection = selection.trim();

        //Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        //String value = ""; // value to be returned
        value = value.toUpperCase(); //convert choice to upper case

        switch (value) {
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
