import java.util.ArrayList;

public class Pile {
    protected ArrayList<Card> cards;

    public Pile(){
        cards = new ArrayList<Card>();
    }

    public Card removeCard(int i){
        return cards.remove(i);
    }
    public Card removeCard(){
        return cards.remove(0);
    }

    public Card getCard(){
        return cards.get(0);
    }
    public Card getCard(int i){
        return cards.get(i);
    }

    public ArrayList<Card> getPile(){
        return cards;
    }

    public String toString(){
        return cards.toString();
    }
}
