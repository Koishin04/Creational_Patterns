package factorymethod;

public class JapaneseSword implements Sword {
    @Override
    public void showDetails() {
        System.out.println("This is Japanese Katana.");
    }
}