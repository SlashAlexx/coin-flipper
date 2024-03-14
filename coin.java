import java.util.Random;

public class coin {
    private boolean value;
    private Random rand;

    public coin(){
        value = false;
        rand = new Random();
    }

    public boolean GetValue(){
        return value;
    }

    public void FlipCoin(){
        value = rand.nextBoolean();
    }
}
