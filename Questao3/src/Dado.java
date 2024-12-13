import java.util.Random;

public class Dado {
    public int jogarDado(){
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}
