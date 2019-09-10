import java.util.Random;
public class Rules {
    public static void main(String[] args) {

    }
    public int fight(Player player1, Player player2){

    }
    public Player[] spawnPlayers(int num){
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
