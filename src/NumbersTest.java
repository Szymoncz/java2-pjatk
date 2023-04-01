//Program testujący zadanie 5
//Autor: Szymon Czudowski s26858
public class NumbersTest {
    public static void main(String[] args) {
        Numbers numbers = new Numbers(5, 10, 15);
        System.out.println("Suma: " + numbers.sum());
        System.out.println("Średnia arytmetyczna: " + numbers.average());
        System.out.println("Minimalna liczba: " + numbers.min());
        System.out.println("Maksymalna liczba: " + numbers.max());
        System.out.println("Średnia geometryczna: " + numbers.geometric());
    }
}