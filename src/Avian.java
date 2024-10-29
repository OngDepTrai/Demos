


public abstract class Avian extends Animal {
    abstract void chirp();
    abstract void flap();
}


 class Penguin extends Avian implements lifeform{

    public void move(){
        System.out.println("The Penguin jumps into the water " +
                "and swims gracefully");
    }
    public void eat(){
        System.out.println("The Penguin gobbles the fish.");
    }
    public void eat(String food){
        System.out.println("The Penguin gobbles "+food);
    }
    public void sleep(){
        System.out.println("The Penguin jumps out of the water" +
                " and goes to her nest.");
    }
    @Override
    protected void chirp(){
        System.out.println("Crock!");
    }
    protected void flap(){
        System.out.println("The flippers wiggle.");
    }
}

class RandomBird extends Avian implements lifeform {
    private String birdType;

    public void setBirdType(String birdType) {
        this.birdType = birdType;
    }

    public String getBirdType() {
        return birdType;
    } //getter for "wildcard" bird

    @Override
    public void move() {
        System.out.println("The "+this.getBirdType()+" runs around");
    }
    public void eat() {
        System.out.println("The "+this.getBirdType()+" eats the food.");
    }
    public void sleep() {

    }

    @Override
    public void chirp() {

    }

    public void flap() {

    }
}
