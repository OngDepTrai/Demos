/*
Starting point for our OOP demo.  The starting point of all our other classes.

 */


public class Zoo {
}



class DemoController{

    public static void main(String[] args){
        Penguin birb = new Penguin();
        RandomBird otherGuy = new RandomBird();

        birb.chirp();
        birb.flap();
        birb.eat();
        birb.eat("shrimp");
        System.out.println();
        otherGuy.setBirdType("Raven");
        otherGuy.eat();
        otherGuy.move();

    }
}