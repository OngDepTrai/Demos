public class Visitor extends Zoo implements guest, lifeForm {

    public Visitor(String name, int age) {
        super(name, age);
    }
     private boolean isAdult(int age){
         return age >= 18;
     }

    public void payAdmission(){
         System.out.println("Hello, one ticket please "+
                            "I am "+getAge()+" years old.");
         if(this.isAdult(getAge())){
          System.out.println("Adults must pay 50.00 dollars.");
         }else{
          System.out.println("Children will pay 25.00 dollars.");
         }
    }
    public void petAnimal(){
        System.out.println("Oh they have mini-goats, I want to pet them!");
    }

    public void complain() {
        System.out.println("The llamas spat at me!");
    }

    public void eat(){
        System.out.println("I'm hungry, let's see what they have to eat"
                           +" at the restaurant.");
    }

    public void move(){
        System.out.println("Time to check out the next animal enclosure.");
    }
    @Override
    public void sleep(){
       System.out.println(getName()+" is getting sleepy " +
                          "time to go home!");
    }

}
