/*
Starting point for our OOP demo.  The starting point of all our other classes.

 */
//Some interfaces to demo abstraction and multi-inheritance
interface guest {
    void payAdmission();
    void petAnimal();
    void complain();

}
interface lifeForm{
    void move();
    void eat();
    void sleep();
}

/*
Not best practice, did this to demo inheritance
We cannot use private for these fields since
the other classes will all be inheriting from
 */

public class Zoo {
    protected String name;
    protected int age;
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public Zoo(String name, int age){
        setName(name);
        setAge(age);
    }
}
class DemoController{

    public static void AvianDriver(Penguin birb, RandomBird otherGuy){
        birb.chirp();
        birb.flap();
        birb.eat();
        birb.eat("shrimp");
        System.out.println();
        otherGuy.setBirdType("Raven");
        otherGuy.eat();
        otherGuy.move();
        otherGuy.eat("beetle");
        otherGuy.sleep();
        System.out.println("This critter is called, '"+otherGuy.name+"' and he is "
                +otherGuy.age+" years old");
    }

    public static void VisitorDriver(Visitor guest){
        System.out.println();
        guest.payAdmission();
        guest.sleep();
    }



    public static void main(String[] args){
        Penguin birb = new Penguin("Billy", 2);
        RandomBird otherGuy = new RandomBird("Samsung", 4);
        Visitor newGuest = new Visitor("Khoa", 16);
        //let's put all these calls into a method

        AvianDriver(birb, otherGuy);
        VisitorDriver(newGuest);

    }
}