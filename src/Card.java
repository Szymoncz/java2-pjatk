// Autor: Szymon Czudowski s26858 (wsparcie: stackoverflow)
// Zadanie 1 - Zaimplementuj klasę Card reprezentującą pojedynczą kartę do gry z talii kart.
// Klasa powinna przechowywać wartość i kolor: kier, karo, pik, trefl. W zadaniu użyj typu wyliczeniowego.
// Napisz program testujący, który stworzy trzy różne obiekty klasy Card.
public class Card {
    public enum Color {
        kier, karo, pik, trefl
    }
    public Color color;
    private int value;
    public Card(Color color, int value) {
        this.color = color;
        if ((value < 1) || (value > 13)) {
            throw new RuntimeException("Liczba karty musi być większa od 0 i mniejsza od 13");
        } else this.value = value;
    }
    public Card() {
    }
    public void setValue(int value) {
        if ((value < 1) || (value > 13)) {
            throw new RuntimeException("Liczba karty musi być większa od 0 i mniejsza od 13");
        } else this.value = value;
    }
    public void card_description() {
        System.out.println("Liczba karty to " + value + " i jest to " + color);
    }


}