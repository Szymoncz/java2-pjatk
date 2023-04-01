//Program testujący zadanie 1
//Autor: Szymon Czudowski s26858
public class CardTest {
    public static void main(String[] args) {
        Card card1 = new Card();
        card1.setValue(1);
        card1.color = Card.Color.pik;

        Card card2 = new Card();
        card2.setValue(13);
        card2.color = Card.Color.kier;

        Card card3 = new Card(Card.Color.trefl, 13);

        card1.card_description();
        card2.card_description();
        card3.card_description();
    }
}