package factorymethod;

public class NorwegianSword implements Sword {
    @Override
    public void showDetails() {
        System.out.println("This is a Norway Sword.");
    }
}