package week4.MaceraOyunu;

import java.util.Random;

public class Snake extends Obstacle{

    public Snake() {

        super(4,"Yılan",randomDamage(),12,0);

    }
    public static int randomDamage(){
        Random rand = new Random();
        return rand.nextInt(3,7) ;
    }

}
