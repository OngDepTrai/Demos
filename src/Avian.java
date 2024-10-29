


public abstract class Avian extends Animal {
    abstract void chirp();
    abstract void flap();

    public Avian(String entityName, int entityAge){
        super(entityName,entityAge);
        this.name=entityName;
        this.age=entityAge;
    }

}

 class Penguin extends Avian implements lifeform{

     public Penguin(String entityName, int entityAge) {
         super(entityName, entityAge);
     }

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
        System.out.println("The Penguin opens its beak"+
                           " and emits a 'Crock!' ");
    }
    protected void flap(){
        System.out.println("The Penguin's flippers wiggle.");
    }
}

class RandomBird extends Avian implements lifeform {
    private String birdType;

    public RandomBird(String entityName, int entityAge) {
        super(entityName, entityAge);
    }

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
    public void eat(String food){
        System.out.println("The "+this.getBirdType()+" gobbles "+food);
    }
    public void sleep() {
        System.out.println("The "+this.getBirdType()+ " closes its eyes and sleeps. ");
    }

    @Override
    public void chirp() {
        System.out.println("The "+this.getBirdType()+"opens its beak and cries out.");
    }

    public void flap() {
        System.out.println("The "+this.getBirdType()+" spreads its wings" +
                           " and flaps them vigorously");
    }
}
