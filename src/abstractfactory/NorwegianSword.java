package abstractfactory;

public class NorwegianSword implements Sword {
    @Override
    public void attack() {
        System.out.println("Viking broadsword slash!");
    }
}