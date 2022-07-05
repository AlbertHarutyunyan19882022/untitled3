package Lesson4;

public class General {
    public static void main(String[] args) {
        Viber viber = new Viber();
        viber.getMassages();
        viber.coll(123);

        Telegram telegram = new Telegram();
        telegram.coll(123);
    }
}
