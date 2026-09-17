package factorymethod;

public class NorwegianBlacksmith extends Blacksmith {
    @Override
    protected Sword createSword() {
        return new NorwegianSword();
    }
}