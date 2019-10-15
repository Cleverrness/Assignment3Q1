class FruitTest{
    public static void main(String args[]){
        Fruit f=new Fruit("kiwi","tart",1);
        f.eat();
        Fruit a=new Apple("apple", "sweet", 2);
        a.eat();
        Fruit o=new Orange("orange", "sweet-tart", 2);
        o.eat();
    }
}