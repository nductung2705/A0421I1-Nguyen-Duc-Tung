package b7_abstractclass_interface.thuchanh.animal_edible;

public class Main {
    public static void main(String[] args) {
        Tiger smallTiger=new Tiger();
        smallTiger.makeSound();
        System.out.println( smallTiger.makeSound());

        System.out.println("----------");

        Chicken bigChicken=new Chicken() ;
        Edible edibler=(Chicken) bigChicken;
        System.out.println(edibler.howToEat());

        Fruit apple=new Fruit() ;
        System.out.println(apple.howToEat());
    }


}
