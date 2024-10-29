/*

*/
import java.io.*;
//limbs, sound, add some other things
interface lifeform{
    void move();
    void eat();
    void sleep();
}

public class Animal extends Zoo {

    public Animal(String entityName, int entityAge){
        super(entityName, entityAge);
    }

}
