package buyi.cit260.stuckOnAnIsland.exceptions;

/**
 *
 * @author Adam Frank
 */
public class ViewInventoryViewExceptions extends Exception{
    
     public ViewInventoryViewExceptions() {
    }

    public ViewInventoryViewExceptions(String string) {
        super(string);
    }

    public ViewInventoryViewExceptions(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public ViewInventoryViewExceptions(Throwable thrwbl) {
        super(thrwbl);
    }

    public ViewInventoryViewExceptions(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
