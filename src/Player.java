enum Strategies{
    O,M,T
}
public class Player {
    int name;
    Strategies strategy;
    int money;

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
    }
}

