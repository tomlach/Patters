package pl.sda.creational.factory;

public class WeaponFactory {

    public Weapon makeWeapon(Profession profession, int demage) {
        switch (profession){
            case ARCHER:
                return new Bow(demage);
            case SWORDSMAN:
                return new Sword(demage);
            case WIZARD:
                return new Wand(demage);
                default:
                    throw new IllegalStateException("nie ma takiej broni");
        }
//        if (profession == Profession.ARCHER) {
//           return new Bow(demage);
//        }
//        else if (profession == Profession.SWORDSMAN){
//            return new Sword(demage);
//        }
//        else if (profession == Profession.WIZARD){
//            return new Wand(demage);
//        }
//        else {
//            throw new IllegalStateException("nie ma takiej broni");
//        }

    }
}
