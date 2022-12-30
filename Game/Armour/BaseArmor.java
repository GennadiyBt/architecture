package Armour;

public abstract class BaseArmor {

    private String type;
    private int protection;
    private String armorName;

    public String getName(){return armorName;}
    public void setName(String armorName){this.armorName = armorName;}

    public String getType(){return type;}
    public void setType(String type){this.type = type;}

    public int getProtection(){return protection;}
    public void setProtection(int protection){this.protection = protection;}
    
    
}
