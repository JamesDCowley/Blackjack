import java.util.Scanner;

public class Blackjack{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Deck deck = new Deck();
        Hand player = new Hand();
        Hand comp = new Hand();
        int pMoney = 100;
        boolean isPlaying = true;
        boolean isBust = false;
        boolean blackjack = false;

        System.out.println("Welcome to Blackjack! Place your bets.\n");

        while(isPlaying){
            deck.generateDeck();
            deck.shuffle();
            int bet;
            //INPUT FOR BETS
            while(true){
                System.out.printf("MONEY: %d\nBet Amount:", pMoney);
                bet = Integer.parseInt(scan.nextLine());
                if(bet > pMoney || bet <= 0) System.out.println("\nBET AMOUNT INVALID!");
                else break;
            }

            pMoney -= bet;

            //Game loop
            while(!isBust){
                player.addCard(deck.removeCard());
                comp.addCard(deck.removeCard());
                
                System.out.println("\nPLAYER CARDS: " + player + "\nDEALER CARDS: " + comp);
                
                //input for hit or stand
                while(true){
                    String in;
                    System.out.println("\n1.HIT\n2.STAND");
                    in = scan.nextLine();
                    if(in.equals("1")) {player.addCard(deck.removeCard());break;}
                    else if(in.equals("2")) break;
                }

                int value = player.valueOfBJ();
                if(value > 21){isBust = true; System.out.println("BUST!");}
                if(value == 21) {blackjack = true; System.out.println("BLACKJACK!");break;}
            }

            //dealer's turn

        }
        
        
    }
}