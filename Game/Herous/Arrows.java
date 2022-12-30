package Herous;

import Armour.LightweightArmor;
import Weapons.RangedWeapons;

/*
 * подкласс, который будет родительским для всех рейндж-классов
 */
public abstract class Arrows extends BaseHerou {

    public Arrows(){
        weapon = new RangedWeapons(){};
        armor = new LightweightArmor(){};
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
