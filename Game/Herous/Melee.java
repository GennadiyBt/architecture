package Herous;

import Armour.HeavyArmor;
import Weapons.MeleeWeapons;

/*
 * подкласс, который будет родительским для всех мили-классов
 */
public abstract class Melee extends BaseHerou {

    public Melee(){
        weapon = new MeleeWeapons(){};
        armor = new HeavyArmor(){};
    }
    @Override
    public void go(BaseHerou enemy) {
        // TODO Auto-generated method stub
        if (getPosition() > enemy.getPosition()){setPosition(getPosition() - 1);}
        else {setPosition(getPosition() + 1);}
    }
    
    @Override
    public int atak(BaseHerou pers) {
        // TODO Auto-generated method stub
        return weapon.getDamage() - pers.armor.getProtection();
    }
}
