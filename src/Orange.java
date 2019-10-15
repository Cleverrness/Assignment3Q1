public class Orange extends Fruit{
    public Orange(){
        this.name = "orange";
        this.taste = "sweet-tart";
        this.size = 2;
    }
    public void eat(){
        System.out.println("This is a " + name + " and it has a " + taste + " taste.");
    }
}