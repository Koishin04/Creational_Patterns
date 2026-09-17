package abstractfactory;

public class NorwegianSpear implements Spear {
    @Override
    public void thrust() {
        System.out.println("Viking spear thrusts forward!");
    }
}