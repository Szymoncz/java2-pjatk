//Program testujący zadanie 2
//Autor: Szymon Czudowski s26858
public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Arek", "Arkowski", "123456", 70, 4);
        Student student2 = new Student(null, "Borkowska", "654321", 30, 3);
        Student student3 = new Student("Anna", null, "987654", 40, 5);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

    }
}
