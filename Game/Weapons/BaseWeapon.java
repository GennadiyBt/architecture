package Weapons;

public abstract class BaseWeapon {
    
    private String type;
    private String weaponName;
    private int damage;
    private int distance = 1;

    public String getName(){return weaponName;}
    public void setName(String weaponName){this.weaponName = weaponName;}

    public String getType(){return type;}
    public void setType(String type){this.type = type;}

    public int getDamage(){return damage;}
    public void setDamage(int damage){this.damage = damage;}

    public void setDistance(int distance) {this.distance = distance;}
    public int getDistance() {return distance;}
}
