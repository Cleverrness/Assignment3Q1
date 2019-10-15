class FruitTest{
    public static void main(String args[]){
        Fruit f=new Fruit("kiwi","tart",1);
        f.eat();
        Fruit a=new Apple();
        a.eat();
        Fruit o=new Orange();
        o.eat();
        Fruit f2 = new Fruit();
        f2.eat();
    }
}