//Autor: Szymon Czudowski s26858 (wsparcie stackoverflow)
// Zadanie 3 - Zaimplementuj klasę MyDate, która przechowuje informację: month (typu int), day(typu int) i year
// (type int). Klasa powinna zawierać konstruktor, który inicjalizuje zmienne, sprawdzając poprawność zakresów
// (day 0-31, month 0-12, year 1990-2050). Zaimplementuj methody set i get dla wszystkich pól. Dodaj metodę
// displayDate, która wyświetli pola z uwzględnieniem zer nieznaczących oddzielone znakiem "/", np 21/03/2051.
// Przetestuj zaimplementowaną klasę.
public class Date {
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year) {
        if (month < 1 || month > 12 || day < 1 || day > 31 || year < 1990 || year > 2050) {
            throw new IllegalArgumentException("Niepoprawna data");
        }
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Niepoprawny miesiąc");
        }
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day < 1 || day > 31) {
            throw new IllegalArgumentException("Niepoprawny dzień");
        }
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1990 || year > 2050) {
            throw new IllegalArgumentException("Niepoprawny rok");
        }
        this.year = year;
    }

    public void displayDate() {
        System.out.printf("%02d/%02d/%04d", month, day, year);
    }
}
