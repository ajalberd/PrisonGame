import java.util.Random;
public class Game {
    public static void main(String[] args) {
        Player[] players = spawnPlayers(100);
    }
    public static Player[] spawnPlayers(int num){
        Player[] arrP = new Player[num];
        for (int i = 0; i < num; i++) {
            arrP[i] = new Player(i, 0, randStrategy());
        }
        return arrP;
    }
    public static Strategies randStrategy(){
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }

}
