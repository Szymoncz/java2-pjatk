// Autor: Szymon Czudowski s26858 (wsparcie: stackoverflow)
// Zadanie 4 - Zaimplementuj klasę Clock. Klasa zawierać będzie pola: hours, minutes, seconds. Zmienna hours
// przyjmuje wartości z zakresu 0-23, minutes z zakresu 0-59, seconds 0-59. Dodaj trzy konstruktor: - domyślny -
// inicjalizuje godzinę 12:00:00; - konstruktor zawierający trzy parametry: hours, minutes, seconds, - konstruktor
// z jednym parametrem - czas w sekundach licząc od północy jest konwertowany do pól: hours, minutes, seconds.
// Dodaj metody: - getHours(), getMinutes(), getSeconds(), bez parametrów, które zwracają odpowiednie wartości;
// - setHours(), setMinutes(), setSeconds(), z jednym parametrem, który ustawia odpowiednie wartości; - tick(), bez
// parametrów, która inkrementuje wartość second o jeden. Przykład: wartość 00:00:01 zamieni się na 00:00:02;
// wartość 00:59:59 zmieni się na 01:00:00; - tickDown(), zmniejsza wartość sekund o jedno; analogiczna do tick();
// - toString(), bez parametrów, zwraca reprezentację obiektu w postaci "[hh-mm-ss]", uzupełnioną o nieznaczące zera,
// na przykład: "[03:12:56]". Przetestuj zaimplementowany program.

public class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    public Clock() {
        this(12, 0, 0);
    }

    public Clock(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public Clock(int secondsSinceMidnight) {
        int hours = secondsSinceMidnight / 3600 % 24;
        int minutes = secondsSinceMidnight % 3600 / 60;
        int seconds = secondsSinceMidnight % 60;
        this.setHours(hours);
        this.setMinutes(minutes);
        this.setSeconds(seconds);
    }

    public int getHours() {
        return this.hours;
    }

    public void setHours(int hours) {
        if (hours < 0 || hours > 23) {
            throw new IllegalArgumentException("Hours must be between 0 and 23");
        }
        this.hours = hours;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes < 0 || minutes > 59) {
            throw new IllegalArgumentException("Minutes must be between 0 and 59");
        }
        this.minutes = minutes;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds < 0 || seconds > 59) {
            throw new IllegalArgumentException("Seconds must be between 0 and 59");
        }
        this.seconds = seconds;
    }

    public void tick() {
        if (this.seconds == 59) {
            if (this.minutes == 59) {
                if (this.hours == 23) {
                    this.hours = 0;
                } else {
                    this.hours++;
                }
                this.minutes = 0;
            } else {
                this.minutes++;
            }
            this.seconds = 0;
        } else {
            this.seconds++;
        }
    }

    public void tickDown() {
        if (this.seconds == 0) {
            if (this.minutes == 0) {
                if (this.hours == 0) {
                    this.hours = 23;
                } else {
                    this.hours--;
                }
                this.minutes = 59;
            } else {
                this.minutes--;
            }
            this.seconds = 59;
        } else {
            this.seconds--;
        }
    }

    @Override
    public String toString() {
        return String.format("[%02d:%02d:%02d]", this.hours, this.minutes, this.seconds);
    }
}