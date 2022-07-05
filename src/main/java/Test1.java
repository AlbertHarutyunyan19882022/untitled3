public class Test1 {
    public static void main(String[] args) {
     Car car = new Car(250);
     car.setModel("Мерседес S500");
     car.setMaxSpeed(250);
     car.gas();


     CarSedan carSedan = new CarSedan(200, 63,4 );
     carSedan.setModel("Фольсваген Поло");
     carSedan.setMaxSpeed(250);
     carSedan.gas();
     carSedan.autoOpenTrunk();

     Teslo electroCar = new Teslo(203);
     electroCar.getChargeV(500);
     electroCar.setModel("T350");
     electroCar.getSite("С лево");

    }
}
