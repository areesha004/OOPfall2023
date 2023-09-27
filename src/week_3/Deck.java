package week_3;

import java.util.Random;
public class Deck {
    Cards[] c1=new Cards[55];
    String suits[]={"clubs","diamonds","hearts","spades"};
    String ranks[]={"ace","king","queen","jack","ten","nine","eight","seven","six","five","four","three","two"};

    Deck() {

        int counter=0;
        for(int i=0;i<=3;i++){
            for(int j=0;j<=12;j++){
                counter++;
                c1[counter]=new Cards (suits[i],ranks[j]);
            }
        }

    }
    StringBuilder str =new StringBuilder();

    public String toString(){

        for(int i=0;i<=52;i++){
            str.append(c1[i]);
        }
        return str.toString();
    }
    Random r1=new Random();
    void shuffle(){
        for(int i=0;i<=52;i++){
            int j=  r1.nextInt(52);

            System.out.println(c1[j]);

        }

    }

    void distribute(Cards player1[],Cards player2[],Cards player3[],Cards player4[]) {
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;

        for (int i = 51; i >= 0; i--) { // Start from 51
            if (i % 4 == 0) {
                player1[counter1++] = c1[i];
            } else if (i % 4 == 1) {
                player2[counter2++] =c1[i];
            } else if (i % 4 == 2) {
                player3[counter3++] = c1[i];
            } else if (i % 4 == 3) {
                player4[counter4++] =c1[i];
            }
        }
    }


}
