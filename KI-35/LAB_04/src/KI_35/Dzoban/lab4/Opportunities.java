package KI_35.Dzoban.lab4;

import static java.lang.System.*;

/**
 * Class Opportunities implements what user can do with the pet
 *
 * @author Mykola Dzoban
 * @version 1.0.3
 * @since version 1.0.1
 *
 */
public class Opportunities {
    private int dream, hunger, wash;

    /**
     * Constructor
     */
    public Opportunities() {
        dream = 0;
        hunger = 0;
        wash = 0;
    }

    /**
     * Method returns the hunger value
     * 
     * @return The hunger value
     */
    public int getHunger() {
        return hunger;
    }

    /**
     * Method sets the hunger value
     * 
     * @param hunger The hunger value
     */
    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    /**
     * Method sets the hunger value after feed
     * 
     * @param food The food value
     */
    public void Feed(int food) {
        if ((this.hunger + food) <= 0) {
            out.print("Your dog is very hungry!!!\n");
        } else {
            this.hunger += food;
        }
    }

    /**
     * Method returns the dream value
     * 
     * @return The dream value
     */
    public int getDream() {
        return dream;
    }

    /**
     * Method sets the dream value
     * 
     * @param dream The dream value
     */
    public void setDream(int dream) {
        this.dream = dream;
    }

    /**
     * Method sets the dream value after sleep
     * 
     * @param hour The hour value
     */
    public void Sleep(int hour) {
        if (hour <= 0) {
            out.print("Your dog is exhausted!!!\n");
            this.dream = hour;
        } else {
            this.dream = hour;
        }
    }

    /**
     * Method returns the wash value
     * 
     * @return The wash value
     */
    public int getWash() {
        return wash;
    }

    /**
     * Method sets the wash value
     * 
     * @param wash The wash value
     */
    public void setWash(int wash) {
        this.wash = wash;
    }

    /**
     * Method sets the wash value after sleep
     * 
     * @param wash The wash value
     */
    public void Wash(int wash) {
        if ((this.wash + wash) <= 0) {
            out.print("Your dog is very dirty!!!\n");
        } else {
            this.wash += wash;
        }
    }
}