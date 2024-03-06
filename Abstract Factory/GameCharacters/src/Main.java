//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CharacterFactory characterFactory;

        // String character = "Warrior";
        String character = "Mage";

        if (character.equals("Warrior")) {
            characterFactory = new WarriorFactory();
        }
        else {
            characterFactory = new MageFactory();
        }

        CharacterCreator c = new CharacterCreator(characterFactory);
        c.displayInfo();
    }
}