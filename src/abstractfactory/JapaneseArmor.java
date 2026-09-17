package abstractfactory;

public class JapaneseArmor implements Armor {
    @Override
    public void defend() {
        System.out.println("Samurai armor die :(.");
    }
}