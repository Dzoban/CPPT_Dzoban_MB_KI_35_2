import dog_lab3.*;

import java.io.*;
import static java.lang.System.*;

/** Class DogApp implements example of lab№3 program
*
* @author Mykola Dzoban
* @version 1.0.1
* @since version 1.0
*
*/

public class DogApp {
     /**
     * @param args function parameter
     * @throws FileNotFoundException check file existing
     *
     */
    public static void main(String[] args) throws FileNotFoundException
    {
        out.print("Make your own pet!\n");
        Dog dog = new Dog();
        dog.makeDog(100,100,1);
        dog.aboutDog();
        dog.dogOpp();
        dog.oppDog(2,12,50);
        dog.feedDog(97);
        dog.sleepDog(5);
        dog.washDog(12);
        dog.dogOpp();
        dog.makeAgeBigger(2);
        dog.dogOpp();
        dog.moveDog(2);
        dog.walkLeftWithDog(5);
        dog.walkRightWithDog(1);
        dog.getDogPosition();

    }
}