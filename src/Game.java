import java.util.Random;
public class Game extends Player {
    static int numPlayers = 6;
    public Game(int name, int money, Strategies strategy) {
        super(name, money, strategy);
    }
    public static void main(String[] args) {
        Player[] players = spawnPlayers(numPlayers);
        for(int i=0; i<numPlayers-1; i++){
            fight(players[i], players[i+1]);
            whoWins(players[i], players[i+1]);
        }
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
        return Strategies.values()[random.nextInt(Strategies.values().length)];
    }

}
