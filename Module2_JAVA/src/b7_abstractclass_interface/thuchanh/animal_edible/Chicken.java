package b7_abstractclass_interface.thuchanh.animal_edible;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Tui la ga";
    }

    @Override
    public String howToEat() {
        return "Nau la chanh";
    }
}
