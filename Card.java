public class Card {
    private int value;
    public static enum Suit{
        HEART("Hearts"), SPADE("Spades"), CLUB("Clubs"), DIAMOND("Diamond");
        String str;
        static Suit[] suits = Suit.values();
        
        Suit(String str){
            this.str = str;
        }
        public static Suit getSuitFromIndex(int i){
            return suits[i];
        }
    }
    
    private Suit suit;
    private final int ACE_LOW = 1;
    private final int JACK = 11;
    private final int QUEEN = 12;
    private final int KING = 13;
    private final int ACE_HIGH = 14;

    public Card(Suit suit, int value){
        this.suit = suit;
        this.value = value;
    }

    public void setValue(int value){
        this.value = value;
    }
    public void setSuit(Suit suit){
        this.suit = suit;
    }
    public String getSuit(){
        return this.suit.str;
    }
    public int getValue(){
        return value;
    }


    public String toString(){
        String stringVal = ""+ value;
        if(value > 10 || value == 1){
            switch(value){
                case ACE_LOW : stringVal = "Ace";break;
                case JACK : stringVal = "Jack";break;
                case QUEEN : stringVal = "Queen";break;
                case KING : stringVal = "King";break;
                case ACE_HIGH : stringVal = "Ace";break;
                default : stringVal = "ERROR";break;
            }
        }
        return stringVal + " of " + suit.str;
    }

}
