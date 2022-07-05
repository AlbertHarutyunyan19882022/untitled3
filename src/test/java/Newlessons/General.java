package Newlessons;

public class General {
    public static void main(String[] args) {
        Car lada = new Car(MogelCar.LADA, 1.5, TipeCuz.SEDAN);
        Car.Motor ladaMotor = lada. new Motor(5);
        ladaMotor.aboutMotor();

        Payment payment1 = new Payment("макароны", 5.5);
        Payment payment2 = new Payment("iPhone", 5000);
        Payment payment3 = new Payment("Кетчуп", 3);

        Payment.statistic(payment1,payment2,payment3);

    }
}
