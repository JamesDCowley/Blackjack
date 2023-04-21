
public class Hand extends Pile{

    public void addCard(Card card){
        cards.add(card);
    }
    public int valueOf(){
        int total = 0;
        for(Card card : cards){
            total += card.getValue();
        }
        return total;
    }
    public int valueOfBJ(){
        int total = 0;
        for(Card card : cards){
            if(card.getValue() > 10) total += 10;
            else total += card.getValue();
        }
        return total;
    }

}
