import java.util.Scanner;

import Armour.*;
import Herous.*;
import Weapons.*;

public abstract class Metods {
    
    public static Object game;



    public Metods(){}

    /* 
     * метод для проверки жив ли персонаж или убит и соответствующего изменения статуса
    */
    public static void live(BaseHerou pers) {

        if (pers.getHealth()<=0) {pers.setStatus(false);}

    }

    /*
     * Общий метод. Можно это все прописать в main, но в целях инкапсуляции оставим здесь.
     */

    public static void game() {
        /*
         * создание персонажей оружия и брони
         */
        BaseHerou archer = new Archer(1);
        BaseHerou knight = new Knight(8);
        Longbow bow = new Longbow();
        Claymore sword = new Claymore();
        LightweightArmor hauberk = new Hauberk();
        HeavyArmor armour = new GothicArmor();

        /*
         * одеваем и вооружаем
         */
        archer.setArmor(hauberk);
        archer.setWeapon(bow);
        knight.setArmor(armour);
        knight.setWeapon(sword);

        /*
         * собственно бой
         */
        battle(archer, knight);
    }

    

    public static void battle(BaseHerou warrior1, BaseHerou warrior2){
        int step = 1;
        if (step == 1) {
            System.out.println("First step");
        } else {
            System.out.println("Step:" + Integer.toString(step));
        }
        System.out.println("--------------------------------------------");
        warrior1.info();
        warrior2.info();
        System.out.println("--------------------------------------------");
        
        Scanner in = new Scanner(System.in);
        while (true) {
            step++;
            String txt = in.nextLine();
            if (txt.equals("")) { 
                if (warrior1.condition(warrior2)){
                    warrior2.setHealth(warrior2.getHealth() - warrior1.atak(warrior2));
                    live(warrior2);
                }
                else {warrior1.go(warrior2);}
                
                if (!warrior2.getStatus()){break;}

                if (warrior2.condition(warrior1)){
                    warrior1.setHealth(warrior1.getHealth() - warrior2.atak(warrior1));
                    live(warrior1);
                }
                else {warrior2.go(warrior1);}
                
                if (!warrior1.getStatus()){break;}
                
                System.out.println("");
                System.out.println("Step " + step);
            }
            if (txt.equals("quit")) {
                break;
            }
            System.out.println("--------------------------------------------");
            warrior1.info();
            warrior2.info();
            System.out.println("--------------------------------------------");
        }
        System.out.println("Game over");
        if (warrior1.getStatus()){
            System.out.println(warrior1.getType()+ " win!");
        }
        else {System.out.println(warrior2.getType()+ " win!");}
    }
}
