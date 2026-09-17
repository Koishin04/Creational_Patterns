package abstractfactory;

public class Warrior {
    private final Sword sword;
    private final Armor armor;
    private final Spear spear;


    public Warrior(BlacksmithFactory factory) {
        this.sword = factory.createSword();
        this.armor = factory.createArmor();
        this.spear = factory.createSpear();
    }

    public void equipAndFight() {
        System.out.println("Warrior is ready for battle:");
        armor.defend();
        sword.attack();
        spear.thrust();
        System.out.println();
    }
}