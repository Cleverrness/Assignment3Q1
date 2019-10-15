public class Apple extends Fruit{
    public Apple(){
        this.name = "apple";
        this.taste= "sweet";
        this.size = 2;
    }


    public void eat(){
        System.out.println("This is a " + name + " and it has a " + taste + " taste.");
    }
}