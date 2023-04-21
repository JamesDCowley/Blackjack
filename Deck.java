import java.util.Collections;
public class Deck extends Pile{

    public Deck(){
        generateDeck();
    }
    public void shuffle(){
        Collections.shuffle(cards);
    }
    public void generateDeck(){
        cards.clear();
        for(int i = 0; i < 4; i++){
            for(int j = 1; j < 14; j++){
                cards.add(new Card(Card.Suit.getSuitFromIndex(i), j));
            }
        }
    }
    
}
