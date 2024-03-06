public class WarriorFactory implements CharacterFactory {

    @Override
    public Character createCharacter() {
        return new Warrior();
    }

    @Override
    public Weapon createWeapon() {
        return new Sword();
    }

    @Override
    public Clothes createClothes() {
        return new Armor();
    }
}
