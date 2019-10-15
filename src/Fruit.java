public class Fruit {
    String name;
    String taste;
    double size;

    //default constructor with default values, used for the extended classes which wont accept an input
    public Fruit(){
        name = "banana";
        taste = "sweet";
        size = 3;
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




