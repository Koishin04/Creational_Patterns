package factorymethod;

public abstract class Blacksmith {
    protected abstract Sword createSword();

    public void orderWeapon() {
        System.out.println("Processing...");
        Sword sword = createSword();
        sword.showDetails();
        System.out.println("Weapon is ready.\n");
    }
}