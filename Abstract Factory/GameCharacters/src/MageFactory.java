public class MageFactory implements CharacterFactory{
    @Override
    public Character createCharacter() {
        return new Mage();
    }

    @Override
    public Weapon createWeapon() {
        return new Staff();
    }

    @Override
    public Clothes createClothes() {
        return new Robe();
    }
}
