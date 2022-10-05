package dog_lab3;
/** Class Features implements the features of the pet
 *
 * @author Mykola Dzoban
 * @version 1.0.1
 * @since version 1.0
 *
 */
public class Features {
    //
    private int health, energy, age;

    /**
     * Constructor
     */
    public Features(){
        health = 0;
        energy = 0;
        age = 0;
    }
    /**
     * Method returns the health value
     * @return The health value
     */
    public int getHealth(){
        return health;
    }
    /**
     * Method returns the energy value
     * @return The energy value
     */
    public int getEnergy(){
        return energy;
    }

    /**
     * Method returns the age value
     * @return The age value
     */
    public int getAge() {
        return age;
    }
    /**
     * Method sets the health value
     * @param hp The health value
     */
    public void setHealth(int hp){
        this.health = hp;
    }
    /**
     * Method sets the energy value
     * @param energy The energy value
     */
    public void setEnergy(int energy) {
        this.energy = energy;
    }

    /**
     * Method sets the age value
     * @param age The age value
     */
    public void setAge(int age) {
        this.age = age;
    }
    /**
     * Method sets the age value after growing
     * @param age The age value
     */
    public void changeAgeToGrow(int age){
        this.age += age;
    }

}
