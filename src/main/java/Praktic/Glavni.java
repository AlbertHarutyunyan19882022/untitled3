package Praktic;

public class Glavni {
    public static void main(String[] args) {

        Student st1 = new Student("Вова", 19);
        Student st2 = new Student("Маша", 20);
        st2.Privet();

        Gruupa student = new Gruupa(123, "Машка", 20);
        student.Privet();

    }
}