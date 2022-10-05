package dog_lab3;
import static java.lang.System.*;
/** Class Walk implements the walk with the pet
 *
 * @author Mykola Dzoban
 * @version 1.0.1
 * @since version 1.0
 *
 */
public class Walk {
    private int x, y;
    /**
     * Constructor
     */
    public Walk(){
        this.x = 0;
        this.y = 0;
    }
    /**
     * Method gets the X coordinate value
     * @return  The X coordinate value
     */
    public int getXCoordinate() {
       return this.x;
    }
    /**
     * Method sets the X coordinate value
     * @param x The X coordinate value
     */
    public void setXCoordinate(int x) {
        this.x = x;
    }
    /**
     * Method gets the Y coordinate value
     * @return  The Y coordinate value
     */
    public int getYCoordinate() {
        return this.y;
    }
    /**
     * Method sets the X coordinate value after walk left
     * @param X The X coordinate value
     */
    public void walkLeft(int X){
        this.x -= X;
    }
    /**
     * Method sets the X coordinate value after walk right
     * @param X The X coordinate value
     */
    public void walkRight(int X){
        this.x += X;
    }
    /**
     * Method return the X and Y coordinates value to jump
     * @param x The X coordinate value
     * @param y The Y coordinate value
     */
    public void jump(int x, int y){
        this.x=x;
        this.y=y;
    }
}
