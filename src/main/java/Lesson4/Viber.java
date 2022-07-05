package Lesson4;

public class Viber implements Mesenger, Mail {

    @Override
    public void sendMasseng() {

    }

    @Override
    public void getMassages() {

    }

    @Override
    public void coll(int number) {
        System.out.println("Звоним через вайбер");
    }
}
