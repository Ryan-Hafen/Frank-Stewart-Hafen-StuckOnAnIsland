/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.stuckOnAnIsland.exceptions;

/**
 * @author Ryan Hafen
 * @author John Stewart
 */
public class BuildControlException extends Exception {

    public BuildControlException() {
    }

    public BuildControlException(String string) {
        super(string);
    }

    public BuildControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public BuildControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public BuildControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
