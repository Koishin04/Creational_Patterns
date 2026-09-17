package abstractfactory;

public class JapaneseBlacksmithFactory implements BlacksmithFactory {
    @Override
    public Sword createSword() {
        return new JapaneseSword();
    }

    @Override
    public Armor createArmor() {
        return new JapaneseArmor();
    }

    @Override
    public Spear createSpear() {
        return new JapaneseSpear();
    }
}
