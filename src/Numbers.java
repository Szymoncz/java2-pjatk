// Autor: Szymon Czudowski s26858 (wsparcie: stackoverflow)
// Zadanie 5 - Zaimplementuj klasę Numbers. Dodaj konstruktor który przyjmuje trzy liczby typu integer.
// Dodaj metody:
// - sum(), zwraca sumę liczb;
// - average(), zwraca średnią arytmetyczną liczb;
// - min(), zwraca najmniejszą z liczb;
// - max(), zwraca największą z liczb;
// - geometric(), zwraca średnią geometryczną liczb; Przetestuj zaimplementowany program.
public class Numbers {
    private int num1, num2, num3;

    public Numbers(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public int sum() {
        return num1 + num2 + num3;
    }

    public double average() {
        return (double) sum() / 3;
    }

    public int min() {
        return Math.min(num1, Math.min(num2, num3));
    }

    public int max() {
        return Math.max(num1, Math.max(num2, num3));
    }

    public double geometric() {
        return Math.cbrt(num1 * num2 * num3);
    }
}
