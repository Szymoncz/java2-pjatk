//Autor: Szymon Czudowski s26858 (wsparcie stackoverflow)
// Zadanie 2 - Zaimplementuj klasę Student, do przechowywania imienia, nazwiska, numer indeksu i obecność
// (wyrażonej w procentach) oceny z POJ (typu int). Jeżeli podczas tworzenia obiektu nie zostało przekazane imię
// i nazwisko, pola powinny być ustawione wartością "Unknown". Dodaj odpowiednie metody set i get do wszystkich pól
// klasy. Jeżeli obecnocność jest mniejsza niż 50%, student powinien otrzymać ocenę 2. Przetestuj program, tworząc
// trzy różne obiekty klasy Student.

public class Student {
    private String firstName;
    private String lastName;
    private String indexNumber;
    private int attendance;
    private int gradePOJ;

    public Student(String firstName, String lastName, String indexNumber, int attendance, int gradePOJ) {
        this.firstName = firstName != null ? firstName : "Unknown";
        this.lastName = lastName != null ? lastName : "Unknown";
        this.indexNumber = indexNumber;
        this.attendance = attendance;
        this.gradePOJ = gradePOJ;

        if (attendance < 50) {
            this.gradePOJ = 2;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName != null ? firstName : "Unknown";
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName != null ? lastName : "Unknown";
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
        if (attendance < 50) {
            this.gradePOJ = 2;
        }
    }

    public int getGradePOJ() {
        return gradePOJ;
    }

    public void setGradePOJ(int gradePOJ) {
        this.gradePOJ = gradePOJ;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (indeks " + indexNumber + "), obecność: " + attendance + "%, ocena POJ: " + gradePOJ;
    }
}