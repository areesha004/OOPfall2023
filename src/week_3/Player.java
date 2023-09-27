package week_3;

public class Player {
    String player;
    int score;
    Player(String player,int score){
        this.player=player;
        this.score=score;

    }
    public String toString(){
        return String.format("palyers name is %s\n score is %d",player,score);
    }
    //player
}

