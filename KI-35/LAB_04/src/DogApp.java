import KI_35.Dzoban.lab4.*;


import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;

/** Class DogApp implements example of lab№3 program
 *
 * @author Mykola Dzoban
 * @version 1.0.3
 * @since version 1.0.1
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
        int hp,en,age,age2,hun,dream,wash,wash2,food,hour,xPos,vac;
        Scanner scanner = new Scanner(System.in);
        //scanner.useDelimiter("\r?\n");
        out.print("Make your own pet!\n");
        out.print("Please, enter your dog features:\n");
        out.print("Health: ");
        hp = scanner.nextInt();
        out.print("Energy: ");
        en = scanner.nextInt();
        out.print("Age: ");
        age = scanner.nextInt();
        testDog dog = new testDog();
        dog.makeDog(hp,en,age);
        dog.aboutDog();
        out.print("Please, enter your dog features:\n");
        out.print("Hunger: ");
        hun = scanner.nextInt();
        out.print("Dream: ");
        dream = scanner.nextInt();
        out.print("Purity: ");
        wash = scanner.nextInt();
        dog.oppDog(hun,dream,wash);
        out.print("Do you want to feed your dog? If yes - enter number greater than 0, if no - enter 0: ");
        food = scanner.nextInt();
        dog.feedDog(food);
        out.print("Did your dog sleep? If yes - enter hours greater than 0, if no - enter 0: ");
        hour = scanner.nextInt();
        dog.sleepDog(hour);
        out.print("Do you want to wash your dog? If yes - enter wash number greater than 0, if no - enter 0: ");
        wash2 = scanner.nextInt();
        dog.washDog(wash2);
        dog.dogOpp();
        out.print("Do you want to make your dog elder? If yes - enter years greater than 0, if no - enter 0: ");
        age2 = scanner.nextInt();
        dog.makeAgeBigger(age2);
        out.print("If you are in some position - enter coordinate greater than 0, if no - enter 0: ");
        xPos = scanner.nextInt();
        dog.moveDog(xPos);
        out.print("Do you want to walk left with dog? If yes - enter coordinate greater than 0, if no - enter 0: ");
        xPos = scanner.nextInt();
        dog.walkLeftWithDog(xPos);
        out.print("Do you want to walk right with dog? If yes - enter coordinate greater than 0, if no - enter 0: ");
        xPos = scanner.nextInt();
        dog.walkRightWithDog(xPos);
        dog.getDogPosition();
        out.print("Do you want to give your dog a vaccine? If yes - enter value greater than 0.0, if no - enter 0: ");
        vac = scanner.nextInt();
        dog.reactionOnVaccine(vac);
        out.print("Do you want to give your dog a vaccine? If yes - enter value greater than 0.0, if no - enter 0: ");
        vac = scanner.nextInt();
        dog.reactionOnVaccine(vac);
        out.print("Do you want to give your dog a vaccine? If yes - enter value greater than 0.0, if no - enter 0: ");
        vac = scanner.nextInt();
        dog.reactionOnVaccine(vac);
        out.print("Do you want to give your dog a vaccine? If yes - enter value greater than 0.0, if no - enter 0: ");
        vac = scanner.nextInt();
        dog.reactionOnVaccine(vac);
        dog.dis();
    }
}