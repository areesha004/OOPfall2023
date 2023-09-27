package week_3;

public class Main {
    public static void main(String[] args) {
        Deck d1= new Deck();
//        System.out.println(d1.toString());
//
//         d1.shuffle();
        Cards player1[] = new Cards[13];
        Cards player2[] = new Cards[13];
        Cards player3[] = new Cards[13];
        Cards player4[] = new Cards[13];

        d1.distribute(player1,player2,player3,player4);

        System.out.println("Player 1's Cards:");
        for (Cards c1 : player1) {
            System.out.print(c1 );
        }

        System.out.println("\nPlayer 2's Cards:");
        for (Cards card : player2) {
            System.out.print(card + " ");
        }

        System.out.println("\nPlayer 3's Cards:");
        for (Cards card : player3) {
            System.out.print(card + " ");
        }

        System.out.println("\nPlayer 4's Cards:");
        for (Cards card : player4) {
            System.out.print(card + " ");
        }
    }
}
