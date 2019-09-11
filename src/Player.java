enum Strategies{
    C,O,T //1/1 for OO, 4/4 for CC, 5/2 for OC
}
public class Player {
    int name;
    Strategies strategy;
    int money;
    boolean betray;

    public void addMoney(int money){
        this.money += money;
    }
    public boolean isBetray() {
        return betray;
    }
    public void setBetray(boolean betray) {
        this.betray = betray;
    }
    public Strategies getStrategy() {
        return strategy;
    }
    public void setStrategy(Strategies strategy) {
        this.strategy = strategy;
    }
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    public int getName() {
        return name;
    }
    public void setName(int name) {
        this.name = name;
    }
    public Player(int name, int money, Strategies strategy) {
        this.name = name;
        this.money = money;
        this.strategy = strategy;
        if(strategy == Strategies.O){
            betray = true;
        }
        if(strategy == Strategies.C){
            betray = false;
        }
        if(strategy == Strategies.T){
            betray = false; //at first...
        }
    }
    public void applyStrategy(Player player1, Player player2){
        if(player1.getStrategy() == Strategies.T && player2.betray){
            player1.betray = true;
        }
        if(player1.getStrategy() == Strategies.T && !player2.betray){
            player1.betray = false;
        }
        if(player2.getStrategy() == Strategies.T && player1.betray){
            player2.betray = true;
        }
        if(player2.getStrategy() == Strategies.T && !player1.betray){
            player2.betray = false;
        }
    }
    public static void fight(Player player1, Player player2){ //Fight and modify money
        if(player1.betray && player2.betray){
            player1.addMoney(1);
            player2.addMoney(1);
        }
        if(player1.betray && !player2.betray){
            player1.addMoney(5);
            player2.addMoney(2);
        }
        if(player2.betray && !player1.betray){
            player1.addMoney(2);
            player2.addMoney(5);
        }
        if(!player1.betray && !player2.betray) {
            player1.addMoney(4);
            player2.addMoney(4);
        }
    }
    public static void whoWins(Player player1, Player player2){
        if(player1.getMoney() > player2.getMoney()){
            System.out.printf("%s strategy wins over %s strategy with %d money versus %d money \n", player1.getStrategy().name(), player2.getStrategy().name(), player1.getMoney(), player2.getMoney());
        }
        if(player2.getMoney() > player1.getMoney()){
            System.out.printf("%s strategy wins over %s strategy with %d money versus %d money \n", player2.getStrategy().name(), player1.getStrategy().name(), player2.getMoney(), player1.getMoney());
        }
        if(player2.getMoney() == player1.getMoney()){
            System.out.printf("%s strategy is equal to %s strategy with %d money each\n", player2.getStrategy().name(), player1.getStrategy().name(), player2.getMoney());
        }
    }
}

