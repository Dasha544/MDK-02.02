package Task1;

public class Dog extends Pet {

    public Dog() {
        super("Гав");
        setPawsCount(4);
    }

    public void bringStick() {
        System.out.println("Принёс палочку, как хороший мальчик!");
    }
}