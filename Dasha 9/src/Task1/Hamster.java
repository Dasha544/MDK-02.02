package Task1;

public class Hamster extends Pet {

    public Hamster() {
        super("Пи");
        setPawsCount(4);
    }

    public void hideFood() {
        System.out.println("Вся еда — в щёчках!");
    }
}