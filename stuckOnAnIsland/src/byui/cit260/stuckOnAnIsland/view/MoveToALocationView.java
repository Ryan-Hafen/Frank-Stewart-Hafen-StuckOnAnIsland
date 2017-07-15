/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.stuckOnAnIsland.view;

import java.util.Scanner;

/**
 *
 * @author RyanHafen
 */
class MoveToALocationView extends View {

//    private String promptMessage;
    public MoveToALocationView() {
//        this.promptMessage =    
        //super( "\\n*** MoveToALocationView() stub function called ***");
        int health = 100;
        int x = 0;
        int y = 0;
        String value = null;
        String value2 = null;
        
        System.out.println("Your health is currently at: " + health);

        System.out.println("Enter a new X coordinate");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();

        System.out.println("Enter a new Y coordinate");
        Scanner in2 = new Scanner(System.in);
        y = in2.nextInt();

        health = health - x;
        health = health - y;

        System.out.println("Your new location is: "
                + x + ", " + y);
        System.out.println("Your are now in the jungle.");
        System.out.println("Your health was decreased to: "
                + health);

        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();

    }

    @Override
    public boolean doAction(String value) {
        return false;
    }
}
