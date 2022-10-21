package KI_35.Dzoban.lab3;
import java.io.*;
import static java.lang.System.*;
/** Class Dog implements your own pet
 *
 * @author Mykola Dzoban
 * @version 1.0.1
 * @since version 1.0
 *
 */
public class Dog {
    public static char[] noOfObjects;
    private Features fea;
    private Opportunities opps;
    private Walk walk;

    private PrintWriter fout;

    static public int numOfOb = 0;
    /**
     * Constructor
     * @throws FileNotFoundException check file existing
     */
    public Dog() throws FileNotFoundException
    {
        fea = new Features();
        opps = new Opportunities();
        walk = new Walk();
        fout = new PrintWriter(new File("Dog.txt"));
    }

    /**
     * Method makeDog implements making your own pet
     * @param hp The health value
     * @param en The energy value
     * @param age The age value
     */
    public void makeDog(int hp, int en, int age){
        fea.setHealth(hp);
        fea.setEnergy(en);
        fea.setAge(age);
        fout.print("Dog health: "+fea.getHealth()+"\n");
        fout.print("Dog energy: "+fea.getEnergy()+"\n");
        fout.print("Dog age: "+fea.getAge()+"\n");
        fout.flush();
        if (age > 3) {
            ++numOfOb;
        }
    }

    /**
     * Method aboutDog shows information about dog
     */
    public void aboutDog(){
        out.print("Dog health: "+fea.getHealth()+"\n");
        out.print("Dog energy: "+fea.getEnergy()+"\n");
        out.print("Dog age: "+fea.getAge()+"\n");
    }

    /**
     * Method makeAgeBigger implements rising age of dog
     * @param age
     */
    public void makeAgeBigger(int age){
        fea.changeAgeToGrow(age);
        out.print("Dog grows: "+fea.getAge()+"\n");
        fout.print("Dog grows: "+fea.getAge()+"\n");
        fout.flush();
    }

    /**
     * Method oppDog implements dog's opportunities
     * @param hun The hungry value
     * @param dream The dream value
     * @param wash The purity value
     */
    public void oppDog(int hun, int dream, int wash){
        opps.setHunger(hun);
        opps.setDream(dream);
        opps.setWash(wash);
        fout.print("Hunger: "+opps.getHunger()+"\n");
        fout.print("Dream: "+opps.getDream()+"\n");
        fout.print("Purity: "+opps.getWash()+"\n");
        fout.flush();
    }

    /**
     * Method dogOpp shows information about dog's opportunities
     */
    public void dogOpp(){
        out.print("Hunger: "+opps.getHunger()+"\n");
        out.print("Dream: "+opps.getDream()+"\n");
        out.print("Purity: "+opps.getWash()+"\n");
    }

    /**
     * Method feedDog implements the possibility to feed dog
     * @param food The food value
     */
    public void feedDog(int food){
        opps.Feed(food);
        fout.print("Dog's hunger: " + opps.getHunger() + "\n");
        fout.flush();
    }

    /**
     * Method sleepDog implements the possibility to dog to sleep
     * @param hour The hour of dream value
     */
    public void sleepDog(int hour){
        opps.Sleep(hour);
        fout.print("Dog's dream: " + opps.getDream() + "\n");
        fout.flush();
    }

    /**
     * Method washDog implements the possibility to make dog clear
     * @param wash The purity value
     */
    public void washDog(int wash){
        opps.Wash(wash);
        fout.print("Dog's purity: " + opps.getWash() + "\n");
        fout.flush();
    }

    /**
     * Method moveDog implements dog's moving
     * @param xPos The X coordinate value
     */
    public void moveDog(int xPos){
        walk.setXCoordinate(xPos);
        fout.print("New dog position: " + walk.getXCoordinate() + "\n");
        fout.flush();
    }

    /**
     * Method getDogPosition returns dog's position
     * @return X coordinate value
     */
    public int getDogPosition(){
        return walk.getXCoordinate();
    }

    /**
     * Method walkLeftWithDog implements the possibility to move dog left
     * @param xPos The X coordinate value
     */
    public void walkLeftWithDog(int xPos){
        walk.walkLeft(xPos);
        out.print("Walk left position: " + walk.getXCoordinate() + "\n");
        fout.print("Walk left position: " + walk.getXCoordinate() + "\n");
        fout.flush();
    }
    /**
     * Method walkRightWithDog implements the possibility to move dog right
     * @param xPos The X coordinate value
     */
    public void walkRightWithDog(int xPos){
        walk.walkRight(xPos);
        out.print("Walk right position: " + walk.getXCoordinate() + "\n");
        fout.print("Walk right position: " + walk.getXCoordinate() + "\n");
        fout.flush();
    }

    /**
     * Method dogJump implements the possibility for dog to jump
     * @param xPos The X coordinate value
     * @param yPos The Y coordinate value
     */
    public void dogJump(int xPos, int yPos){
        walk.jump(xPos,yPos);
        out.print("Dog jump on: " + walk.getXCoordinate() + ", " + walk.getYCoordinate()+"\n");
        fout.print("Dog jump on: " + walk.getXCoordinate() + ", " + walk.getYCoordinate()+"\n");
        fout.flush();
    }
    /**
     * Method close file
     */
    public void dis()
    {
        fout.close();
    }
}
