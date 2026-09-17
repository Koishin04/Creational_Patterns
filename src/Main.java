
public class Main {
    public static void main(String[] args) {
        System.out.println("--- PART A: Factory Method---");
        
        factorymethod.Blacksmith japaneseSmith = new factorymethod.JapaneseBlacksmith();
        japaneseSmith.orderWeapon();

        factorymethod.Blacksmith norwegianSmith = new factorymethod.NorwegianBlacksmith();
        norwegianSmith.orderWeapon();


        System.out.println("--- PART B: Abstract Factory---");
        
        
        abstractfactory.BlacksmithFactory factory;
        
        String region = "Norway"; 

        if (region.equals("Japan")) {
            factory = new abstractfactory.JapaneseBlacksmithFactory();
        } else {
            factory = new abstractfactory.NorwegianBlacksmithFactory();
        }

        abstractfactory.Warrior warrior = new abstractfactory.Warrior(factory);
        warrior.equipAndFight();
    }
}