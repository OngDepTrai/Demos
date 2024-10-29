/*
Starting point for our OOP demo.  The starting point of all our other classes.

 */


public class Zoo {

    String name;
    int age;
    public Zoo(String name, int age){}

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




    public static void main(String[] args){
        Penguin birb = new Penguin("Billy", 2);
        RandomBird otherGuy = new RandomBird("Samsung", 4);
        //let's put all these calls into a method

        AvianDriver(birb, otherGuy);
    }
}