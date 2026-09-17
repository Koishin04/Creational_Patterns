package factorymethod;

public class JapaneseBlacksmith extends Blacksmith {
    @Override
    protected Sword createSword() {
        return new JapaneseSword();
    }
}