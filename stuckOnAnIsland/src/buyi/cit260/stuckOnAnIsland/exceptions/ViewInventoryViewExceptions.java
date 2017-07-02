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

    public ViewInventoryViewExceptions(String string, Throwable thrw) {
        super(string, thrw);
    }

    public ViewInventoryViewExceptions(Throwable thrw) {
        super(thrw);
    }

    public ViewInventoryViewExceptions(String string, Throwable thrw, boolean bln, boolean bln1) {
        super(string, thrw, bln, bln1);
    }
    
}
