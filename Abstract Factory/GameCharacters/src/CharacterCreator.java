public class CharacterCreator {
    private CharacterFactory factory;

    CharacterCreator(CharacterFactory factory) { this.factory = factory; }

    public void displayInfo() {
        this.factory.createCharacter().displayInfo();
        this.factory.createWeapon().displayInfo();
        this.factory.createClothes().displayInfo();
    }
}
