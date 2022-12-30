package Herous;

import Armour.*;
import Weapons.*;


public class Archer extends Arrows{
    
    private RangedWeapons weapon = null;
    private LightweightArmor armor = null;

    public Archer(int position){
        super.setType("Archer");
        super.setHealth(100);
        super.setPosition(position);
        super.setStatus(true);
    }

    public RangedWeapons getWeapon(){return weapon;}
    public void setWeapon(RangedWeapons weapon){this.weapon = weapon;}

    public LightweightArmor getArmor(){return armor;}
    public void setArmor(LightweightArmor armor){this.armor = armor;}
 
}
