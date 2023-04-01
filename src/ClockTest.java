//Program testujący zadanie 4
//Autor: Szymon Czudowski s26858
public class ClockTest {
    public static void main(String[] args) {
        Clock clock1 = new Clock();
        System.out.println(clock1); // [12:00:00]

        Clock clock2 = new Clock(23, 59, 59);
        System.out.println(clock2); // [23:59:59]

        Clock clock3 = new Clock(86400);
        System.out.println(clock3); // [00:00:00]

        clock1.tick();
        System.out.println(clock1); // [12:00:01]

        clock1.tickDown();
        System.out.println(clock1); // [12:00:00]

        clock2.setHours(12);
        clock2.setMinutes(30);
        clock2.setSeconds(15);
        System.out.println(clock2); // [12:30:15]
    }
}