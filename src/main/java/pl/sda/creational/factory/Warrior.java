package pl.sda.creational.factory;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import pl.sda.creational.singleton.SingletonLogger;

public class Warrior {
    private final String nickname;
    private int lvl;
    private Profession profession;
    private Weapon weapon;
    private final WeaponFactory weaponFactory;

    @Override
    public String toString() {
        return "Warrior{" +
                "nickname='" + nickname + '\'' +
                ", lvl=" + lvl +
                ", profession=" + profession +
                ", weapon=" + weapon +
                '}';
    }

    public Warrior(String nickname, int lvl, Profession profession) {
        this.nickname = nickname;
        this.lvl = lvl;
        weaponFactory = new WeaponFactory();
        changeProfession(profession);

    }

    public void changeProfession(Profession newProfession){
        profession = newProfession;
        weaponFactory.makeWeapon(newProfession, 29);
        SingletonLogger.getInstance().log("changing profession to " + newProfession);
    }


    }



