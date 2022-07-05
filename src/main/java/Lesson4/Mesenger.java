package Lesson4;

public interface Mesenger {
    double pi = 3.14;

    default void sendMasseng() {
        System.out.println("Отправка смс (НЕ почта)");
    }

    void coll(int number);

}
