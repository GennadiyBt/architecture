package Herous;

public class Knight extends Melee {

    public Knight(int position){
        super.setType("Knight");
        super.setHealth(100);
        super.setPosition(position);
        super.setStatus(true);
    }

}
