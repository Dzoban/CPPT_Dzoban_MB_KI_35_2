package KI_35.Dzoban.lab4;
import java.io.*;
import static java.lang.System.*;

/**
 * Interface makeVaccine implements method reactionOnVaccine
 */
interface makeVaccine{
    void reactionOnVaccine(int v);
}
/** Class testDog implements test vaccine on your dog
 *
 * @author Mykola Dzoban
 * @version 1.0.3
 * @since version 1.0.1
 *
 */
public class testDog extends Dog implements makeVaccine{

    /**
     * Constructor
     * @throws FileNotFoundException check file existing
     */
    public testDog() throws FileNotFoundException {
    }

    /**
     * Method reactionOnVaccine implements makeVaccine interface
     * @param v The vaccine value
     */
    public void reactionOnVaccine(int v) {
        if(v == 1){
            out.print("Your dog is healthy! Good day!\nHealth: " + super.dogHealth()*v+"\n");
        }
        else if(v >= 2 && v <= 5){
            out.print("Your dog has some trouble with health! Please see a doctor!\nHealth: " + super.dogHealth()*v+"\n");
        }
        else if (v == 0) {
            out.print("Dog did not receive the vaccine! It's also good!\n");
        }
        else if(v < 0)
        {
            out.print("Something went wrong!\n");
        }
        else {
            out.print("Your dog has rabies! It's awful!\nHealth: " + super.dogHealth()*v+"\n");
        }

    }
}
