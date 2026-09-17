package abstractfactory;

public class NorwegianBlacksmithFactory implements BlacksmithFactory {
    @Override
    public Sword createSword() {
        return new NorwegianSword();
    }

    @Override
    public Armor createArmor() {
        return new NorwegianArmor();
    }

    @Override
    public Spear createSpear() {
        return new NorwegianSpear();
    }
}
