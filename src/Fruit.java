public class Fruit {
    String name;
    String taste;
    double size;

    public Fruit(){

    }

    public Fruit(String name, String taste, double size){
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    public void eat(){
        System.out.println("This is a " + name + " and it has a " + taste + " taste.");
    }
}




