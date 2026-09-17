package abstractfactory;

public class NorwegianArmor implements Armor {
    @Override
    public void defend() {
        System.out.println("Viking armor blocks the hit.");
    }
}