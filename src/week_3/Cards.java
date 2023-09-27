package week_3;

import java.util.Objects;

public class Cards {
    String suits;
    String ranks;
    Cards(String suits,String ranks){
        this.suits=suits;
        this.ranks=ranks;
    }

    //    public String getSuits() {
//        return suits;
//    }
//
//    public String getRanks() {
//        return ranks;
//    }
//    public boolean equals(Object o){
//        Cards c1=(Object o)c1;
//
//    }
    public String toString(){

        return String.format("%s of %s\n",ranks,suits);
    }

    Cards player1[] = new Cards[13];
    Cards player2[] = new Cards[13];
    Cards player3[] = new Cards[13];
    Cards player4[] = new Cards[13];


}
