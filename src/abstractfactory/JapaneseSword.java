package abstractfactory;

public class JapaneseSword implements Sword {
    @Override
    public void attack() {
        System.out.println("Katanaaa!");
    }
}