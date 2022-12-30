package Herous;

import Armour.BaseArmor;
import Interface.*;
import Weapons.BaseWeapon;

public abstract class BaseHerou implements DistanceCalculation, Atak, Info, Go {
    
    private String type;
    private int health;
    private int position; //В данном конкретном случае, когда предполагается поединок двух персонажей,
                          // нет смысла делать двумерное поле. Достаточно одной координаты
    
    private boolean status; //Состояние "жив или мертв"
    private int aktivity = 1; // Количество доступных действий на данном ходу. В нашем случае для простоты берем 1 -
                           // персонаж может или пойти на одно поле или один раз атаковать за ход. 

    protected BaseWeapon weapon = null;
    protected BaseArmor armor = null;

    public void setWeapon(BaseWeapon weapon) {this.weapon = weapon;}
    public void setArmor(BaseArmor armor) {this.armor = armor;}
                          
    public String getType(){return type;}
    public void setType(String type){this.type = type;}

    public int getHealth(){return health;}
    public void setHealth(int health){this.health = health;}

    public int getPosition(){return position;}
    public void setPosition(int position){this.position = position;}

    public boolean getStatus(){return status;}
    public void setStatus(boolean status){this.status = status;}

    public int getAktivity(){return aktivity;}
    public void setAktivity(int aktivity){this.aktivity = aktivity;}

    @Override
    public int battleDistance(BaseHerou enemy) {
        // TODO Auto-generated method stub
        return Math.abs(position - enemy.getPosition());      
    }
    
    @Override
    public void info() {
        // TODO Auto-generated method stub
        System.out.println("Pers " + getType() + ", health " + getHealth() + " , position " + getPosition());
    }

    /*
     * проверка условий для атаки
     */

     public boolean condition(BaseHerou pers) {
        if (Math.abs(getPosition()- pers.getPosition())<=weapon.getDistance()){
            return true;
        }
        return false;    
    }

    
}
