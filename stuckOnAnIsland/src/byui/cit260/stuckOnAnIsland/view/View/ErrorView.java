/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.stuckOnAnIsland.view.View;

import java.io.PrintWriter;
import stuckonanisland.StuckOnAnIsland;

/**
 *
 * @author Adam Frank
 */
public class ErrorView {
    private static final PrintWriter errorFile = StuckOnAnIsland.getOutFile();
    private static final PrintWriter logFile = StuckOnAnIsland.getLogFile();
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
                "-----------------------------------------------------------"
                +"\n- ERROR - " + errorMessage
                +"\n----------------------------------------------------------");
    }

    //log error
    logFile.println("ERROR - " + errorMessage);
  
    
}
