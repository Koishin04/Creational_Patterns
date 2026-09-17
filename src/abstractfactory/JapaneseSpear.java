package abstractfactory;

public class JapaneseSpear implements Spear {
    @Override
    public void thrust() {
        System.out.println("Yari spear thrusts forward!");
    }
}