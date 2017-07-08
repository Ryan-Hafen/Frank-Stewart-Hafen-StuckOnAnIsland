/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stuckonanisland;

import byui.cit260.stuckOnAnIsland.model.Game;
import byui.cit260.stuckOnAnIsland.model.Player;
import byui.cit260.stuckOnAnIsland.view.StartProgramView;
//import com.sun.istack.internal.logging.Logger;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author RyanHafen, added io by Adam
 */
public class StuckOnAnIsland {

    /**
     * @param args the command line arguments
     */
    private static Game currentGame = null;
    private static Player player = null;
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    private static PrintWriter logFile = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        StuckOnAnIsland.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        StuckOnAnIsland.player = player;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        StuckOnAnIsland.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        StuckOnAnIsland.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        StuckOnAnIsland.logFile = logFile;
    }

    public static void main(String[] args) {
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
        
        while (true) {
            try {
                StuckOnAnIsland.inFile
                        = new BufferedReader(new InputStreamReader(System.in));
                StuckOnAnIsland.outFile
                        = new PrintWriter(System.out, true);

                String filePath = "/users/Documents/tmp/logfile.txt"; //MAC
                //String filePath = "C:\Users\Documents\tmp\logfile.txt";  //PC

                StuckOnAnIsland.logFile = new PrintWriter(filePath);

                //StartProgramView startProgramView = new StartProgramView();
                //startProgramView.display();
                break;
            } catch (Exception excp) {
                //System.out.println(excp);
                System.out.println(excp.getCause());
            } finally {
                try {
                    if (StuckOnAnIsland.inFile != null) {
                        StuckOnAnIsland.inFile.close();
                    }
                    if (StuckOnAnIsland.outFile != null) {
                        StuckOnAnIsland.outFile.close();
                    }
                    if (StuckOnAnIsland.logFile != null) {
                        StuckOnAnIsland.logFile.close();
                    }
                } catch (IOException ex) {
                    System.out.println("Error closing files");
                    return;
                }
            }
        }
    }
}
